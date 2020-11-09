package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class ReportOptions {
    private Integer reportOpId;
    private String description;
    private Integer status;
    private Transaction transaction;

    public ReportOptions() {
        transaction = new Transaction();
    }

    public Integer getReportOpId() {
        return reportOpId;
    }

    public void setReportOpId(Integer reportOpId) {
        this.reportOpId = reportOpId;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "ReportOptions{" +
                ", reportOpId=" + reportOpId +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", txId=" + this.transaction.getTxId() +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() +
                ", txDate=" + this.transaction.getTxDate() +
                ", txUpdate=" + this.transaction.getTxUpdate() +
                '}';
    }
}
