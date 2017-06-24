package com.example.zhang.mydesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class FiveActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        initView();
    }

    private void initView() {
        mToolBar = (Toolbar) findViewById(R.id.five_toolbar);
        setSupportActionBar(mToolBar);//toolbar作为actionbar去使用
    }
}
