package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ChatDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.ChatRequest;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.Chat;
import bo.ucb.edu.ingsoft.model.Profile;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatBl {
    private ChatDao chatDao;
    private TransactionDao transactionDao;

    //Constructor de la clase ChatBl recibe dos parametros de tipo chatDao y transactionDao
    @Autowired
    public ChatBl(ChatDao chatDao, TransactionDao transactionDao) {
        this.chatDao = chatDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto chatDao llama al metodo para encontrar un
    //chat por medio del ID
    public Chat findChatById(Chat chat) {
        return chatDao.findChatById(chat);
    }

    //Metodo que a traves del objeto chatDao llama al metodo para encontrar un
    //chat por medio del ID para el request del usuario de tipo cliente
    public ChatRequest findChatReqById(ChatRequest chatRequest) {
        return chatDao.findChatReqById(chatRequest);
    }

    //Metodo que a traves del objeto chatDao llama al metodo para agregar un
    //chat
    public Chat createChat(Chat chat, Transaction transaction) {
        chat.setTransaction(transaction);
        this.chatDao.createChat(chat);
        Integer chatId = transactionDao.getLastInsertId();
        chat.setChatId(chatId);
        return chat;
    }

    //Metodo que a traves del objeto chatDao llama al metodo para eliminar un
    //chat por medio del ID
    public Chat deleteChat(Chat chat) {
        chatDao.deleteChat(chat);
        return chat;
    }

    public List<ChatRequest> chats(Integer userId) {
        List<ChatRequest> chat=chatDao.chats(userId);
        return chat;
    }
}
