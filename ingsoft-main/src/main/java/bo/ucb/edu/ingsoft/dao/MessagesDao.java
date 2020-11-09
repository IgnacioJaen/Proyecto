package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Messages;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessagesDao {

    public Messages findMessagesById(Messages messages);

    public void messagesInsert(Messages messages);

    public void messagesUpdate(Messages messages);

    public void messagesDelete(Messages messages);
}