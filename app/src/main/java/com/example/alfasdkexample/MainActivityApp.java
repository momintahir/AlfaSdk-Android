package com.example.alfasdkexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alfasdk.MyLoginActivity;
import com.example.alfasdk.SdkInterface;

public class MainActivityApp extends MyLoginActivity {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SdkInterface sdkInterface=new MyLoginActivity();
                sdkInterface.login(v,"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MjEwMTUyNTcyNTg3IiwiZXhwIjoxNjE1MjA2MTQ1LCJpYXQiOjE2MTUxODgxNDV9._oXSqsHmKJHoieyjxIg-uWieLIBAnem6aubUkkn8gixsq6RJ_6xbWX01X6k_oum4_i1VILA660SNRNlOZC_YTg",
                        "4210152572587","PK54ALFH0005001004799205");
            }
        });
    }
}