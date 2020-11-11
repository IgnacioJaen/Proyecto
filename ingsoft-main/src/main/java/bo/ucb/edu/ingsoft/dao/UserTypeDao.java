package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.UserType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTypeDao {
    //Metodos de la clase UserTypeDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar un tipo de usuario y tiene un parametro de tipo userType
    public UserType findByUserTypeId(UserType userType);

    //Metodo para agregar un tipo de usuario y tiene un parametro de tipo userType
    public void userTypeInsert(UserType userType);

    //Metodo para actualizar un tipo de usuario y tiene un parametro de tipo userType
    public void userTypeUpdate(UserType userType);

    //Metodo para eliminar un tipo de usuario y tiene un parametro de tipo userType
    public void userTypeDelete(UserType userType);
}
