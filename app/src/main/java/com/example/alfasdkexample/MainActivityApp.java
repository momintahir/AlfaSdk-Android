package com.example.alfasdkexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alfasdk.MyLoginActivity;
import com.example.alfasdk.SdkInterface;

public class MainActivityApp extends MyLoginActivity {

    Button btnLogin;
    private String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MjEwMTUyNTcyNTg3IiwiZXhwIjoxNjIwMDQwMjI4LCJpYXQiOjE2MjAwMjIyMjh9.8HETM22wMA-g0xwLdqz0s66volbdyHqwDsd1EfFPqmoIVvCrY3vWohmu_nlQ8aiIicKt0YCjJIPNgIBaxI8i7Q";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SdkInterface sdkInterface=new MyLoginActivity();
                sdkInterface.login(v, token, "PK54ALFH0005001004799205","4210152572587");
            }
        });
    }
}