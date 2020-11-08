package bo.ucb.edu.ingsoft.dao;
import bo.ucb.edu.ingsoft.model.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryDao {
    public Category findByCategoryId(Category category);

    public void categoryinsert(Category category);

    public void categoryupdate(Category category);

    public Category categorydelete(Category category);
}
