package com.pay2who.core.helpers;

/**
 * Created by vishal on 11/10/2015.
 */
import android.app.Activity;
import android.content.Context;

public class ApplicationContextHelper {
    private static Context gContext;

    public static void setContext( Context activity) {
        gContext = activity;
    }

    public static Context getContext() {
        return gContext;
    }
}
