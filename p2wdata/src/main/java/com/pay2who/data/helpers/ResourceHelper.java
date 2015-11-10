package com.pay2who.data.helpers;

import android.content.res.Resources;

import com.pay2who.p2wdata.R;

/**
 * Created by vishal on 11/10/2015.
 */
public class ResourceHelper {

    public static String getReference() {
        return getResource(R.string.reference);
    }

    private static String getResource(int r) {
        return  Resources.getSystem().getString(r);
    }
}
