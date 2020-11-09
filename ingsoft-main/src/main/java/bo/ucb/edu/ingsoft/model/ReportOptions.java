package bo.ucb.edu.ingsoft.model;

public class ReportOptions {
    private Integer reportId;
    private Integer reportOpId;
    private Integer messageId;
    private String description;
    private Integer status;
    private Transaction transaction;

    public ReportOptions() {
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getReportOpId() {
        return reportOpId;
    }

    public void setReportOpId(Integer reportOpId) {
        this.reportOpId = reportOpId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
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

    @Override
    public String toString() {
        return "ReportOptions{" +
                "reportId=" + reportId +
                ", reportOpId=" + reportOpId +
                ", messageId=" + messageId +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
