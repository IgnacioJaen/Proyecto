package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.ChatBl;
import bo.ucb.edu.ingsoft.model.Chat;
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
@RequestMapping(value = "/v1/chat")
public class ChatApi {
    private ChatBl chatBl;

    @Autowired
    public ChatApi(ChatBl chatBl) {
        this.chatBl = chatBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Chat findChatById(@RequestBody Chat chat, HttpServletRequest request) {
        return chatBl.findChatById(chat);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Chat createChat(@RequestBody Chat chat, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        chatBl.createChat(chat,transaction);
        return chat;

    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Chat deleteChat(@RequestBody Chat chat, HttpServletRequest request) {
        return chatBl.deleteChat(chat);
    }
}
