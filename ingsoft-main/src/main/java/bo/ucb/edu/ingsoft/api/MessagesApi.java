package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.MessagesBl;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.Messages;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/messages")
public class MessagesApi {

    private MessagesBl messagesBl;

    @Autowired
    public MessagesApi(MessagesBl messagesBl) {
        this.messagesBl = messagesBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Messages findUserById(@RequestBody Messages messages, HttpServletRequest request) {

        return messagesBl.findMessagesById(messages);
    }

    @RequestMapping(value= "/request", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public MessagesRequest findUserById(@RequestBody MessagesRequest messagesRequest, HttpServletRequest request) {

        return messagesBl.findMessagesReqById(messagesRequest);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Messages insertMessages(@RequestBody Messages messages, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        messagesBl.insertMessages(messages,transaction);
        return  messages;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Messages deleteUser(@RequestBody Messages messages, HttpServletRequest request) {
        return messagesBl.deleteMessages(messages);
    }
}