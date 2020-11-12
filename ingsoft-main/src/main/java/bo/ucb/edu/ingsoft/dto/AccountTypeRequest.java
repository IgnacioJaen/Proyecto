package bo.ucb.edu.ingsoft.dto;


public class AccountTypeRequest {

    private Integer accountTypeId;
    private String type;
    private Float price;

    // Constructor vacio de la clase AccounTypeRequest
    public AccountTypeRequest()
    {

    }

    // Setters Y Getters generados para los demas atributos de la clase AccountTypeRequest
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

    // Funcion toString generado para imprimir el objeto en una cadena String
    @Override
    public String toString() {
        return "AccountTypeRequest{" +
                "accountTypeId=" + accountTypeId +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}