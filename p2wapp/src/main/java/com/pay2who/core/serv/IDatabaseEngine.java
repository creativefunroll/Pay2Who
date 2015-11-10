package com.pay2who.core.serv;

import java.util.HashMap;

/**
 * Created by vishal on 11/9/2015.
 */
public interface IDatabaseEngine<T> {

    public IUserSecurity getUserSecurity();

    public HashMap<String,IServiceReference<T>> getServiceMap();


}
