package com.example.a1109test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Data>mData;
    private Context mContext;
    public MyAdapter(Context context,ArrayList<Data> data){
        this.mData=data;
        this.mContext=context;
    }
    // 是用來連結畫面
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=(LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false));
        return new ViewHolder(view);
    }
    //  用來控制剛剛宣告的物件
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Data d=mData.get(position);
    holder.tv1.setText(String.valueOf(d.id));
    holder.btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(mContext,d.text,Toast.LENGTH_LONG).show();
        }
    });
    }
    // 顯示幾筆資料
    @Override
    public int getItemCount() {
        return mData.size();
    }
    // 宣告畫面元件
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv1;
        private Button btn1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.tv1);
            btn1=itemView.findViewById(R.id.btn1);
        }
    }
}
