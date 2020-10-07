package com.example.demoZero.domain;

public class User {
    private String fullName;
    private  Integer age;
    private Boolean employed;

    public User() {
    }

    public User(String fullName, Integer age, Boolean employed, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.employed = employed;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }



    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getEmployed() {
        return employed;
    }

    public void setEmployed(Boolean employed) {
        this.employed = employed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
}
