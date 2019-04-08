package com.example;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

//import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TalkActivity extends AppCompatActivity {
private List<Msg>msgList=new ArrayList<>();
private EditText inputText;
private Button send;
private RecyclerView msgRecyclerView;
private MsgAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk);
        Toolbar mToolbarTb = (Toolbar) findViewById(R.id.toolbar);
        mToolbarTb.setTitle("聊天");
        setSupportActionBar(mToolbarTb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbarTb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        Button button=findViewById(R.id.send);
        setViewDrawable(R.mipmap.send,button,0);

         inputText = (EditText) findViewById(R.id.input_text);
         send = (Button) findViewById(R.id.send);
         msgRecyclerView = (RecyclerView) findViewById(R.id.msg_recycler_view);
         LinearLayoutManager layoutManager = new LinearLayoutManager(this);
         msgRecyclerView.setLayoutManager(layoutManager);
         adapter = new MsgAdapter(msgList);
         msgRecyclerView.setAdapter(adapter);
         send.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String content = inputText.getText().toString();
            if (!"".equals(content)) {
                Msg msg = new Msg(content, Msg.TYPE_SENT);
                msgList.add(msg);
                Talk(inputText.getText().toString());
                adapter.notifyItemInserted(msgList.size() - 1);
                msgRecyclerView.scrollToPosition(msgList.size() - 1);
                inputText.setText("");
            }
        }
    });

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
    private void Talk( final String a)
    {
        RequestQueue mqueue = Volley.newRequestQueue(TalkActivity.this);
        StringRequest stringReques1 = new StringRequest(Request.Method.POST, "http://www.tuling123.com/openapi/api", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                Robot robot=gson.fromJson(response,Robot.class);
                Msg msg1=new Msg(robot.getText(),Msg.TYPE_RECEIVED);
                msgList.add(msg1);
                //  Log.i("aa",response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("aa", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<String, String>();
                map.put("key", "6df10754a4244c33b3ba20802be120fb");
                map.put("info", a);
                map.put("userid", "296229");
                return map;
            }
        };
        mqueue.add(stringReques1);
    }
}
