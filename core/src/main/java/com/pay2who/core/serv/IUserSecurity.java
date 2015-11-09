package com.pay2who.core.serv;

import com.pay2who.core.models.ChangePasswordInfo;
import com.pay2who.core.models.LoginInfo;

/**
 * Created by vishal on 11/9/2015.
 */
public interface IUserSecurity {
    public boolean Login(LoginInfo info);

    public boolean ChangePassword(ChangePasswordInfo info);
}
