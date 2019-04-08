package com.example;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

public class My_VideoActivity extends AppCompatActivity implements View.OnClickListener{
private VideoView   videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__video);
        Toolbar mtoolbar = (Toolbar)findViewById(R.id.toolbar);
        mtoolbar.setTitle("我的视频");
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);//消除APP标题
        mtoolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        videoView=(VideoView)findViewById(R.id.video_view);
        Button button1=findViewById(R.id.play);
        setViewDrawable(R.mipmap.play,button1,1);
        Button button2=findViewById(R.id.pause);
        setViewDrawable(R.mipmap.pause,button2,1);
        Button button3=findViewById(R.id.replay);
        setViewDrawable(R.mipmap.replay,button3,1);
        Button play=(Button)findViewById(R.id.play);
        Button pause=(Button)findViewById(R.id.pause);
        Button replay=(Button)findViewById(R.id.replay);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        replay.setOnClickListener(this);
        if (ContextCompat.checkSelfPermission(My_VideoActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(My_VideoActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
        }else
        {
            initVideoPath();
        }
    }
    private void initVideoPath()
    {
        File file=new File(Environment.getExternalStorageDirectory(),"movie.mp4");
        videoView.setVideoPath(file.getPath());
    }
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
        switch (requestCode)
        {
            case 1:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED)
                {
                    initVideoPath();
                }else
                {
                    Toast.makeText(this,"拒绝权限将无法使用程序",Toast.LENGTH_SHORT).show();
                    finish();
                }
                break;
                default:
        }
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.play:
            if(!videoView.isPlaying())
            {
                videoView.start();
            }
            break;
            case R.id.pause:
                if(videoView.isPlaying())
                {
                    videoView.pause();
                }
                break;
            case R.id.replay:
                if(videoView.isPlaying())
                {
                    videoView.resume();
                }
                break;
        }
    }
    protected void onDestroy()
    {
        super.onDestroy();
        if(videoView!=null)
        {
            videoView.suspend();
        }
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
}
