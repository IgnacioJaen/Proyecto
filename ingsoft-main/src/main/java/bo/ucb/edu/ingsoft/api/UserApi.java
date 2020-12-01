package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.UserBl;

import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.model.User;

import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/user")
public class UserApi {
    private UserBl userBl;

    //Constructor de la clase UserApi recibe un parametro de tipo UserBl
    @Autowired
    public UserApi(UserBl userBl) {
        this.userBl = userBl;
    }

    //Metodo que obtiene un usuario por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User findUserById(@RequestBody User user, HttpServletRequest request) {

        return userBl.findUserById(user);
    }

    //Metodo que obtiene un usuario por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo cliente
    @RequestMapping(value = "/userRequest", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserRequest findAccountTypeById(@RequestParam Integer userId, HttpServletRequest request) {

        return userBl.findUserReqById(userId);
    }

    //Inicio de sesion
    @RequestMapping(value = "/userRequest/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer findUserByEmailPassword(@RequestParam String email, @RequestParam String password, HttpServletRequest request) {

        return userBl.findUserByEmailPassword(email, password);
    }

    //Metodo que agrega un usuario a traves del requestMethod PUT
    @RequestMapping(value = "/post", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User insertUser(@RequestBody User user, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        userBl.insertUser(user,transaction);
        return  user;
    }

    //Metodo que actualiza un usuario a traves del requestMethod DELETE es decir cambia el status a 0
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public User updateUser(@RequestBody User user, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        userBl.updateUser(user,transaction);
        return  user;
    }

    //Metodo que elimina un usuario a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public User deleteUser(@RequestBody User user, HttpServletRequest request) {
        return userBl.deleteUser(user);
    }


}
