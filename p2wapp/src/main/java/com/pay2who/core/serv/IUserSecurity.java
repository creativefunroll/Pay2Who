package com.pay2who.core.serv;

import com.pay2who.core.models.ChangePasswordInfo;
import com.pay2who.core.models.LoginInfo;
import com.pay2who.core.models.Message;
import com.pay2who.core.models.SignupInfo;

import java.util.Map;

/**
 * Created by vishal on 11/9/2015.
 */
public interface IUserSecurity {
    public Message<String> Login(LoginInfo info) throws Exception;

    public Message<Boolean> ChangePassword(ChangePasswordInfo info) throws Exception;

    public Message<Boolean> Signup(SignupInfo info) throws Exception;

    public void Logout() throws Exception;
}
