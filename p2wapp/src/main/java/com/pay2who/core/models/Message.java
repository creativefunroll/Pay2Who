package com.pay2who.core.models;

import com.pay2who.core.serv.IDataSource;

/**
 * Created by vishal on 11/10/2015.
 */
public class Message<T> {

    private int statusCode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private boolean hasErrors;

    private String message;

    public <TNew> Message<TNew> ConvertWithoutData() {
        Message<TNew> tn = new Message<TNew>();
        tn.setMessage(this.getMessage());
        tn.setStatusCode(this.getStatusCode());
        tn.setHasErrors(this.isHasErrors());
        return tn;
    }


    public Message() { }

    private IDataSource ds;
    public Message(IDataSource ds) {
        this.ds=ds;
    }

    public IDataSource source() {
        return ds;
    }
}
