package com.pay2who.core.models;

/**
 * Created by vishal on 11/9/2015.
 */
public class ChangePasswordInfo {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    private String email;

    private String oldPassword;

    private String newPassword;
}
