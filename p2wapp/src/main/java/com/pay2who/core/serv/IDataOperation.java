package com.pay2who.core.serv;

/**
 * Created by vishal on 11/9/2015.
 */
public interface IDataOperation<TModel> {

    public void perform(TModel data);
}
