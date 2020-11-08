package bo.ucb.edu.ingsoft.dao;
import bo.ucb.edu.ingsoft.model.Subcategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubcategoryDao {

    public Subcategory findBySubcategoryId(Subcategory subcategory);

    public void subcategoryinsert(Subcategory subcategory);

    public void subcategoryupdate(Subcategory subcategory);

    public Subcategory subcategorydelete(Subcategory subcategory);
}
