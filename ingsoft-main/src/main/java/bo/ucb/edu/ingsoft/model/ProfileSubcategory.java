package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class ProfileSubcategory {
    private Integer profileSubId;
    private Integer profileId;
    private Integer subcategoryId;
    private Integer status;
    private Transaction transaction;


    // Constructor de la clase ProfileSubcategory, instanciando el objeto Transaction
    public ProfileSubcategory() {
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

    // Setters Y Getters generados para los demas atributos de la clase ProfileSubCategory
    public Integer getProfileSubId() {
        return profileSubId;
    }
    public void setProfileSubId(Integer profileSubId) {
        this.profileSubId = profileSubId;
    }

    public Integer getProfileId() {
        return profileId;
    }
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public Integer getSubcategoryId() {
        return subcategoryId;
    }
    public void setSubcategoryId(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
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

    // Funcion toString generado para imprimir el objeto en una cadena String
    @Override
    public String toString() {
        return "ProfileSubcategory{" +
                "profileSubId=" + profileSubId +
                ", profileId=" + profileId +
                ", subcategoryId=" + subcategoryId +
                ", status=" + status + '\'' +
                ", txId=" + this.transaction.getTxId() + '\'' +
                ", txHost='" + this.transaction.getTxHost() + '\'' +
                ", txUserId=" + this.transaction.getTxUserId() + '\'' +
                ", txDate=" + this.transaction.getTxDate() + '\'' +
                ", txUpdate=" + this.transaction.getTxUpdate() + '\'' +
                '}';
    }
}
