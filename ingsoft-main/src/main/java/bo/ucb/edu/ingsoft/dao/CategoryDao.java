package bo.ucb.edu.ingsoft.dao;
import bo.ucb.edu.ingsoft.model.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryDao {
    public Category findByCategoryId(Integer categoryId);

    public Category categoryinsert(Category category);

    public Category categoryupdate(Category category);

    public Category categorydelete(Integer categoryId);
}
