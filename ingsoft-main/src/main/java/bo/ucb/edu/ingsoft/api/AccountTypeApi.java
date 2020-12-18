package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.AccountTypeBl;
import bo.ucb.edu.ingsoft.dto.AccountTypeRequest;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.AccountType;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/accountType")
public class AccountTypeApi {
    private AccountTypeBl accountTypeBl;

    @RequestMapping(value = "/userTypeById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String findUserTypeById(@RequestParam Integer userId, HttpServletRequest request) {
        return accountTypeBl.findUserTypeById(userId);
    }

    //Constructor de la clase AccountTypeApi recibe un parametro de tipo AccountTypeBl
    @Autowired
    public AccountTypeApi(AccountTypeBl accountTypeBl) {
        this.accountTypeBl = accountTypeBl;
    }

    //Metodo que obtiene un tipo de cuenta por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType findAccountTypeById(@RequestBody AccountType accountType, HttpServletRequest request) {

        return accountTypeBl.findAccountTypeById(accountType);
    }

   //Metodo que agrega un tipo de cuenta a traves del requestMethod POST
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType insertAccountType(@RequestBody AccountType accountType, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        accountTypeBl.insertAccountType(accountType,transaction);
        return  accountType;

    }

    //Metodo que actualiza un tipo de cuenta a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType updateAccountType(@RequestBody AccountType accountType, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        accountTypeBl.updateAccountType(accountType,transaction);
        return  accountType;
    }

    //Metodo que elimina un tipo de cuenta a traves del requestMethod DELETE es decir cambia el status a 0
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType deleteUser(@RequestBody AccountType accountType, HttpServletRequest request) {
        return accountTypeBl.deleteAccountType(accountType);
    }

    //Metodo que obitene un tipo de cuenta por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo cliente
    @RequestMapping(value = "/userRequest", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountTypeRequest findAccountTypeById(@RequestBody AccountTypeRequest accountTypeRequest, HttpServletRequest request) {

        return accountTypeBl.findAccountTypeReqById(accountTypeRequest);
    }

    @RequestMapping(path="/accounts",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AccountTypeRequest> accountTypes(HttpServletRequest request) {
        List<AccountTypeRequest> accountType=accountTypeBl.accountTypes();
        return accountType;
    }
}
