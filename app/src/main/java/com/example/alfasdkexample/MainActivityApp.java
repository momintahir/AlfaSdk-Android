package com.example.alfasdkexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alfasdk.MyLoginActivity;
import com.example.alfasdk.SdkInterface;

public class MainActivityApp extends MyLoginActivity {

    Button btnLogin;
    private String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MjEwMTUyNTcyNTg3IiwiZXhwIjoxNjIxODcwODY1LCJpYXQiOjE2MjE4NTI4NjV9.vzq-GBqQBLthYUfganEGjSeh9FxmiS2cwyAqybwY65WdjlvuuxmO475zO6FANDaFYf0UJh5hMBRpTRQnPBe8Pw";

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