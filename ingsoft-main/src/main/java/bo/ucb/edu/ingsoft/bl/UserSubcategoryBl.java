package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserSubcategoryDao;
import bo.ucb.edu.ingsoft.model.UserSubcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSubcategoryBl {

    private UserSubcategoryDao userSubcategoryDao;
    private TransactionDao transactionDao;

    @Autowired
    public UserSubcategoryBl(UserSubcategoryDao userSubcategoryDao, TransactionDao transactionDao) {
        this.userSubcategoryDao = userSubcategoryDao;
        this.transactionDao = transactionDao;
    }

    public List<UserSubcategory> getUserSubcategories(Integer userId) {
        List<UserSubcategory> userSubcategories=userSubcategoryDao.getUserSubcategories(userId);
        return userSubcategories;
    }

}
