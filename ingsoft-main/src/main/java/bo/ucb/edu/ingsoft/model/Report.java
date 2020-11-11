package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Report {
    private Integer reportId;
    private Integer reportOpId;
    private Integer chatId;
    private Integer status;
    private Transaction transaction;


    // Constructor de la clase Report, instanciando el objeto Transaction
    public Report() {
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

    // Setters Y Getters generados para los demas atributos de la clase Report
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

    public Integer getReportOpId() {
        return reportOpId;
    }
    public void setReportOpId(Integer reportOpId) {
        this.reportOpId = reportOpId;
    }

    // Funcion toString generado para imprimir el objeto en una cadena String
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
