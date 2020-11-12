package bo.ucb.edu.ingsoft.dto;

public class MessagesRequest {
    private String userName;
    private String date;
    private String content;

    // Constructor vacio de la clase MessageRequest
    public MessagesRequest(){
    }
    // Setters Y Getters generados para los demas atributos de la clase MessageRequest
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // Funcion toString generado para imprimir el objeto en una cadena String

    @Override
    public String toString() {
        return "MessagesRequest{" +
                "userName='" + userName + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
