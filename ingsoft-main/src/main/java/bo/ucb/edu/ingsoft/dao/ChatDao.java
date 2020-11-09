package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Chat;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChatDao {
    public Chat findChatById(Chat chat);

    public void createChat(Chat chat);

    public void updateChat(Chat chat);

    public void deleteChat(Chat chat);
}
