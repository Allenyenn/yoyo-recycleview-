package com.example.a1109test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv;
    private MyAdapter adapter;
    private ArrayList<Data> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv=findViewById(R.id.rcv);
        data=new ArrayList<>();
        data.add(new Data(1,"真假!!"));
        data.add(new Data(2,"亂講"));
        data.add(new Data(3,"林政佑先生 請上線"));
        adapter=new MyAdapter(this,data);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(adapter);
    }
}