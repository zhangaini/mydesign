package com.example.zhang.mydesign;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/*
   外层使用了一个新的布局 协调者布局 coordinatoorlayout
   内部分成二个区域
        Appbar
 */


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener, View.OnClickListener {

    private TabLayout mTab;
    private FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTab=(TabLayout) findViewById(R.id.my_app_bar_tab);
        mTab.addTab(mTab.newTab().setText("段子"));
        mTab.addTab(mTab.newTab().setText("热点"));
        mTab.addTab(mTab.newTab().setText("军事"));
        mTab.addTab(mTab.newTab().setText("历史"));
        mTab.addTab(mTab.newTab().setText("周边"));
        mTab.setOnTabSelectedListener(this);

        mFab = (FloatingActionButton) findViewById(R.id.my_fab);
        mFab.setOnClickListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.my_fab:
                    //design中的弹出对话框 加强版的Toast
                Snackbar.make(v,"跳转页面",Snackbar.LENGTH_SHORT).setAction("确认", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //点击确认回调
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,SecondActivity.class);
                        startActivity(intent);
                    }
                }).show();
                break;
        }
    }
}
