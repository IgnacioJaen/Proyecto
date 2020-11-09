package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.model.Profile;
import bo.ucb.edu.ingsoft.model.Transaction;

public class ChatRequest {
    private Integer chatId;
    private String profile2UserName;

    public ChatRequest(){
    }

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

    @Override
    public String toString() {
        return "ChatRequest{" +
                "chatId=" + chatId +
                ", profile2UserName='" + profile2UserName + '\'' +
                '}';
    }
}
