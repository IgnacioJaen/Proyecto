package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.model.Transaction;

public class UserRequest {

    private Integer userId;
    private String accountType;
    private String userType;
    private String name;
    private String surname;
    private String birthdate;
    private Boolean gender;
    private String email;
    private String password;
    private String userPhoto;

    public UserRequest()
    {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }



    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }



    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "userId=" + userId +
                ", accountType='" + accountType + '\'' +
                ", userType='" + userType + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                '}';
    }
}
