package com.travelmanagementsystem.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenExpiration {

    @Value("${jhipster.security.authentication.jwt.token-validity-in-seconds}")
    private int forNotRememberMe;

    @Value("${jhipster.security.authentication.jwt.token-validity-in-seconds-for-remember-me}")
    private int forRememberMe;

    public int getExpirationTimeOfToken(boolean rememberMe) {
        int value;
        int finalValue;

        if (rememberMe == true) {
            value = forRememberMe / 60;
            finalValue = value / 60;
            return finalValue;

        } else {
            value = forNotRememberMe / 60;
            finalValue = value / 60;
            return finalValue;

        }
    }
}
