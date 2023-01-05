package com.travelmanagementsystem.utility;

import com.travelmanagementsystem.domain.Authority;
import com.travelmanagementsystem.domain.User;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LoginResponse {

    private Long userId;

    private String userEmail;

    private String userName;

    private String token;

    private LocalDate tokenCreatedDate;

    private int tokenExpirationTime;

    private Set<String> authorities = new HashSet<>();

    public LoginResponse() {
    }

    public LoginResponse(User user, String jwt) {
        this.userId = user.getId();
        this.userName = user.getLogin();
        this.userEmail = user.getEmail();
        this.setTokenCreatedDate(LocalDate.now());
        this.setTokenExpirationTime(24 * 30 * 60 * 60);
        this.token = jwt;
        this.authorities = user.getAuthorities().stream().map(Authority::getName).collect(Collectors.toSet());
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDate getTokenCreatedDate() {
        return tokenCreatedDate;
    }

    public int getTokenExpirationTime() {
        return tokenExpirationTime;
    }

    public void setTokenExpirationTime(int tokenExpirationTime) {
        this.tokenExpirationTime = tokenExpirationTime;
    }

    public void setTokenCreatedDate(LocalDate tokenCreatedDate) {
        this.tokenCreatedDate = tokenCreatedDate;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }
}
