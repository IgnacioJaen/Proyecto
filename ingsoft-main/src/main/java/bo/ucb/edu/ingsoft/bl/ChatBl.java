package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ChatDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.ChatRequest;
import bo.ucb.edu.ingsoft.model.Chat;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBl {
    private ChatDao chatDao;
    private TransactionDao transactionDao;

    @Autowired
    public ChatBl(ChatDao chatDao, TransactionDao transactionDao) {
        this.chatDao = chatDao;
        this.transactionDao = transactionDao;
    }

    public Chat findChatById(Chat chat) {
        return chatDao.findChatById(chat);
    }

    public ChatRequest findChatReqById(ChatRequest chatRequest) {
        return chatDao.findChatReqById(chatRequest);
    }

    public Chat createChat(Chat chat, Transaction transaction) {
        chat.setTransaction(transaction);
        this.chatDao.createChat(chat);
        Integer chatId = transactionDao.getLastInsertId();
        chat.setChatId(chatId);
        return chat;
    }

    public Chat deleteChat(Chat chat) {
        chatDao.deleteChat(chat);
        return chat;
    }
}
