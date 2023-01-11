package com.travelmanagementsystem.service.dto;

import com.travelmanagementsystem.constant.Gender;
import com.travelmanagementsystem.domain.Authority;
import com.travelmanagementsystem.domain.User;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Set;
import java.util.stream.Collectors;

public class AgentDTO {

    private Long id;

    private String login;

    private String firstName;

    private String lastName;

    private String email;

    private String imageUrl;

    private String mobile;

    @Enumerated(EnumType.STRING)
    private Gender prefix;

    private Set<String> authorities;

    public AgentDTO(User user) {
        this.id = user.getId();
        this.login = user.getLogin();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.imageUrl = user.getImageUrl();
        this.mobile = user.getMobile();
        this.prefix = user.getPrefix();
        this.authorities = user.getAuthorities().stream().map(Authority::getName).collect(Collectors.toSet());

    }

    public AgentDTO() {
    }

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Gender getPrefix() {
        return prefix;
    }

    public void setPrefix(Gender prefix) {
        this.prefix = prefix;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }
}
