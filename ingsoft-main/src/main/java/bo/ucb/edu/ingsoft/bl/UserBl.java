package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.UserDao;

import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBl {

    private UserDao userDao;
    private TransactionDao transactionDao;

    //Constructor de la clase UserBl recibe dos parametros de tipo userDao y transactionDao
    @Autowired
    public UserBl(UserDao userDao, TransactionDao transactionDao) {
        this.userDao = userDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto userDao llama al metodo para encontrar un
    //usuario por medio del ID
    public User findUserById(Integer userId) {
        return userDao.findByUserId(userId);
    }

    //Metodo que a traves del objeto userDao llama al metodo para agregar un
    //usuario
    public User insertUser(User user, Transaction transaction) {
        user.setTransaction(transaction);
        userDao.userInsert(user);
        Integer userId = transactionDao.getLastInsertId();
        user.setUserId(userId);
        return user;
    }

    //Metodo que a traves del objeto userDao llama al metodo para actualizar un
    //usuario por medio del ID
    public User updateUser(User user, Transaction transaction) {
        user.setTransaction(transaction);
        userDao.userUpdate(user);
        return user;
    }

    //Metodo que a traves del objeto userDao llama al metodo para eliminar un
    //usuario por medio del ID
    public User deleteUser(User user) {
        userDao.userDelete(user);
        return user;
    }

    //Metodo que a traves del objeto userDao llama al metodo para encontrar un
    //usuario por medio del ID para el request del usuario de tipo cliente
    public UserRequest findUserReqById(Integer userId) {
        return userDao.findUserReqById(userId);
    }

    //inicio de sesion
    public Integer findUserByEmailPassword(String email, String password) {
        return userDao.findUserByEmailPassword(email, password);
    }

}
