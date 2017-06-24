package com.example.zhang.mydesign;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FourActivity extends AppCompatActivity implements DrawerLayout.DrawerListener, View.OnClickListener {

    private Toolbar mToolBar;
    private DrawerLayout mDrawer;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        initView();
    }

    private void initView() {
        mToolBar = (Toolbar) findViewById(R.id.my_tollbar);
        setSupportActionBar(mToolBar);
        ActionBar actionbar= getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);//设置home按键

        mDrawer = (DrawerLayout) findViewById(R.id.tool_bar_drawerlayout);
        mDrawer.addDrawerListener(this);
        //添加一个联动代码
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, R.string.open, R.string.close);
        mDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();//同步状态

        mButton = (Button) findViewById(R.id.tiaozhuan);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {

    }

    @Override
    public void onDrawerOpened(View drawerView) {

    }

    @Override
    public void onDrawerClosed(View drawerView) {

    }

    @Override
    public void onDrawerStateChanged(int newState) {

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,FiveActivity.class));
    }
}
