package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.UserTypeBl;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.UserType;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/userType")
public class UserTypeApi {

    private UserTypeBl userTypeBl;

    //Constructor de la clase UserTypeApi recibe un parametro de tipo UserTypeBl
    @Autowired
    public UserTypeApi(UserTypeBl userTypeBl) {
        this.userTypeBl = userTypeBl;
    }

    //Metodo que obtiene un tipo de usuario usuario por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserType findUserTypeById(@RequestBody UserType userType, HttpServletRequest request) {

        return userTypeBl.findUserTypeById(userType);
    }

    //Metodo que agrega un tipo de usuario a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserType insertUserType(@RequestBody UserType userType, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        userTypeBl.insertUserType(userType,transaction);
        return  userType;

    }

    //Metodo que actualiza un tipo de usuario a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserType updateUserType(@RequestBody UserType userType, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        userTypeBl.updateUserType(userType,transaction);
        return  userType;
    }

    //Metodo que elimina un tipo de usuario a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserType deleteUserType(@RequestBody UserType userType, HttpServletRequest request) {
        return userTypeBl.deleteUserType    (userType);
    }
}
