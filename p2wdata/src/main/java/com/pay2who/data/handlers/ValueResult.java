package com.pay2who.data.handlers;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.pay2who.core.helpers.MessageHelper;
import com.pay2who.core.serv.IServiceReference;

import java.util.Map;

/**
 * Created by vishal on 11/10/2015.
 */
public class ValueResult extends ResultBase<Map<String,Object>> implements Firebase.ValueResultHandler<Map<String, Object>> {

    public ValueResult(IServiceReference<Firebase> source) { super(source); }

    @Override
    public void onSuccess(Map<String, Object> stringObjectMap) {
        result = MessageHelper.<Map<String, Object>>Success(stringObjectMap, source);
    }

    @Override
    public void onError(FirebaseError firebaseError) {
        result = MessageHelper.<Map<String, Object>>Failed(firebaseError.getMessage(),source);
    }
}
