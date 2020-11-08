package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.SubcategoryDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.model.Subcategory;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class SubcategoryBl {
    private SubcategoryDao subcategoryDao;
    private TransactionDao transactionDao;

    @Autowired
    public SubcategoryBl(SubcategoryDao subcategoryDao, TransactionDao transactionDao) {
        this.subcategoryDao = subcategoryDao;
        this.transactionDao = transactionDao;
    }


    public Subcategory findSubcategoryById(Subcategory subcategory) {
        return subcategoryDao.findBySubcategoryId(subcategory);
    }

    public Subcategory insertSubcategory(Subcategory subcategory, Transaction transaction) {
        subcategory.setTransaction(transaction);
        subcategoryDao.subcategoryinsert(subcategory);
        Integer subcategoryId = transactionDao.getLastInsertId();
        subcategory.setSubcategoryId(subcategoryId);
        return subcategory;
    }

    public Subcategory updateSubcategory(Subcategory subcategory, Transaction transaction) {
        subcategory.setTransaction(transaction);
        subcategoryDao.subcategoryupdate(subcategory);
        return subcategory;
    }

    public Subcategory deleteSubcategory(Subcategory subcategory) {
        return subcategoryDao.subcategorydelete(subcategory);
    }




}
