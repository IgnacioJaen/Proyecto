package bo.ucb.edu.ingsoft.dto;

public class ChatRequest {
    private Integer chatId;
    private String profile2UserName;

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

    public String getProfile2UserName() {
        return profile2UserName;
    }
    public void setProfile2UserName(String profile2UserName) {
        this.profile2UserName = profile2UserName;
    }

    // Funcion toString generado para imprimir el objeto en una cadena String
    @Override
    public String toString() {
        return "ChatRequest{" +
                "chatId=" + chatId +
                ", profile2UserName='" + profile2UserName + '\'' +
                '}';
    }
}
