package com.example;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.acker.simplezxing.activity.CaptureActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
//private List<Photo>photos;
private static final int REQ_CODE_PERMISSION = 0x1111;
    private TextView tvResult;
    private EditText inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //图片填充
        Button button = findViewById(R.id.btn_Basketball);
        setViewDrawable(R.mipmap.one,button,1);
        Button button1 = findViewById(R.id.btn_Football);
        setViewDrawable(R.mipmap.two,button1,1);
        Button button2 = findViewById(R.id.btn_Focus);
        setViewDrawable(R.mipmap.three,button2,1);
        Button button3 = findViewById(R.id.btn_Tennis);
        setViewDrawable(R.mipmap.four,button3,1);
        Button button4 = findViewById(R.id.btn_Volleyball);
        setViewDrawable(R.mipmap.five,button4,1);

        replaceFragment(new HomeFragment());
//悬浮按钮点击事件
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               replaceFragment(new HomeFragment());
           }
       });
//点击布局
        Button btn_Focus = findViewById(R.id.btn_Focus);
        btn_Focus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FocusActivity.class);
                startActivity(intent);
            }
        });
//消息布局
        ImageView btn_Message = findViewById(R.id.btn_Message);
        btn_Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MessageActivity.class);
                startActivity(intent);
            }
        });
//登录布局
        ImageView btn_Log = findViewById(R.id.btn_Log);
        btn_Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LogActivity.class);
                startActivity(intent);
            }
        });
//篮球直播
        Button basketball=findViewById(R.id.btn_Basketball);
        basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new BasketballFragment());
            }
        });
//足球直播
        Button football=findViewById(R.id.btn_Football);
        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FootballFragment());
            }
        });
//网球直播
        Button tenis=findViewById(R.id.btn_Tennis);
        tenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new TenisFragment());
            }
        });
//排球直播
        Button velloyball=findViewById(R.id.btn_Volleyball);
        velloyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new VolleyballFragment());
            }
        });
//搜索点击事件
        ImageView btn_find=(ImageView)findViewById(R.id.btn_Find);
        btn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText=findViewById(R.id.input);
                RequestQueue mqueue = Volley.newRequestQueue(MainActivity.this);
                StringRequest stringReques1 = new StringRequest(Request.Method.POST, "http://op.juhe.cn/onebox/basketball/team?key=a4444cc1fd977444f497802ea7428b60&team=%E7%83%AD%E7%81%AB", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson=new Gson();
                        BasketballRobot robot=gson.fromJson(response,BasketballRobot.class);
                        Intent intent=new Intent(MainActivity.this,FindBasketActivity.class);
                        intent.putExtra("extra_data",response);
                        startActivity(intent);

                        Log.i("aaaaaaaa",robot.getReason());




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
                        map.put("key", "a4444cc1fd977444f497802ea7428b60&");
                        map.put("info", inputText.getText().toString());
                        //map.put("userid", "6586e3746c7e40e39b8361b097762914");
                        return map;
                    }
                };
                mqueue.add(stringReques1);
           }
        });

 //二维码扫描
        tvResult = (TextView) findViewById(R.id.tv_result);
        ImageView btn = (ImageView) findViewById(R.id.btn_sm);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, REQ_CODE_PERMISSION);
                } else {
                    startCaptureActivityForResult();
                }
            }
        });
    }
//在BUTTON添加图片方法
    private void setViewDrawable(int drawableid, TextView view,int driection)
    {
        Drawable drawable = getResources().getDrawable(drawableid);
        drawable.setBounds(0,0,100,100);
        Drawable[] drawables = new Drawable[4];
        drawables[driection] = drawable;
        view.setCompoundDrawables(drawables[0],drawables[1],drawables[2],drawables[3]);
        view.setCompoundDrawablePadding(0);
    }

//启动碎片
    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_fragment_container,fragment);
        fragmentTransaction.commit();
    }
    private long firstPressedTime;
    @Override
//重写onBackPressed按两次Home返回
    public void onBackPressed() {
        //super.onBackPressed();
        if (System.currentTimeMillis() - firstPressedTime < 2000) {
            super.onBackPressed();
        } else {
            Toast.makeText(MainActivity.this, "再按一次退出", Toast.LENGTH_SHORT).show();
            firstPressedTime = System.currentTimeMillis();
        }
    }
    private void startCaptureActivityForResult() {
        Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean(CaptureActivity.KEY_NEED_BEEP, CaptureActivity.VALUE_BEEP);
        bundle.putBoolean(CaptureActivity.KEY_NEED_VIBRATION, CaptureActivity.VALUE_VIBRATION);
        bundle.putBoolean(CaptureActivity.KEY_NEED_EXPOSURE, CaptureActivity.VALUE_NO_EXPOSURE);
        bundle.putByte(CaptureActivity.KEY_FLASHLIGHT_MODE, CaptureActivity.VALUE_FLASHLIGHT_OFF);
        bundle.putByte(CaptureActivity.KEY_ORIENTATION_MODE, CaptureActivity.VALUE_ORIENTATION_AUTO);
        bundle.putBoolean(CaptureActivity.KEY_SCAN_AREA_FULL_SCREEN, CaptureActivity.VALUE_SCAN_AREA_FULL_SCREEN);
        bundle.putBoolean(CaptureActivity.KEY_NEED_SCAN_HINT_TEXT, CaptureActivity.VALUE_SCAN_HINT_TEXT);
        intent.putExtra(CaptureActivity.EXTRA_SETTING_BUNDLE, bundle);
        startActivityForResult(intent, CaptureActivity.REQ_CODE);
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQ_CODE_PERMISSION: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startCaptureActivityForResult();
                }else {
                    Toast.makeText(this, "You must agree the camera permission request before you use the code scan function", Toast.LENGTH_LONG).show();
                }
            }
            break;
        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case CaptureActivity.REQ_CODE:
                switch (resultCode) {
                    case RESULT_OK:
                        tvResult.setText(data.getStringExtra(CaptureActivity.EXTRA_SCAN_RESULT));  //or do sth
                        break;
                    case RESULT_CANCELED:
                        if (data != null) {
                            tvResult.setText(data.getStringExtra(CaptureActivity.EXTRA_SCAN_RESULT));
                        }
                        break;
                }
                break;
        }
    }
//    private void Find_basketball(final String data)
//    {
//        RequestQueue mqueue = Volley.newRequestQueue(MainActivity.this);
//        StringRequest stringReques1 = new StringRequest(Request.Method.POST, "http://op.juhe.cn/onebox/basketball/nba?key=a4444cc1fd977444f497802ea7428b60", new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Gson gson=new Gson();
//                BasketballRobot robot=gson.fromJson(response,BasketballRobot.class);
//               Log.i("aaaaa",robot.getResult().getTitle());
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.i("aa", error.toString());
//            }
//        }) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> map = new HashMap<String, String>();
//                map.put("key", "a4444cc1fd977444f497802ea7428b60");
//                map.put("info", data);
//                map.put("userid", "92");
//                return map;
//            }
//        };
//        mqueue.add(stringReques1);
//    }
}
