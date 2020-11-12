package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.ChatRequest;
import bo.ucb.edu.ingsoft.model.Chat;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChatDao {
    //Metodos de la clase ChatDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar un chat y tiene un parametro de tipo chat
    public Chat findChatById(Chat chat);

    //Metodo para encontrar un chat y tiene un parametro de tipo chatRequest
    //ya que es el request para la vista del usuario de tipo cliente
    public ChatRequest findChatReqById(ChatRequest chatRequest);

    //Metodo para agregar un chat y tiene un parametro de tipo chat
    public void createChat(Chat chat);

    //Metodo para actualizar un chat y tiene un parametro de tipo chat
    public void updateChat(Chat chat);

    //Metodo para eliminar un chat y tiene un parametro de tipo chat
    public void deleteChat(Chat chat);
}
