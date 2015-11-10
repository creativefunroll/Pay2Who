package com.pay2who.data.handlers;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.pay2who.core.helpers.MessageHelper;
import com.pay2who.core.serv.IServiceReference;

/**
 * Created by vishal on 11/10/2015.
 */
public class GeneralResult extends ResultBase<Boolean> implements  Firebase.ResultHandler  {

    public GeneralResult(IServiceReference<Firebase> source) { super(source); }

    @Override
    public void onSuccess() {
        result = MessageHelper.<Boolean>Success(true, source);
    }

    @Override
    public void onError(FirebaseError firebaseError) {
        result = MessageHelper.<Boolean>Failed(firebaseError.getMessage(),source);
    }
}
