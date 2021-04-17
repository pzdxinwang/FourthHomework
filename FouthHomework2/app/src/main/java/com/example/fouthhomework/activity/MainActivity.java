package com.example.fouthhomework.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fouthhomework.Adapter.RecyclerviewAdapter;
import com.example.fouthhomework.R;
import com.example.fouthhomework.bean.Bean;
import com.example.fouthhomework.bean.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mlist;
    private List<Bean> mdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlist = findViewById(R.id.rv_list);
        init();
    }

    private void init() {
        mdata = new ArrayList<>();
        for (int i = 0; i < Data.pic.length; i++) {
            Bean bean = new Bean();
            bean.icon = Data.pic[i];
            bean.name = ("第" + (i+1) + "个美女照片");
            mdata.add(bean);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mlist.setLayoutManager(linearLayoutManager);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(mdata);
        mlist.setAdapter(adapter);
    }








}