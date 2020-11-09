package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Messages {
    private Integer messageId;
    private Integer chatId;
    private String date;
    private String content;
    private Integer status;
    private Transaction transaction;

    public Messages(){
        transaction = new Transaction();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTxId() {
        return transaction.getTxId();
    }

    public void setTxId(Integer txId) {
        this.transaction.setTxId(txId);
    }

    public String getTxHost() {
        return transaction.getTxHost();
    }

    public void setTxHost(String txHost) {
        this.transaction.setTxHost(txHost);
    }

    public Integer getTxUserId() {
        return transaction.getTxUserId();
    }

    public void setTxUserId(Integer txUserId) {
        this.transaction.setTxUserId(txUserId);
    }

    public Date getTxDate() {
        return transaction.getTxDate();
    }

    public void setTxDate(Date txDate) {
        this.transaction.setTxDate(txDate);
    }

    public Date getTxUpdate() {
        return transaction.getTxUpdate();
    }

    public void setTxUpdate(Date txUpdate) {
        this.transaction.setTxDate(txUpdate);
    }


    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "messageId=" + messageId +
                ", chatId=" + chatId +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", txId=" + this.transaction.getTxId() +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() +
                ", txDate=" + this.transaction.getTxDate() +
                ", txUpdate=" + this.transaction.getTxUpdate() +
                '}';
    }
}
