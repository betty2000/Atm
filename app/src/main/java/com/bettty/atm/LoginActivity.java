package com.bettty.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

public void login(View view){
    EditText edUsername = findViewById(R.id.username);
    EditText edpassword = findViewById(R.id.password);
    String username = edUsername.getText().toString();
    String passord = edpassword.getText().toString();
    if("jack".equals(username)&&"1234".equals(passord)){
        finish();
    }else{
        new AlertDialog.Builder(this)
                .setTitle("登入訊息")
                .setMessage("登入失敗")
                .setPositiveButton("OK",null)
                .show();
    }
}}
