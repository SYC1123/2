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

public class TalkAdapter extends ArrayAdapter<UserTalk> {
    private int resourceid;
    public TalkAdapter(@NonNull Context context, int resource, @NonNull List<UserTalk> objects) {
        super(context, resource, objects);
        resourceid=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UserTalk userTalk=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceid,parent,false);
        ImageView talkImage=(ImageView)view.findViewById(R.id.Talk_image);
        TextView talkName=(TextView)view.findViewById(R.id.Talk_name);
        talkImage.setImageResource(userTalk.getImageid());
        talkName.setText(userTalk.getName());
        return view;
    }
}
