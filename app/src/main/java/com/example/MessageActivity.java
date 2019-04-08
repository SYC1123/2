package com.example;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class MessageActivity extends AppCompatActivity {
    private List<UserTalk>userTalkList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Toolbar mToolbarTb = (Toolbar) findViewById(R.id.toolbar);
        mToolbarTb.setTitle("消息");
        setSupportActionBar(mToolbarTb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbarTb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        initTalk();
        TalkAdapter adapter= new TalkAdapter(MessageActivity.this,R.layout.user_talk,userTalkList);
        ListView listView=(ListView)findViewById(R.id.list_View1);
        listView.setAdapter(adapter);
//item点击事件进入activi
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                expressItemClick(i);
            }
        });

        Button button1=findViewById(R.id.My_friend);
        setViewDrawable(R.mipmap.my_friend,button1,1);
        Button button2=findViewById(R.id.Friend_apply);
        setViewDrawable(R.mipmap.friend_apply,button2,1);
        Button button3=findViewById(R.id.Friend_add);
        setViewDrawable(R.mipmap.friend_add,button3,1);
        Button button4=findViewById(R.id.Space_dynamic);
        setViewDrawable(R.mipmap.space_dynamic,button4,1);
        Button button5=findViewById(R.id.In_dynamic);
        setViewDrawable(R.mipmap.in_dynamic,button5,1);

        Button button6=findViewById(R.id.Friend_add);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MessageActivity.this,Friend_addActivity.class);
                startActivity(intent);
            }
        });

    }
    private void initTalk()
    {
        UserTalk people1=new UserTalk("CSTI",R.mipmap.friend1);
        userTalkList.add(people1);
        UserTalk people2=new UserTalk("ARM",R.mipmap.friend2);
        userTalkList.add(people2);
        UserTalk people3=new UserTalk("UI",R.mipmap.frien3);
        userTalkList.add(people3);
        UserTalk people4=new UserTalk("WEB",R.mipmap.frie4);
        userTalkList.add(people4);
        UserTalk people5=new UserTalk("NS",R.mipmap.friend5);
        userTalkList.add(people5);
        UserTalk people6=new UserTalk("IGM",R.mipmap.frien6);
        userTalkList.add(people6);
        UserTalk people7=new UserTalk("ACM",R.mipmap.friend7);
        userTalkList.add(people7);

    }
    //在BUTTON添加图片方法
    private void setViewDrawable(int drawableid, TextView view, int driection)
    {
        Drawable drawable = getResources().getDrawable(drawableid);
        drawable.setBounds(0,0,100,100);
        Drawable[] drawables = new Drawable[4];
        drawables[driection] = drawable;
        view.setCompoundDrawables(drawables[0],drawables[1],drawables[2],drawables[3]);
        view.setCompoundDrawablePadding(0);
    }
//进入activity方法
    public void expressItemClick(int postion){
        if(postion==0) {
            Intent intent = new Intent(MessageActivity.this, TalkActivity.class);
            startActivity(intent);
        }
    }
}
