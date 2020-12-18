package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.AccountTypeDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;

import bo.ucb.edu.ingsoft.dto.AccountTypeRequest;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.AccountType;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTypeBl {
    private AccountTypeDao accountTypeDao;
    private TransactionDao transactionDao;

    //Constructor de la clase AccountTypeBl recibe dos parametros de tipo accountTypeDao y transactionDao
    @Autowired
    public AccountTypeBl(AccountTypeDao accountTypeDao, TransactionDao transactionDao) {
        this.accountTypeDao = accountTypeDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto accountTypeDao llama al metodo para encontrar un
    //tipo de cuenta por medio del ID
    public AccountType findAccountTypeById(AccountType accountType) {
        return accountTypeDao.findByAccountTypeId(accountType);
    }

    //Metodo que a traves del objeto accountTypeDao llama al metodo para agregar un
    //tipo de cuenta
    public AccountType insertAccountType(AccountType accountType, Transaction transaction) {
        accountType.setTransaction(transaction);
        accountTypeDao.accountTypeInsert(accountType);
        Integer userTypeId = transactionDao.getLastInsertId();
        accountType.setAccountTypeId(userTypeId);
        return accountType;
    }

    //Metodo que a traves del objeto accountTypeDao llama al metodo para actualizar un
    //tipo de cuenta por medio del ID
    public AccountType updateAccountType(AccountType accountType, Transaction transaction) {
        accountType.setTransaction(transaction);
        accountTypeDao.accountTypeUpdate(accountType);
        return accountType;
    }

    public String findUserTypeById(Integer userId) {
        return accountTypeDao.findUserTypeById(userId);
    }

    //Metodo que a traves del objeto accountTypeDao llama al metodo para eliminar un
    //tipo de cuenta por medio del ID
    public AccountType deleteAccountType(AccountType accountType) {
        accountTypeDao.accountTypeDelete(accountType);
        return accountType;
    }

    //Metodo que a traves del objeto accountTypeReqDao llama al metodo para encontrar un
    //tipo de cuenta por medio del ID para el request del usuario de tipo cliente
    public AccountTypeRequest findAccountTypeReqById(AccountTypeRequest accountTypeRequest){
        return accountTypeDao.findAccountTypeReqById(accountTypeRequest);
    }

    public List<AccountTypeRequest> accountTypes(){

        List<AccountTypeRequest> accountType=accountTypeDao.accountTypes();
        return accountType;
    }
}
