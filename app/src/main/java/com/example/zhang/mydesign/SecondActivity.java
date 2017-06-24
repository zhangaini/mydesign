package com.example.zhang.mydesign;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout mUsernameLayout;
    private TextInputLayout mPasswordLayout;
    private EditText mUsername;
    private EditText mPassword;
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        mUsernameLayout = (TextInputLayout) findViewById(R.id.input_username);
        mUsername = (EditText) findViewById(R.id.my_username);
        mPasswordLayout = (TextInputLayout) findViewById(R.id.input_password);
        mPassword = (EditText) findViewById(R.id.my_password);
        mLogin = (Button) findViewById(R.id.second_login);
        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.second_login:
                String name =mUsername.getText().toString();
                String pass =mPassword.getText().toString();
                if(TextUtils.isEmpty(name)){
                    //做友好提示
                    mUsernameLayout.setErrorEnabled(true);
                    mUsernameLayout.setError("请输入用户名");

                }
                else{
                    mUsernameLayout.setErrorEnabled(false);
                    mUsernameLayout.setError("");

                }
                if(TextUtils.isEmpty(pass)){
                    //做友好提示
                    mPasswordLayout.setErrorEnabled(true);
                    mPasswordLayout.setError("请输入用户名");

                }
              else{
                    mPasswordLayout.setErrorEnabled(false);
                    mPasswordLayout.setError("");
                }
                startActivity(new Intent(this,ThreeActivity.class));
                break;
        }


    }
}
