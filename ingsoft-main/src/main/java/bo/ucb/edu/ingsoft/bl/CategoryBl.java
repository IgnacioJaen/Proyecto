package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.CategoryDao;
import bo.ucb.edu.ingsoft.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryBl {
    private CategoryDao categoryDao;

    @Autowired
    public CategoryBl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public Category findCategoryById(Integer categoryId) {
        return  categoryDao.findByCategoryId(categoryId);
    }
}
