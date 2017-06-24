package com.example.zhang.mydesign;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThreeActivity extends AppCompatActivity implements View.OnClickListener {

    private NavigationView mLeftcontent;
    private ImageView mLeftTouxiang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        initView();
    }

    private void initView() {
        mLeftcontent = (NavigationView) findViewById(R.id.left_content);

        //获取子控件
        View headerView = mLeftcontent.getHeaderView(0);
        View mLeftTouxiang = headerView.findViewById(R.id.left_touxiang);
        mLeftTouxiang.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_touxiang:

                startActivity(new Intent(this,FourActivity.class));
                break;
        }
    }
}
