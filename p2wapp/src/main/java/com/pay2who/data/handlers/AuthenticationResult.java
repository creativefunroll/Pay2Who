package com.pay2who.data.handlers;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.pay2who.core.helpers.MessageHelper;
import com.pay2who.core.serv.IServiceReference;

/**
 * Created by vishal on 11/10/2015.
 */
public class AuthenticationResult extends ResultBase<String> implements Firebase.AuthResultHandler {

    public AuthenticationResult(IServiceReference<Firebase> source) {
        super(source);
    }

    @Override
    public void onAuthenticated(AuthData authData) {
        result = MessageHelper.<String>Success(authData.getToken(), source);
    }

    @Override
    public void onAuthenticationError(FirebaseError firebaseError) {
        result = MessageHelper.<String>Failed(firebaseError.getMessage(), source);
    }

}
