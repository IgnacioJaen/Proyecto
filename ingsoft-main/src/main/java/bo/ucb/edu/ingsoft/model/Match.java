package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Photos {
    private Integer photosId;
    private Integer categoryId;
    private String photoPath;
    private Integer status;
    private Transaction transaction;

    public Photos() {
    }

    public Integer getPhotosId() {
        return photosId;
    }

    public void setPhotosId(Integer photosId) {
        this.photosId = photosId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
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
        return "Photos{" +
                "photosId=" + photosId +
                ", categoryId=" + categoryId +
                ", photoPath='" + photoPath + '\'' +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
