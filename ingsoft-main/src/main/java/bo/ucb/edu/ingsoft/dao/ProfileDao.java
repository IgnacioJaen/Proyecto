package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.ProfileRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileDao {
    //Metodo de la clase ProfileDao que sera utilizada por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar un perfil y tiene un parametro de tipo Integer
    ProfileRequest profilegetp(Integer userId);
}
