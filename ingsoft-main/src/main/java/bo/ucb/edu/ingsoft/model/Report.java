package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Report {
    private Integer reportId;
    private Integer reportOpId;
    private Integer chatId;
    private Integer status;
    private Transaction transaction;


    public Report() {
        transaction = new Transaction();
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
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

    public Integer getReportOpId() {
        return reportOpId;
    }

    public void setReportOpId(Integer reportOpId) {
        this.reportOpId = reportOpId;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", reportOpId=" + reportOpId +
                ", chatId=" + chatId +
                ", status=" + status +
                ", txId=" + this.transaction.getTxId() +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() +
                ", txDate=" + this.transaction.getTxDate() +
                ", txUpdate=" + this.transaction.getTxUpdate() +
                '}';
    }
}
