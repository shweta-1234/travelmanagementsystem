package com.travelmanagementsystem.service.dto;

import com.travelmanagementsystem.constant.Gender;
import com.travelmanagementsystem.constant.TravelPreference;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class SubAgentDTO {

    private Long id;

    private String login;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    @Enumerated(EnumType.STRING)
    private Gender gender ;

    @Enumerated(EnumType.STRING)
    private TravelPreference preference;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public TravelPreference getPreference() {
        return preference;
    }

    public void setPreference(TravelPreference preference) {
        this.preference = preference;
    }
}
