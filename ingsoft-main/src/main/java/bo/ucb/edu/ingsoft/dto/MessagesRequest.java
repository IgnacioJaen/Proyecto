package bo.ucb.edu.ingsoft.dto;

public class MessagesRequest {
    private String userName;
    private String datemessage;
    private String content;

    public MessagesRequest() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDatemessage() {
        return datemessage;
    }

    public void setDatemessage(String datemessage) {
        this.datemessage = datemessage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MessagesRequest{" +
                "userName='" + userName + '\'' +
                ", datemessage='" + datemessage + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
