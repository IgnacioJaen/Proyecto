package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.MessagesDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;

import bo.ucb.edu.ingsoft.model.Messages;
import bo.ucb.edu.ingsoft.model.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesBl {
    private MessagesDao messagesDao;
    private TransactionDao transactionDao;

    @Autowired
    public MessagesBl(MessagesDao messagesDao, TransactionDao transactionDao) {
        this.messagesDao = messagesDao;
        this.transactionDao = transactionDao;
    }


    public Messages findMessagesById(Messages messages) {
        return messagesDao.findMessagesById(messages);
    }

    public Messages insertMessages(Messages messages, Transaction transaction) {
        messages.setTransaction(transaction);
        messagesDao.messagesInsert(messages);
        Integer messageId = transactionDao.getLastInsertId();
        messages.setMessageId(messageId);
        return messages;
    }

    public Messages deleteMessages(Messages messages) {
        messagesDao.messagesDelete(messages);
        return messages;
    }
}