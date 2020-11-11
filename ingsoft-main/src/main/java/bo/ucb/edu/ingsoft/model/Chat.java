package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Chat {
    private Integer chatId;
    private Integer profile1Id;
    private Integer profile2Id;
    private Integer status;
    private Transaction transaction;

    // Constructor de la clase Chat, instanciando el objeto Transaction
    public Chat(){
        transaction = new Transaction();
    }

    //SETERS DE LOS ATRIBUTOS DEL OBJETO TRANSACTION **************
    public void setTxId(Integer txId) {
        this.transaction.setTxId(txId);
    }
    public void setTxHost(String txHost) {
        this.transaction.setTxHost(txHost);
    }
    public void setTxUserId(Integer txUserId) {
        this.transaction.setTxUserId(txUserId);
    }
    public void setTxDate(Date txDate) {
        this.transaction.setTxDate(txDate);
    }
    public void setTxUpdate(Date txUpdate) {
        this.transaction.setTxUpdate(txUpdate);
    }


    // Setters Y Getters generados para los demas atributos de la clase Chat
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

    // Funcion toString generado para imprimir el objeto en una cadena String
    @Override
    public String toString() {
        return "Chat{" +
                "chatId=" + chatId +
                ", profile1Id=" + profile1Id +
                ", profile2Id=" + profile2Id +
                ", status=" + status +
                ", txId=" + this.transaction.getTxId() +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() +
                ", txDate=" + this.transaction.getTxDate() +
                ", txUpdate=" + this.transaction.getTxUpdate() +
                '}';
    }
}
