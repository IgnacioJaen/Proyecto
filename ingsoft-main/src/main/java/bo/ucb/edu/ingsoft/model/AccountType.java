package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class AccountType {

    private Integer accountTypeId;
    private String type;
    private Float price;
    private Integer status;
    private Transaction transaction;

    public AccountType(){
        transaction = new Transaction();
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

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
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
        return "AccountType{" +
                "accountTypeId=" + accountTypeId +
                ", type='" + type + '\'' +
                ", price=" + price + '\'' +
                ", status=" + status + '\'' +
                ", txId=" + this.transaction.getTxId() + '\'' +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() + '\'' +
                ", txDate=" + this.transaction.getTxDate() + '\'' +
                ", txUpdate=" + this.transaction.getTxUpdate() + '\'' +
                '}';
    }
}
