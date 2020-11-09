package bo.ucb.edu.ingsoft.model;


import java.util.Date;

public class Match {
    private Integer matchId;
    private Integer profile1Id;
    private Integer profile2Id;
    private Integer dateMatches;
    private Integer accepted;
    private Integer status;
    private Transaction transaction;

    public Match() {
        transaction = new Transaction();
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
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

    public Integer getDateMatches() {
        return dateMatches;
    }

    public void setDateMatches(Integer dateMatches) {
        this.dateMatches = dateMatches;
    }

    public Integer getAccepted() {
        return accepted;
    }

    public void setAccepted(Integer accepted) {
        this.accepted = accepted;
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

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", profile1Id=" + profile1Id +
                ", profile2Id=" + profile2Id +
                ", dateMatches=" + dateMatches +
                ", accepted=" + accepted +
                ", status=" + status +
                ", txId=" + this.transaction.getTxId() +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() +
                ", txDate=" + this.transaction.getTxDate() +
                ", txUpdate=" + this.transaction.getTxUpdate() +
                '}';
    }
}
