package bo.ucb.edu.ingsoft.dto;

public class UserSubcategoryRequest {

    private Integer userSubId;
    private String subcategory;

    public UserSubcategoryRequest() {
    }

    public Integer getUserSubId() {
        return userSubId;
    }

    public void setUserSubId(Integer userSubId) {
        this.userSubId = userSubId;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @Override
    public String toString() {
        return "UserSubcategoryRequest{" +
                "userSubId=" + userSubId +
                ", subcategory='" + subcategory + '\'' +
                '}';
    }
}
