package com.example.cartoon_videos.mainclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cartoon_videos.adapter_class.adapterClass;
import com.example.cartoon_videos.setter_getter_class.setter_getterClass;
import com.example.fyp.R;

import java.util.Vector;

public class mainclass extends AppCompatActivity {
    private RecyclerView recyclerView;
    Vector<setter_getterClass> youtubevideos = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainclass);
        recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/94NuFTMBBOY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hq3yfQnllfQ\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BELlZKpi1Zs\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fHqjNHxmB7c\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3RywqqJkM8I\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/OTUg_4TvCWY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/t99ULJjCsaM\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ea5-SIe5l7M\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/m5jd3UyO_aY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IT4l0PdgAkc\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new setter_getterClass("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7isSwerYaQc\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        adapterClass adclass = new adapterClass(youtubevideos);
        recyclerView.setAdapter(adclass);
    }
}