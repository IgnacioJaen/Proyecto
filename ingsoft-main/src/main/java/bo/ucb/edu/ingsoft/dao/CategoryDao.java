package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Photos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDao {
    //Metodos de la clase CategoryDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar una categoria y tiene un parametro de tipo category
    public Category findByCategoryId(Integer categoryId);

    //Metodo para agregar una categoria y tiene un parametro de tipo category
    public void categoryinsert(Category category);

    //Metodo para actualizar una categoria y tiene un parametro de tipo category
    public void categoryupdate(Category category);

    //Metodo para eliminar una categoria y tiene un parametro de tipo category
    public void categorydelete(Category category);

    //Metodo para ver todas las categorias
    public List<CategoryRequest> categories();


    public void createphotoCategory(Photos photocategory);

    public Photos findImageByCategoryId(Integer categoryId);
}
