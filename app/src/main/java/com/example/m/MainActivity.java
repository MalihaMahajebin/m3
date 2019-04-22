package com.example.m;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuthException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b;
    private EditText et,ett;
    private TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.reg);
        et=findViewById(R.id.email);
        ett=findViewById(R.id.pw);
         reg=findViewById(R.id.sign);
         b.setOnClickListener(this);
         reg.setOnClickListener(this);
         fire=FirebaseAuthException.get;
    }
    private void registerUser(){
        String email=et.getText().toString().trim();
        String pw=ett.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pw)){
        Toast.makeText(this,"Please enter password",Toast.LENGTH_SHORT).show();
        return;
    }}
    @Override
    public void onClick(View v) {
        if(v==b)
        {
            registerUser();
        }
        if(v==reg){

        }

    }
}
