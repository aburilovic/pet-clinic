package com.aburilovic.petclinic.model;

public class Person extends BaseEntity {
    private String firstNamel;
    private String lastName;

    public String getFirstNamel() {
        return firstNamel;
    }

    public void setFirstNamel(String firstNamel) {
        this.firstNamel = firstNamel;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
