package com.pay2who.data.helpers;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.pay2who.core.helpers.MessageHelper;
import com.pay2who.core.models.ChangePasswordInfo;
import com.pay2who.core.models.LoginInfo;
import com.pay2who.core.models.Message;
import com.pay2who.core.models.SignupInfo;
import com.pay2who.core.serv.IServiceReference;
import com.pay2who.data.handlers.AuthenticationResult;
import com.pay2who.data.handlers.GeneralResult;
import com.pay2who.data.handlers.ValueResult;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by vishal on 11/10/2015.
 */
public class DatabaseHelper extends Sources {

    public DatabaseHelper(IServiceReference<Firebase> source) {
        this.source=source;
    }

    public <T> T findLocally(Class<T> type) throws Exception {
        return this.getLocalObject(type);
    }

    public  Message<String> tokenLogin(String token) {
        AuthenticationResult ar = new AuthenticationResult(source);
        source.getServiceConnection().authWithCustomToken(token, ar);
        return ar.getResult();
    }

    public  Message<String> login(LoginInfo info) throws Exception {
        AuthenticationResult gr = new AuthenticationResult(source);
        source.getServiceConnection().authWithPassword(info.getEmail(), info.getPassword(), gr);
        return gr.getResult();
    }

    public Message<Boolean> changePassword(ChangePasswordInfo info) throws Exception {
        GeneralResult gr = new GeneralResult(source);
        source.getServiceConnection().changePassword(info.getEmail(), info.getOldPassword(), info.getNewPassword(), gr);
        return gr.getResult();
    }

    public Message<Map<String,Object>> createUser(LoginInfo info) throws Exception {
        ValueResult vr = new ValueResult(source);
        source.getServiceConnection().createUser(info.getEmail(), info.getPassword(), vr);
        return vr.getResult();
    }

    public Message<Boolean> saveUserDetails(SignupInfo info) throws Exception {

        //TODO: Dont Hardcode
        String child = "users";
        source.getServiceConnection().child(child).child(info.getEmail()).setValue(info);
        return MessageHelper.<Boolean>Success(true);
    }

}
