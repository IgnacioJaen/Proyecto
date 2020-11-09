package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class ProfileSubcategory {
    private Integer profileSubId;
    private Integer profileId;
    private Integer subcategoryId;
    private Integer status;
    private Transaction transaction;

    public ProfileSubcategory() {
    }

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

    @Override
    public String toString() {
        return "ProfileSubcategory{" +
                "profileSubId=" + profileSubId +
                ", profileId=" + profileId +
                ", subcategoryId=" + subcategoryId +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
