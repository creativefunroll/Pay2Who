package com.pay2who.p2wapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pay2who.core.helpers.ApplicationContextHelper;
import com.pay2who.core.serv.IDatabaseEngine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ApplicationContextHelper.setContext(this.getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

    }
}
