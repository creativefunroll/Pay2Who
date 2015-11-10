package com.pay2who.core.models;

/**
 * Created by vishal on 11/9/2015.
 */
public class LoginInfo {

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String password;

    private String email;

}
