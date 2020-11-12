package bo.ucb.edu.ingsoft.dto;

public class ProfileRequest {
    private String name;
    private String surname;
    private String birthdate;
    private String gender;
    private String nameSubcategory;
    private String nameCategory;

    // Constructor vacio de la clase ProfileRequest
    public ProfileRequest() {
    }

    // Setters Y Getters generados para los demas atributos de la clase ProfileRequest
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameSubcategory() {
        return nameSubcategory;
    }
    public void setNameSubcategory(String nameSubcategory) {
        this.nameSubcategory = nameSubcategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }
    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    // Funcion toString generado para imprimir el objeto en una cadena String
    @Override
    public String toString() {
        return "ProfileRequest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender=" + gender +
                ", nameSubcategory='" + nameSubcategory + '\'' +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }
}
