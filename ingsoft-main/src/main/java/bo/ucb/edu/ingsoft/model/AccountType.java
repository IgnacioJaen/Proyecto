package bo.ucb.edu.ingsoft.model;

public class AccountType {
    private Integer accountTypeId;
    private String type;
    private Float price;
    private Integer status;
    private Integer txId;
    private String txHost;
    private Integer txUser;
    private String txDate;
    private String txUpdate;

    public AccountType(){

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

    public Integer getTxUser() {
        return txUser;
    }

    public void setTxUser(Integer txUser) {
        this.txUser = txUser;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public String getTxUpdate() {
        return txUpdate;
    }

    public void setTxUpdate(String txUpdate) {
        this.txUpdate = txUpdate;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeId=" + accountTypeId +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUser=" + txUser +
                ", txDate='" + txDate + '\'' +
                ", txUpdate='" + txUpdate + '\'' +
                '}';
    }
}
