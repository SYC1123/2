package com.example;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {
    private List<Photo>list;
    public PhotoAdapter(List<Photo>list)
    {
        this.list=list;
    }

    @NonNull
    @Override
    public PhotoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.photo,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }


    public void onBindViewHolder(@NonNull ViewHolder holder,int position)
    {
        Photo photo=list.get(position);
        holder.peopleImage.setImageResource(photo.getImgId());
        holder.peopleImage.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public int getItemCount()
    {
        return list.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView peopleImage;
        public ViewHolder(View itemView)
        {
            super(itemView);
            peopleImage=itemView.findViewById(R.id.img_people);
        }
    }
}
