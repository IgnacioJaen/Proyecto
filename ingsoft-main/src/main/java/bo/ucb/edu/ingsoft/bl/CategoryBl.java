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

    @Autowired
    public CategoryBl(CategoryDao categoryDao, TransactionDao transactionDao) {
        this.categoryDao = categoryDao;
        this.transactionDao = transactionDao;
    }

    public Category findCategoryById(Category category) {
        return  categoryDao.findByCategoryId(category);
    }

    public Category insertCategory(Category category,Transaction transaction) {
        category.setTransaction(transaction);
        categoryDao.categoryinsert(category);
        Integer categoryId = transactionDao.getLastInsertId();
        category.setCategoryId(categoryId);
        return category;
    }

    public Category updateCategory(Category category, Transaction transaction) {
        category.setTransaction(transaction);
        categoryDao.categoryupdate(category);
        //Integer categoryId = transactionDao.getLastInsertId();
        //category.setCategoryId(categoryId);
        return category;
    }

    public Category deleteCategory(Category category) {
        return categoryDao.categorydelete(category);
    }
}
