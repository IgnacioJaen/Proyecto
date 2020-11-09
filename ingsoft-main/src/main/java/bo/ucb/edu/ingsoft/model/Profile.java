package bo.ucb.edu.ingsoft.model;

public class Profile {
    private Integer profileId;
    private Integer userId;
    private Integer status;
    private Transaction transaction;

    public Profile() {
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        return "Profile{" +
                "profileId=" + profileId +
                ", userId=" + userId +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
