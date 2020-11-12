package bo.ucb.edu.ingsoft.dto;

public class CategoryRequest {
    private Integer categoryId;
        private String nameCategory;

    public CategoryRequest() {
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "CategoryRequest{" +
                "categoryId=" + categoryId +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }
}
