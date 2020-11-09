package bo.ucb.edu.ingsoft.dto;


public class AccountTypeRequest {

    private Integer accountTypeId;
    private String type;
    private Float price;

    public AccountTypeRequest()
    {

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

    @Override
    public String toString() {
        return "AccountTypeRequest{" +
                "accountTypeId=" + accountTypeId +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
