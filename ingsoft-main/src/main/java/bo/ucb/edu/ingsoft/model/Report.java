package bo.ucb.edu.ingsoft.model;

public class Report {
    private Integer reportId;
    private Integer chatId;
    private Integer status;
    private Transaction transaction;

    public Report() {
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

    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", chatId=" + chatId +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
