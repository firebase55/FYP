 package com.example.cartoon_videos.adapter_class;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cartoon_videos.setter_getter_class.setter_getterClass;
import com.example.fyp.R;

import java.util.List;


public class adapterClass extends RecyclerView.Adapter<adapterClass.videoClass>
{
    List <setter_getterClass> youtubevideosList;

    public adapterClass()
    {

    }

    @NonNull
    @Override
    public adapterClass.videoClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view,parent,false);
        return new videoClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterClass.videoClass holder, int position) {
        holder.videoweb.loadData(youtubevideosList.get(position).getVideouri(),"text/html" , "utf-8");


    }

    @Override
    public int getItemCount() {
        return youtubevideosList.size();

    }
    public adapterClass(List<com.example.cartoon_videos.setter_getter_class.setter_getterClass> classs) {
        this.youtubevideosList = classs;
    }


    public class videoClass extends RecyclerView.ViewHolder {
        WebView videoweb;
        public videoClass(@NonNull View itemView) {
            super(itemView);
            videoweb = (WebView)itemView.findViewById(R.id.webvdeo);
            videoweb.getSettings().setJavaScriptEnabled(true);
            videoweb.setWebChromeClient(new WebChromeClient());
        }
    }
}
