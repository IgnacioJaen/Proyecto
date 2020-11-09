package bo.ucb.edu.ingsoft.model;

public class Chat {
    private Integer chatId;
    private Integer profile1Id;
    private Integer profile2Id;
    private Integer status;
    private Transaction transaction;

    public Chat(){
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId=" + chatId +
                ", profile1Id=" + profile1Id +
                ", profile2Id=" + profile2Id +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
