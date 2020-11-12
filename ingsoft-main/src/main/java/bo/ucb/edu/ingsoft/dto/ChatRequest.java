package bo.ucb.edu.ingsoft.dto;

public class ChatRequest {
    private String profile2UserName;
    private String content;
    private String date;
    //falta descripcion del ultimo mensaje de user2

    // Constructor vacio de la clase ChatRequest
    public ChatRequest(){
    }

    // Setters Y Getters generados para los demas atributos de la clase ChatRequest

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
                "profile2UserName='" + profile2UserName + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
