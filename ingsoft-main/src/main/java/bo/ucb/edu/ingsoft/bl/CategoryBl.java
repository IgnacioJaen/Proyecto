package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.CategoryDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Photos;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.PhotoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public Category findCategoryById(Integer categoryId) {
        Category category = categoryDao.findByCategoryId(categoryId);
        return  category;
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

    public List<CategoryRequest> categories(){

        List<CategoryRequest> category=categoryDao.categories();
        return category;
    }

    public void uploadImages(MultipartFile images, Integer categoryId, Transaction transaction) {

        PhotoUtil photoUtil= new PhotoUtil();
        String nombre= photoUtil.upload(images,"photocategories");
        Photos photocategory = new Photos();
        photocategory.setPhotoPath(nombre);
        photocategory.setCategoryId(categoryId);
        photocategory.setTransaction(transaction);
        categoryDao.createphotoCategory(photocategory);
    }

    public Photos findImageCategoryById(Integer categoryId) {
        return  categoryDao.findImageByCategoryId(categoryId);
    }
}
