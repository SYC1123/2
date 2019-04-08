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

public class FunctionAdapter extends ArrayAdapter<My_function> {
private int resourceId;
    public FunctionAdapter(@NonNull Context context, int resource, @NonNull List<My_function> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        My_function my_function=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView functionImage=(ImageView)view.findViewById(R.id.function_image);
        functionImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        TextView functionName=(TextView)view.findViewById(R.id.function_name);
        functionImage.setImageResource(my_function.getImageId());
        functionName.setText(my_function.getName());
        return view;
    }
}
