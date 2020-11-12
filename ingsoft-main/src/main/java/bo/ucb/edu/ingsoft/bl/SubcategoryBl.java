package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.SubcategoryDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.model.Subcategory;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubcategoryBl {
    private SubcategoryDao subcategoryDao;
    private TransactionDao transactionDao;

    //Constructor de la clase SubcategoryBl recibe dos parametros de tipo subcategoryDao y transactionDao
    @Autowired
    public SubcategoryBl(SubcategoryDao subcategoryDao, TransactionDao transactionDao) {
        this.subcategoryDao = subcategoryDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto subcategoryDao llama al metodo para encontrar una
    //subcategoria por medio del ID
    public Subcategory findSubcategoryById(Subcategory subcategory) {
        return subcategoryDao.findBySubcategoryId(subcategory);
    }

    //Metodo que a traves del objeto subcategoryDao llama al metodo para agregar una
    //subcategoria
    public Subcategory insertSubcategory(Subcategory subcategory, Transaction transaction) {
        subcategory.setTransaction(transaction);
        subcategoryDao.subcategoryinsert(subcategory);
        Integer subcategoryId = transactionDao.getLastInsertId();
        subcategory.setSubcategoryId(subcategoryId);
        return subcategory;
    }

    //Metodo que a traves del objeto subcategoryDao llama al metodo para actualizar una
    //subcategoria por medio del ID
    public Subcategory updateSubcategory(Subcategory subcategory, Transaction transaction) {
        subcategory.setTransaction(transaction);
        subcategoryDao.subcategoryupdate(subcategory);
        return subcategory;
    }

    //Metodo que a traves del objeto subcategoryDao llama al metodo para eliminar una
    //subcategoria por medio del ID
    public Subcategory deleteSubcategory(Subcategory subcategory) {
        subcategoryDao.subcategorydelete(subcategory);
        return subcategory;
    }




}
