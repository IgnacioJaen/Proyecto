package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Transaction {
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;
    private Date txUpdate;

    // Constructor de la clase Transaction
    public Transaction()
    {

    }

    // Setters Y Getters generados para los demas atributos de la clase Transaction
    public Integer getTxId() {
        return txId;
    }
    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }
    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Integer getTxUserId() {
        return txUserId;
    }
    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public Date getTxDate() {
        return txDate;
    }
    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public Date getTxUpdate() {
        return txUpdate;
    }
    public void setTxUpdate(Date txUpdate) {
        this.txUpdate = txUpdate;
    }

    // Funcion toString generado para imprimir el objeto en una cadena String
    @Override
    public String toString() {
        return "Transaction{" +
                "txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                ", txUpdate=" + txUpdate +
                '}';
    }
}
