package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class ProfileSubcategory {
    private Integer profileSubId;
    private Integer profileId;
    private Integer subcategoryId;
    private Integer status;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;
    private Date txUpdate;

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

    @Override
    public String toString() {
        return "ProfileSubcategory{" +
                "profileSubId=" + profileSubId +
                ", profileId=" + profileId +
                ", subcategoryId=" + subcategoryId +
                ", status=" + status +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                ", txUpdate=" + txUpdate +
                '}';
    }
}
