package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.UserDao;

import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBl {

    private UserDao userDao;
    private TransactionDao transactionDao;

    @Autowired
    public UserBl(UserDao userDao, TransactionDao transactionDao) {
        this.userDao = userDao;
        this.transactionDao = transactionDao;
    }


    public User findUserById(User user) {
        return userDao.findByUserId(user);
    }

    public User insertUser(User user, Transaction transaction) {
        user.setTransaction(transaction);
        userDao.userInsert(user);
        Integer userId = transactionDao.getLastInsertId();
        user.setUserId(userId);
        return user;
    }

    public User updateUser(User user, Transaction transaction) {
        user.setTransaction(transaction);
        userDao.userUpdate(user);
        return user;
    }

    public User deleteUser(User user) {
        userDao.userDelete(user);
        return user;
    }
}
