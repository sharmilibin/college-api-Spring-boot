package com.admin.collegeapi.util;

import com.auth0.jwt.JWT;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Date;
import java.util.stream.Collectors;

import static com.admin.collegeapi.security.SecurityConstants.EXPIRATION_TIME;
import static com.admin.collegeapi.security.SecurityConstants.SECRET;
import static com.auth0.jwt.algorithms.Algorithm.HMAC512;
public class Utils {


    public static String createJWTToken(User user) {
        return JWT.create()
                .withSubject(user.getUsername() + ":myhash:" + user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(",")))
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .sign(HMAC512(SECRET.getBytes()));

    }

}
