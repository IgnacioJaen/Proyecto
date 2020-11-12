package bo.ucb.edu.ingsoft.dao;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Subcategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubcategoryDao {
    //Metodos de la clase SubcategoryDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar una subcategoria y tiene un parametro de tipo subcategory
    public Subcategory findBySubcategoryId(Subcategory subcategory);

    //Metodo para agregar una subcategoria y tiene un parametro de tipo subcategory
    public void subcategoryinsert(Subcategory subcategory);

    //Metodo para actualizar una subcategoria y tiene un parametro de tipo subcategory
    public void subcategoryupdate(Subcategory subcategory);

    //Metodo para eliminar una subcategoria y tiene un parametro de tipo subcategory
    public void subcategorydelete(Subcategory subcategory);

    public List<CategoryRequest> subcategories(Category category);
}
