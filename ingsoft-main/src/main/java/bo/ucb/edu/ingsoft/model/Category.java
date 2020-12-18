package bo.ucb.edu.ingsoft.model;


import java.util.Date;

public class Category {
    private Integer categoryId;
    private String name;
    private Integer photoId;
    private String path;
    private Integer status;
    private Transaction transaction;

    // Constructor de la clase Category, instanciando el objeto Transaction
    public Category() {transaction = new Transaction();}

    // SETTERS DE LOS ATRIBUTOS DEL OBJETO TRANSACTION **************
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


    // Setters Y Getters generados para los demas atributos de la clase Category
    public Integer getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {return status;}
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Transaction getTransaction() {
        return transaction;
    }
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Integer getPhotoId() {return photoId;}
    public void setPhotoId(Integer photoID) {this.photoId = photoID;}

    // Funcion toString generado para imprimir el objeto en una cadena String


    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", photoId=" + photoId +
                ", path='" + path + '\'' +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
