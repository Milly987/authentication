package com.code.authentication.services;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
