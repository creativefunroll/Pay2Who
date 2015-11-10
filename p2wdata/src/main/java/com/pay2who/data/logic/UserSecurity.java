package com.pay2who.data.logic;

import com.pay2who.core.models.ChangePasswordInfo;
import com.pay2who.core.models.LoginInfo;
import com.pay2who.core.models.Message;
import com.pay2who.core.models.SignupInfo;
import com.pay2who.core.serv.IUserSecurity;

import java.util.Map;

/**
 * Created by vishal on 11/10/2015.
 */
public class UserSecurity extends DBase implements IUserSecurity {

    public UserSecurity() {
        super("");
    }

    @Override
    public Message<String> Login(LoginInfo info) throws Exception {
        return this.getHelper().login(info);
    }

    @Override
    public Message<Boolean> ChangePassword(ChangePasswordInfo info) throws Exception {
        return this.getHelper().changePassword(info);
    }

    @Override
    public Message<Boolean> Signup(SignupInfo info) throws Exception {
        Message<Map<String,Object>> result = this.getHelper().createUser(info);
        if(result.getStatusCode() == 200) {
            //TODO: Fetch Proper Token From the Map
            String token = result.getData().entrySet().iterator().next().getValue().toString();
            info.setToken(token);
            Message<Boolean> saveResponse = this.getHelper().saveUserDetails(info);
            return ((saveResponse.getStatusCode() == 200)  ? saveResponse : saveResponse.<Boolean>ConvertWithoutData());
        }
        else
            return result.<Boolean>ConvertWithoutData();
    }

    @Override
    public void Logout() throws Exception {
        this.shut();
    }
}
