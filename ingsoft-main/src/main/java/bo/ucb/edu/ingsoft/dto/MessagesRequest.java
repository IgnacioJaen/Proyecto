package bo.ucb.edu.ingsoft.dto;

public class MessagesRequest {
    private Integer messageId;
    private String date;
    private String content;

    public MessagesRequest(){
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
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

    @Override
    public String toString() {
        return "MessagesRequest{" +
                "messageId=" + messageId +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
