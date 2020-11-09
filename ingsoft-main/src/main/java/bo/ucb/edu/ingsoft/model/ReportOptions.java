package bo.ucb.edu.ingsoft.model;

public class ReportOptions {
    private Integer reportOpId;
    private String description;
    private Integer status;
    private Transaction transaction;

    public ReportOptions() {
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

    @Override
    public String toString() {
        return "ReportOptions{" +
                ", reportOpId=" + reportOpId +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
