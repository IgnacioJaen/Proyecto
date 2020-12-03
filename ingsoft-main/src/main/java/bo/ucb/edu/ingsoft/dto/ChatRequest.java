package bo.ucb.edu.ingsoft.dto;

public class ChatRequest {
    private Integer chatId;
    private String user2UserName;
    private String contentChat;
    private String dateChat;

    // Constructor vacio de la clase ChatRequest
    public ChatRequest(){
    }

    // Setters Y Getters generados para los demas atributos de la clase ChatRequest


    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getUser2UserName() {
        return user2UserName;
    }

    public void setUser2UserName(String user2UserName) {
        this.user2UserName = user2UserName;
    }

    public String getContentChat() {
        return contentChat;
    }

    public void setContentChat(String contentChat) {
        this.contentChat = contentChat;
    }

    public String getDateChat() {
        return dateChat;
    }

    public void setDateChat(String dateChat) {
        this.dateChat = dateChat;
    }

    @Override
    public String toString() {
        return "ChatRequest{" +
                "chatId='" + chatId + '\'' +
                "profile2UserName='" + user2UserName + '\'' +
                ", contentChat='" + contentChat + '\'' +
                ", dateChat='" + dateChat + '\'' +
                '}';
    }
}
