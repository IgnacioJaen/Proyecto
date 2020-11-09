package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Profile {
    private Integer profileId;
    private Integer userId;
    private Integer status;
    private Transaction transaction;

    public Profile() {
        transaction = new Transaction();
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
        this.transaction.setTxUpdate(txUpdate);
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        return "Profile{" +
                "profileId=" + profileId +
                ", userId=" + userId +
                ", status=" + status + '\'' +
                ", txId=" + this.transaction.getTxId() + '\'' +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() + '\'' +
                ", txDate=" + this.transaction.getTxDate() + '\'' +
                ", txUpdate=" + this.transaction.getTxUpdate() + '\'' +
                '}';
    }
}
