package bo.ucb.edu.ingsoft.dao;
import bo.ucb.edu.ingsoft.model.Subcategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubcategoryDao {

    Subcategory findBySubcategoryId(Subcategory subcategory);

    void subcategoryinsert(Subcategory subcategory);

    void subcategoryupdate(Subcategory subcategory);

    Subcategory subcategorydelete(Subcategory subcategory);
}
