package com.pay2who.data.helpers;

/**
 * Created by vishal on 11/10/2015.
 */
import com.firebase.client.Firebase;
import com.pay2who.core.helpers.ApplicationContextHelper;
import com.pay2who.core.helpers.ResourceManager;
import com.pay2who.core.serv.IServiceReference;
import com.snappydb.DB;
import com.snappydb.DBFactory;

public class Sources {

    protected DB offlineDb;
    protected IServiceReference<Firebase> source;

    //TODO: Dont Hardcode
    protected final String signupInfoLocal = "signupInfo";

    protected  DB getLocal() throws  Exception {
        return DBFactory.open(ApplicationContextHelper.getContext(), "pay2who");
    }

    protected <T> T getLocalObject(Class<T> type) throws  Exception {
        return getLocal().getObject(type.getName(),type);
    }

}
