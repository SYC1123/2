package com.example;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
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
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;
import com.show.api.ShowApiRequest;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeFragment extends Fragment {
    private List<Photo> photos;
    protected Handler mHandler =  new Handler();
    private RollPagerView mRollViewPager;
    private List<My_video> my_videos=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView textView=view.findViewById(R.id.text_w);
        textView.setSelected(true);
        mRollViewPager = (RollPagerView) view.findViewById(R.id.recycler_my);

        //设置播放时间间隔
        mRollViewPager.setPlayDelay(2000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new TestNormalAdapter());

        mRollViewPager.setHintView(new ColorPointHintView(getActivity(), Color.YELLOW,Color.WHITE));



        initFunctions();
        VideoAdapter adapter=new VideoAdapter(getActivity(),R.layout.video_item,my_videos);
        ListView listView=view.findViewById(R.id.list_View2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                expressItemClick(i);
            }
        });
//        final TextView txt = (TextView) view.findViewById(R.id.text_w);
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
////                        Gson gson = new Gson();
////                        NewsRobot  robot =gson.fromJson(res.toString(),NewsRobot.class);
////                        for(int i=0;i<robot.getShowapi_res_body().getHeadline().size();i++)
////                        {
////                            Log.i("TAG", robot.getShowapi_res_body().getHeadline().get(i).getTitle()+"hhh");
////                        }
//
//                        txt.setText(res+"  "+new Date());
//                    }
//                });
//            }
//        }.start();



        return view;
    }
    private void initData()
    {
        photos=new ArrayList<>();
        Photo photo=new Photo();
        photo.setImgId(R.mipmap.timgb);
        photos.add(photo);
        Photo photo1=new Photo();
        photo1.setImgId(R.mipmap.timgt);
        photos.add(photo1);
        Photo photo2=new Photo();
        photo2.setImgId(R.mipmap.timgv);
        photos.add(photo2);
        Photo photo3=new Photo();
        photo3.setImgId(R.mipmap.timg);
        photos.add(photo3);
    }
    private void initFunctions() {
        My_video photo1 = new My_video( R.mipmap.photo1);
        my_videos.add(photo1);
        My_video photo2 = new My_video(R.mipmap.photo2);
        my_videos.add(photo2);
        My_video photo3 = new My_video(R.mipmap.pho3);
        my_videos.add(photo3);
        My_video photo4 =new My_video(R.mipmap.photo4);
        my_videos.add(photo4);
    }
    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.mipmap.timgb,
                R.mipmap.timgt,
                R.mipmap.timgv,
                R.mipmap.timg,
        };


        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }


        @Override
        public int getCount() {
            return imgs.length;
        }
    }
    public void expressItemClick(int postion){
        if(postion==0) {
            replaceFragment(new Video1Fragment());

        }
    }
    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_fragment_container,fragment);
        fragmentTransaction.commit();
    }

}
