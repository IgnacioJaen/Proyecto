package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.ChatBl;
import bo.ucb.edu.ingsoft.dto.ChatRequest;
import bo.ucb.edu.ingsoft.dto.MessagesRequest;
import bo.ucb.edu.ingsoft.model.Chat;
import bo.ucb.edu.ingsoft.model.Profile;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/chat")
public class ChatApi {
    private ChatBl chatBl;

    //Constructor de la clase ChatApi recibe un parametro de tipo ChatBl
    @Autowired
    public ChatApi(ChatBl chatBl) {
        this.chatBl = chatBl;
    }

    //Metodo que obtiene un chat por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Chat findChatById(@RequestBody Chat chat, HttpServletRequest request) {

        return chatBl.findChatById(chat);
    }

    //lastchatId
    @RequestMapping(value="/lastChatId", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer lastChat(HttpServletRequest request) {
        return chatBl.findChatId();
    }

    //Metodo que obitene un chat por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo cliente
    @RequestMapping(value = "/request", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ChatRequest findChatReqById(@RequestBody ChatRequest chatRequest, HttpServletRequest request) {
        return chatBl.findChatReqById(chatRequest);
    }

    //Metodo que agrega un chat a traves del requestMethod PUT
    @RequestMapping(value = "/post", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Chat createChat(@RequestBody Chat chat, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        chatBl.createChat(chat,transaction);
        return chat;

    }

    //Metodo que elimina un chat a traves del requestMethod DELETE es decir cambia el status a 0
    @RequestMapping(path="/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer deleteChat(@RequestParam Integer chatId, HttpServletRequest request) {
        return chatBl.deleteChat(chatId);
    }

    @RequestMapping(path="/chats",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ChatRequest> chatsList(@RequestParam Integer userId, HttpServletRequest request) {
        List<ChatRequest> chat=chatBl.chats(userId);
        return chat;
    }
}
