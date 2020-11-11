package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.Messages;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessagesDao {
    //Metodos de la clase MessagesDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar un mensaje y tiene un parametro de tipo messages
    public Messages findMessagesById(Messages messages);

    //Metodo para encontrar un mensaje y tiene un parametro de tipo messagesRequest
    //ya que es el request para la vista del usuario de tipo cliente
    public MessagesRequest findMessagesReqById(MessagesRequest messagesRequest);

    /*
    public MessagesRequest findMessagesReqById(String date, String content);
     */

    //Metodo para agregar un mensaje y tiene un parametro de tipo messages
    public void messagesInsert(Messages messages);

    //Metodo para actualizar un mensaje y tiene un parametro de tipo messages
    public void messagesUpdate(Messages messages);

    //Metodo para eliminar un mensaje y tiene un parametro de tipo messages
    public void messagesDelete(Messages messages);
}