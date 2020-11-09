package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.AccountTypeDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;

import bo.ucb.edu.ingsoft.dto.AccountTypeRequest;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.AccountType;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountTypeBl {
    private AccountTypeDao accountTypeDao;
    private TransactionDao transactionDao;

    @Autowired
    public AccountTypeBl(AccountTypeDao accountTypeDao, TransactionDao transactionDao) {
        this.accountTypeDao = accountTypeDao;
        this.transactionDao = transactionDao;
    }


    public AccountType findAccountTypeById(AccountType accountType) {
        return accountTypeDao.findByAccountTypeId(accountType);
    }

    public AccountType insertAccountType(AccountType accountType, Transaction transaction) {
        accountType.setTransaction(transaction);
        accountTypeDao.accountTypeInsert(accountType);
        Integer userTypeId = transactionDao.getLastInsertId();
        accountType.setAccountTypeId(userTypeId);
        return accountType;
    }

    public AccountType updateAccountType(AccountType accountType, Transaction transaction) {
        accountType.setTransaction(transaction);
        accountTypeDao.accountTypeUpdate(accountType);
        return accountType;
    }

    public AccountType deleteAccountType(AccountType accountType) {
        accountTypeDao.accountTypeDelete(accountType);
        return accountType;
    }

    public AccountTypeRequest findAccountTypeReqById(AccountTypeRequest accountTypeRequest){
        return accountTypeDao.findAccountTypeReqById(accountTypeRequest);
    }
}
