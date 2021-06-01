package com.example.alfasdkexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alfasdk.MyLoginActivity;
import com.example.alfasdk.SdkInterface;

public class MainActivityApp extends MyLoginActivity {

    Button btnLogin;
    private String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MjEwMTUyNTcyNTg3IiwiZXhwIjoxNjIyNTQ0NzYxLCJpYXQiOjE2MjI1MjY3NjF9.xosPJufisZdjf17iM79-vdVEg6WX0V72wKyGl3uEL_XdItpJSBE5iXuLy23fV_JgIb2aSrbNeWfaL-yzuYzPQA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            SdkInterface sdkInterface=new MyLoginActivity();
            sdkInterface.login(v, token, "PK54ALFH0005001004799205","4210152572587");
        });
    }

}