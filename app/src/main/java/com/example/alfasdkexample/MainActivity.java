package com.example.alfasdkexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alfasdk.LoginActivity;
import com.example.alfasdk.SdkInterface;

public class MainActivity extends LoginActivity {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SdkInterface sdkInterface=new LoginActivity();
                sdkInterface.login(v);
            }
        });
        SdkInterface sdkInterface;
    }
}