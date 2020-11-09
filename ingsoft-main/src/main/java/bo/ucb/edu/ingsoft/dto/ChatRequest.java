package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.model.Profile;
import bo.ucb.edu.ingsoft.model.Transaction;

public class ChatRequest {
    private Integer chatId;
    private Integer profile1Id;
    private Integer profile2Id;
    private Profile profile1;
    private Profile profile2;

    public ChatRequest(){
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getProfile1Id() {
        return profile1Id;
    }

    public void setProfile1Id(Integer profile1Id) {
        this.profile1Id = profile1Id;
    }

    public Integer getProfile2Id() {
        return profile2Id;
    }

    public void setProfile2Id(Integer profile2Id) {
        this.profile2Id = profile2Id;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId=" + chatId +
                ", profile1Id=" + profile1Id +
                ", profile2Id=" + profile2Id +
                '}';
    }
}
