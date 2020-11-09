package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserTypeDao;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTypeBl {
    private UserTypeDao userTypeDao;
    private TransactionDao transactionDao;

    @Autowired
    public UserTypeBl(UserTypeDao userTypeDao, TransactionDao transactionDao) {
        this.userTypeDao = userTypeDao;
        this.transactionDao = transactionDao;
    }


    public UserType findUserTypeById(UserType userType) {
        return userTypeDao.findByUserTypeId(userType);
    }

    public UserType insertUserType(UserType userType, Transaction transaction) {
        userType.setTransaction(transaction);
        userTypeDao.userTypeInsert(userType);
        Integer userTypeId = transactionDao.getLastInsertId();
        userType.setUserTypeId(userTypeId);
        return userType;
    }

    public UserType updateUserType(UserType userType, Transaction transaction) {
        userType.setTransaction(transaction);
        userTypeDao.userTypeUpdate(userType);
        return userType;
    }

    public UserType deleteUserType(UserType userType) {
        userTypeDao.userTypeDelete(userType);
        return userType;
    }
}
