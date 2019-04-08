package com.example;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class VideoAdapter extends ArrayAdapter<My_video> {
    private int resourceId;
    public VideoAdapter(@NonNull Context context, int resource, @NonNull List<My_video> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        My_video my_video=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView videoImage=(ImageView)view.findViewById(R.id.video_image);
        videoImage.setScaleType(ImageView.ScaleType.FIT_XY );
        videoImage.setImageResource(my_video.getImageId());
        return view;
    }
}
