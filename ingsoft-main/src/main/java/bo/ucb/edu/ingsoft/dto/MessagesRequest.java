package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.model.Transaction;

public class MessagesRequest {
    private Integer messageId;
    private Integer chatId;
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

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
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
                ", chatId=" + chatId +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
