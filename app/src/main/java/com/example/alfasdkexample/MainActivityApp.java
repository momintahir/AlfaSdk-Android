package com.example.alfasdkexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alfasdk.MyLoginActivity;
import com.example.alfasdk.SdkInterface;

public class MainActivityApp extends MyLoginActivity {

    Button btnLogin;
    private String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MjEwMTUyNTcyNTg3IiwiZXhwIjoxNjIxNTIxNDI1LCJpYXQiOjE2MjE1MDM0MjV9.1dP6rp8zSrApl6ZeJSmQ8cFe91RkfIsnkrqZCTnp1QpfwWE6A8ld0rcnxJRKlHWgjj2MqZ4ErclXk8NQsVGL6w";


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