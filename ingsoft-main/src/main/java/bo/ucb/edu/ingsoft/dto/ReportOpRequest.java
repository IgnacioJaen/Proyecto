package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.model.Transaction;

public class ReportOpRequest {
    private Integer reportOpId;
    private String description;

    public ReportOpRequest() {
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

    @Override
    public String toString() {
        return "ReportOptions{" +
                ", reportOpId=" + reportOpId +
                ", description='" + description + '\'' +
                '}';
    }
}
