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
                sdkInterface.login(v,"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MjEwMTUyNTcyNTg3IiwiZXhwIjoxNjE1ODI5MzAxLCJpYXQiOjE2MTU4MTEzMDF9.zY6ImVZwm8aVT0b8wwpCC_oinmFoB47A0iho5yZztPDhYIaKUimM4Ywf_InbrwMADYoXYUqURW5FqdXqOW7WRg",
                        "PK54ALFH0005001004799205","4210152572587");
            }
        });
    }
}