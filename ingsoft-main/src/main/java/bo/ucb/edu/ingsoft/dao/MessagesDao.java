package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.Messages;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessagesDao {

    public Messages findMessagesById(Messages messages);

    public MessagesRequest findMessagesReqById(MessagesRequest messagesRequest);

    public void messagesInsert(Messages messages);

    public void messagesUpdate(Messages messages);

    public void messagesDelete(Messages messages);
}