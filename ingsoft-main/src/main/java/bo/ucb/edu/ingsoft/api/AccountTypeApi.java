package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.AccountTypeBl;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.AccountType;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/accountType")
public class AccountTypeApi {
    private AccountTypeBl accountTypeBl;

    @Autowired
    public AccountTypeApi(AccountTypeBl accountTypeBl) {
        this.accountTypeBl = accountTypeBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType findAccountTypeById(@RequestBody AccountType accountType, HttpServletRequest request) {

        return accountTypeBl.findAccountTypeById(accountType);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType insertAccountType(@RequestBody AccountType accountType, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        accountTypeBl.insertAccountType(accountType,transaction);
        return  accountType;

    }

    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType updateAccountType(@RequestBody AccountType accountType, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        accountTypeBl.updateAccountType(accountType,transaction);
        return  accountType;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountType deleteUser(@RequestBody AccountType accountType, HttpServletRequest request) {
        return accountTypeBl.deleteAccountType(accountType);
    }
}
