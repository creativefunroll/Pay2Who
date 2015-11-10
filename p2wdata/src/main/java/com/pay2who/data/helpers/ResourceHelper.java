package com.pay2who.data.helpers;

import android.content.res.Resources;

import com.pay2who.core.helpers.ResourceManager;
import com.pay2who.p2wdata.R;

/**
 * Created by vishal on 11/10/2015.
 */
public class ResourceHelper {

    public static String getReference() {
        return getResource(R.string.reference);
    }

    public static String getLocalbase() { return getResource(R.string.localbase); }

    private static String getResource(int r) {
        return ResourceManager.getResource(r);
    }
}
