package com.pay2who.core.helpers;

import android.content.res.Resources;

/**
 * Created by vishal on 11/10/2015.
 */
public class ResourceManager {

    public static String getResource(int r) {
        return Resources.getSystem().getString(r);
    }
}
