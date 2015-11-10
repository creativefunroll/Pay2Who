package com.pay2who.core.helpers;

import com.pay2who.core.serv.IDataSource;
import com.pay2who.core.models.Message;

/**
 * Created by vishal on 11/10/2015.
 */
public class MessageHelper {

    public static <T> Message<T> Success(T data, String message, IDataSource src) {
        Message<T> m = new Message<T>(src);
        m.setData(data);
        m.setStatusCode(200);
        m.setMessage(message);
        return m;
    }

    public static <T> Message<T> Failed(String message, IDataSource src) {
        return Failed(message,500,src);
    }

    public static <T> Message<T> Failed(String message,int statusCode, IDataSource src) {
        Message<T> m = new Message<T>(src);
        m.setStatusCode(statusCode);
        m.setHasErrors(true);
        m.setMessage(message);
        return m;
    }

    public static <T> Message<T> Success(T data, IDataSource src) {
        return Success(data,null,src);
    }

    public static <T> Message<T> Success(T data) {
        return Success(data,null);
    }

    public static <T> Message<T> Failed(String message) {
        return Failed(message, 500, null);
    }
}
