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

    //Constructor de la clase UserTypeBl recibe dos parametros de tipo userTypeDao y transactionDao
    @Autowired
    public UserTypeBl(UserTypeDao userTypeDao, TransactionDao transactionDao) {
        this.userTypeDao = userTypeDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto userTypeDao llama al metodo para encontrar un
    //tipo de usuario por medio del ID
    public UserType findUserTypeById(UserType userType) {
        return userTypeDao.findByUserTypeId(userType);
    }

    //Metodo que a traves del objeto userTypeDao llama al metodo para agregar un
    //tipo de usuario
    public UserType insertUserType(UserType userType, Transaction transaction) {
        userType.setTransaction(transaction);
        userTypeDao.userTypeInsert(userType);
        Integer userTypeId = transactionDao.getLastInsertId();
        userType.setUserTypeId(userTypeId);
        return userType;
    }

    //Metodo que a traves del objeto userTypeDao llama al metodo para actualizar un
    //tipo de usuario por medio del ID
    public UserType updateUserType(UserType userType, Transaction transaction) {
        userType.setTransaction(transaction);
        userTypeDao.userTypeUpdate(userType);
        return userType;
    }

    //Metodo que a traves del objeto userTypeDao llama al metodo para elimiinar un
    //tipo de usuario por medio del ID
    public UserType deleteUserType(UserType userType) {
        userTypeDao.userTypeDelete(userType);
        return userType;
    }
}
