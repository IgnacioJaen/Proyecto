package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.MatchBl;
import bo.ucb.edu.ingsoft.bl.MessagesBl;
import bo.ucb.edu.ingsoft.model.Match;
import bo.ucb.edu.ingsoft.model.Messages;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/match")

public class MatchApi {
    private MatchBl matchBl;

    //Constructor de la clase MessagesApi recibe un parametro de tipo MesssagesBl
    @Autowired
    public MatchApi(MatchBl matchBl) {
        this.matchBl = matchBl;
    }

    @RequestMapping(value="/post", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Match insertMatch(@RequestBody Match match, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        matchBl.matchInsert(match,transaction);
        return match;
    }
}
