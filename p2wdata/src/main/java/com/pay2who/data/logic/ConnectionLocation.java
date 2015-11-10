package com.pay2who.data.logic;

import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by vishal on 11/10/2015.
 */
public class ConnectionLocation extends DBase {

    public static boolean isConnected() {
        return connected;
    }

    private static boolean connected;

    public ConnectionLocation() {
        super(".info/connected");
        ConnectionLocation.connected=true;

        getServiceConnection().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                ConnectionLocation.connected = snapshot.getValue(Boolean.class);
            }

            @Override
            public void onCancelled(FirebaseError error) {
                //TODO: Log if required
            }
        });
    }

}
