package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.gson.Gson;

public class FindBasketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_basket);
        Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Gson gson=new Gson();
        BasketballRobot robot=gson.fromJson(data,BasketballRobot.class);

        Toolbar mToolbarTb = (Toolbar) findViewById(R.id.toolbar3);
        mToolbarTb.setTitle("查询成功！");
        setSupportActionBar(mToolbarTb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbarTb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
