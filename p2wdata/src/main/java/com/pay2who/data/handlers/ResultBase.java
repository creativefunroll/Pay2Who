package com.pay2who.data.handlers;

import com.firebase.client.Firebase;
import com.pay2who.core.models.Message;
import com.pay2who.core.serv.IServiceReference;

/**
 * Created by vishal on 11/10/2015.
 */
public class ResultBase<T>  {

    public IServiceReference<Firebase> getSource() {
        return source;
    }

    protected IServiceReference<Firebase> source;

    protected ResultBase(IServiceReference<Firebase> source) {
        this.source=source;
    }

    public Message<T> getResult() {
        return result;
    }

    protected Message<T> result;
}
