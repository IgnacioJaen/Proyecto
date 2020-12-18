package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    //Metodos de la clase UserDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar un usuario y tiene un parametro de tipo user
    public User findByUserId(Integer userId);

    //Metodo para agregar un usuario y tiene un parametro de tipo user
    public void userInsert(User user);

    //Metodo para actualizar un usuario y tiene un parametro de tipo user
    public void userUpdate(User user);

    //Metodo para eliminar un usuario y tiene un parametro de tipo user
    public void userDelete(User user);

    //Metodo para encontrar un usuario y tiene un parametro de tipo userRequest
    //ya que es el request para la vista del usuario de tipo cliente
    public UserRequest findUserReqById(Integer userId);

    //inicio de sesion
    public Integer findUserByEmailPassword(String email, String password);

    //Obtener reciever usere id
    public Integer findReceiverUser(Integer userId, Integer chatId);

    //Metodo para ver todos los usuarios
    public List<UserRequest> allusers();

    //obtener userType
    public String findUserTypeByEmailPassword(String email, String password);

}
