package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.MatchDao;
import bo.ucb.edu.ingsoft.dao.MessagesDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.Match;
import bo.ucb.edu.ingsoft.model.Messages;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchBl {
    private MatchDao matchDao;
    private TransactionDao transactionDao;

    //Constructor de la clase MessagesBl recibe dos parametros de tipo messagesDao y transactionDao
    @Autowired
    public MatchBl(MatchDao matchDao, TransactionDao transactionDao) {
        this.matchDao = matchDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto messagesDao llama al metodo para agregar un
    //mensaje
    public Match matchInsert(Match match, Transaction transaction) {
        match.setTransaction(transaction);
        matchDao.matchInsert(match);
        Integer messageId = transactionDao.getLastInsertId();
        match.setMatchId(messageId);
        return match;
    }
}
