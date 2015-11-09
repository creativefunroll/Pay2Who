package com.pay2who.core.serv;

/**
 * Created by vishal on 11/9/2015.
 */
public interface IServiceReference<T> {

    public String getUrl();

    public T getServiceConnection();

    public void shut();

    public void doAction(IDataOperation operation);
}

