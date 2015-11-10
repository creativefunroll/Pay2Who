package com.pay2who.data.logic;


import com.firebase.client.Firebase;
import com.pay2who.core.serv.IDataOperation;
import com.pay2who.core.serv.IServiceReference;
import com.pay2who.data.helpers.DatabaseHelper;
import com.pay2who.data.helpers.ResourceHelper;

/**
 * Created by vishal on 11/10/2015.
 */
public class DBase implements IServiceReference<Firebase> {

    private String url;
    private Firebase fb;
    protected DBase(String url) {
        this.url=url;
    }

    @Override
    public String getUrl() {
        return ResourceHelper.getReference() + url;
    }

    @Override
    public Firebase getServiceConnection() {

        if(fb!=null)
            return  fb;

        fb= new Firebase(getUrl());
        return fb;
    }

    @Override
    public void shut() {
        if(fb != null)
        fb.unauth();
    }

    public DatabaseHelper getHelper() {
        DatabaseHelper dh = new DatabaseHelper(this);
        return dh;
    }

    @Override
    public void doAction(IDataOperation operation) {

    }
}