package com.example;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.show.api.ShowApiRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogActivity extends AppCompatActivity {
    protected Handler mHandler =  new Handler();
//private String[] data = {"我的等级","我的空间","我的积分","游戏中心","我的竞猜","我的视频","视频收藏","视频任务","免流量特权","关注管理"};
    private List<My_function> functionslist=new ArrayList<>();
    public static final int CHOOSE_PHOTO = 2 ;
    private static final int TAKE_PHOTO=1;
    private ImageView picture;
    private Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        Toolbar mtoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);//消除APP标题
        mtoolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

//        final TextView txt = (TextView) this.findViewById(R.id.advertising);
//        new Thread(){
//            //在新线程中发送网络请求
//            public void run() {
//                String appid="70522";//要替换成自己的
//                String secret="1400e9252f604b3dba5a4fb8d459984f";//要替换成自己的
//                final String res=new ShowApiRequest( "http://route.showapi.com/967-1", appid, secret)
//                        .post();
//
//                System.out.println(res);
//                Log.i("aaaaaaaa",res);
////把返回内容通过handler对象更新到界面
//                mHandler.post(new Thread(){
//                    public void run() {
//
//                        txt.setText(res+"  "+new Date());
//                    }
//                });
//            }
//        }.start();
//
//
//








        initFunctions();//添加方法
        FunctionAdapter adapter=new FunctionAdapter(LogActivity.this,R.layout.function_item,functionslist);
        ListView listView=(ListView)findViewById(R.id.list_View);
        listView.setAdapter(adapter);
//        说明：数组中的数据是无法直接传递给ListView的，我们需要借助适配器来完成。其中的ArrayAdapter有多个构造函数的重载，由于我们提供的数据都是字符串类型，因此将ArrayAdapter的泛型指定为String。
//        ArrayAdapter的构造函数中需传入三个参数，它们依次是当前上下文，ListView子项布局的id，要适配的数据。其中，我们使用android.R.layout.simple_list_item_1作为ListView子项布局的id，它是一个android内置的布局文件，里面只有一个TextView，可用于简单地显示一段文本。
//        最后，我们调用了ListView的setAdapter()方法，这样就建立起了ListView和数据之间的关联。
        Button button=findViewById(R.id.infomation);
        setViewDrawable(R.mipmap.information,button,1);
        Button button1=findViewById(R.id.My_task);
        setViewDrawable(R.mipmap.my_task,button1,1);
        Button button2=findViewById(R.id.VIP);
        setViewDrawable(R.mipmap.vip,button2,1);
        Button button3=findViewById(R.id.Money);
        setViewDrawable(R.mipmap.money,button3,1);
 //从相册选择照片
        picture=(ImageView)findViewById(R.id.choose_from_album);
        ImageView chooseFromAlbum = findViewById(R.id.choose_from_album);
        chooseFromAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(LogActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(LogActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
                }else{
            openAlbum();
                }
            }
        });
        //item点击事件进入activi
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                expressItemClick(i);
            }
        });
    }
    private void openAlbum()
    {
        Intent intent= new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent,CHOOSE_PHOTO);
    }
    public void onRequestPermissionResult(int requestCode,String[] permissions,int[] grantResults)
    {
        switch (requestCode)
        {
            case 1:
            if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                openAlbum();
            }else
            {
                Toast.makeText(this,"you denied the permission",
                Toast.LENGTH_SHORT).show();
            }
            break;
            default:
        }
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        switch (requestCode) {
            case CHOOSE_PHOTO:
                if (resultCode == RESULT_OK) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        handleImageOnKitKat(data);
                    } else {
                       // handleImageBeforeKitKat(data);
                    }
                }
                break;
            default:
                break;
        }
    }
    @TargetApi(19)
    private void handleImageOnKitKat(Intent data)
    {
        String imagePath = null;
        Uri uri = data.getData();
        if(DocumentsContract.isDocumentUri(this,uri))
        {
            String docId= DocumentsContract.getDocumentId(uri);
            if("com.android.providers.media.documents".equals(uri.getAuthority()))
            {
                String id=docId.split(":")[1];
                String selsction= MediaStore.Images.Media._ID+"="+id;
                imagePath=getImagePath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,selsction);
            }else if("com.android.providers.downloads.documents".equals(uri.getAuthority()))
            {
                Uri contentUri= ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"),Long.valueOf(docId));
                imagePath=getImagePath(contentUri,null);
            }else if("content".equalsIgnoreCase(uri.getScheme()))
            {
                imagePath=getImagePath(uri,null);
            }else if("file".equalsIgnoreCase(uri.getScheme()))
            {
                imagePath=uri.getPath();
            }
            displayImage(imagePath);
        }
    }
    private String getImagePath(Uri uri,String selection)
    {
        String path=null;
        Cursor cursor=getContentResolver().query(uri,null,selection,null,null);
        if(cursor!=null)
        {
            if(cursor.moveToFirst())
            {
                path= cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
            }
            cursor.close();
        }
        return path;
    }
    private void displayImage(String imagePath)
    {
        if(imagePath!=null)
        {
            Bitmap bitmap= BitmapFactory.decodeFile(imagePath);
            picture.setImageBitmap(bitmap);
        }else {
            Toast.makeText(this,"failed to get image",Toast.LENGTH_SHORT).show();
        }
    }
    private void initFunctions()
    {
            My_function My_grades=new My_function("我的等级",R.drawable.grade);
            functionslist.add(My_grades);
            My_function My_space=new My_function("我的空间",R.drawable.space);
            functionslist.add(My_space);
            My_function My_point=new My_function("我的积分",R.drawable.point);
            functionslist.add(My_point);
            My_function Game_center=new My_function("游戏中心",R.drawable.game);
            functionslist.add(Game_center);
            My_function My_quiz=new My_function("我的竞猜",R.drawable.quiz);
            functionslist.add(My_quiz);
            My_function My_video=new My_function("我的视频",R.drawable.video);
            functionslist.add(My_video);
            My_function Video_collection=new My_function("视频收藏",R.drawable.collection);
            functionslist.add(Video_collection);
            My_function Video_task=new My_function("视频任务",R.drawable.task);
            functionslist.add(Video_task);
            My_function No_traffic_privilege=new My_function("免流量特权",R.drawable.vip);
            functionslist.add(No_traffic_privilege);
            My_function Fouce_manage=new My_function("关注管理",R.drawable.manag);
            functionslist.add(Fouce_manage);
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
        if(postion==5) {
            Intent intent = new Intent(LogActivity.this,My_VideoActivity.class);
            startActivity(intent);
        }
        if(postion==3){
            Intent intent = new Intent(LogActivity.this,GameActivity.class);
            startActivity(intent);
        }
    }
}
