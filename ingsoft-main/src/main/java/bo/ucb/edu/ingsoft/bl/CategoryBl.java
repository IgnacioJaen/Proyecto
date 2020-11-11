package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.CategoryDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryBl {
    private CategoryDao categoryDao;
    private TransactionDao transactionDao;

    //Constructor de la clase CategoryBl recibe dos parametros de tipo categoryDao y transactionDao
    @Autowired
    public CategoryBl(CategoryDao categoryDao, TransactionDao transactionDao) {
        this.categoryDao = categoryDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto categoryDao llama al metodo para encontrar una
    //categoria por medio del ID
    public Category findCategoryById(Category category) {

        return  categoryDao.findByCategoryId(category);
    }

    //Metodo que a traves del objeto categoryDao llama al metodo para agregar una
    //categoria
    public Category insertCategory(Category category,Transaction transaction) {
        category.setTransaction(transaction);
        categoryDao.categoryinsert(category);
        Integer categoryId = transactionDao.getLastInsertId();
        category.setCategoryId(categoryId);
        return category;
    }

    //Metodo que a traves del objeto categoryDao llama al metodo para actualizar una
    //categoria por medio del ID
    public Category updateCategory(Category category, Transaction transaction) {
        category.setTransaction(transaction);
        categoryDao.categoryupdate(category);
        //Integer categoryId = transactionDao.getLastInsertId();
        //category.setCategoryId(categoryId);
        return category;
    }

    //Metodo que a traves del objeto categoryDao llama al metodo para eliminar una
    //categoria por medio del ID
    public Category deleteCategory(Category category) {
        categoryDao.categorydelete(category);
        return category;
    }
}
