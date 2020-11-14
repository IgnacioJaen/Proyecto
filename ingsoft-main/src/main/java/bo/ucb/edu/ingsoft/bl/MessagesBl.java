package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.MessagesDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;

import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.Chat;
import bo.ucb.edu.ingsoft.model.Messages;
import bo.ucb.edu.ingsoft.model.Transaction;

import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesBl {
    private MessagesDao messagesDao;
    private TransactionDao transactionDao;

    //Constructor de la clase MessagesBl recibe dos parametros de tipo messagesDao y transactionDao
    @Autowired
    public MessagesBl(MessagesDao messagesDao, TransactionDao transactionDao) {
        this.messagesDao = messagesDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto messagesDao llama al metodo para encontrar un
    //mensaje por medio del ID
    public Messages findMessagesById(Messages messages) {
        return messagesDao.findMessagesById(messages);
    }

    //Metodo que a traves del objeto messagesDao llama al metodo para agregar un
    //mensaje
    public Messages insertMessages(Messages messages, Transaction transaction) {
        messages.setTransaction(transaction);
        messagesDao.messagesInsert(messages);
        Integer messageId = transactionDao.getLastInsertId();
        messages.setMessageId(messageId);
        return messages;
    }

    //Metodo que a traves del objeto messagesDao llama al metodo para eliminar un
    //mensaje por medio del ID
    public Messages deleteMessages(Messages messages) {
        messagesDao.messagesDelete(messages);
        return messages;
    }

    //Metodo que a traves del objeto messagesDao llama al metodo para encontrar un
    //mensaje por medio del ID para el request del usuario de tipo cliente
    public MessagesRequest findMessagesReqById(MessagesRequest messagesRequest){
        return messagesDao.findMessagesReqById(messagesRequest);
    }

    public List<MessagesRequest> messages(Chat chat) {
        List<MessagesRequest> message=messagesDao.messages(chat);
        return message;
    }

}