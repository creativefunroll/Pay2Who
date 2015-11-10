package com.pay2who.biz;

import com.pay2who.core.helpers.MessageHelper;
import com.pay2who.core.models.LoginInfo;
import com.pay2who.core.models.Message;
import com.pay2who.core.models.SignupInfo;
import com.pay2who.data.helpers.DatabaseHelper;
import com.pay2who.data.logic.ConnectionLocation;
import com.pay2who.data.logic.UserSecurity;

/**
 * Created by vishal on 11/10/2015.
 */
public class Account {

    public Message<Boolean> Signup(SignupInfo info) throws Exception {
        UserSecurity sec = new UserSecurity();
        Message<Boolean> toRespond = sec.Signup(info);
        if(toRespond.getStatusCode() == 200) {
               sec.getHelper().insertLocally(info);
        }
        return toRespond;
    }

    public Message<Boolean> Login(LoginInfo info) throws Exception {

        UserSecurity sec = new UserSecurity();
        DatabaseHelper store = sec.getHelper();
        SignupInfo localInfo = store.findLocally(SignupInfo.class);
        if (localInfo != null) {
           return  (localInfo.getToken() != null) ?
                    ((ConnectionLocation.isConnected()) ? (
                            (store.tokenLogin(localInfo.getToken()).getStatusCode() == 200) ? MessageHelper.<Boolean>Success(true) :
                                    MessageHelper.<Boolean>Failed("Please Login Again."))
                            : MessageHelper.<Boolean>Success(true)) :
                    MessageHelper.<Boolean>Failed("Login Check Failed. Please Login Again.");
        }
        else {
            return MessageHelper.<Boolean>Failed("Incorrect Credentials");
        }
    }

}
