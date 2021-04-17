package com.example.fouthhomework.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fouthhomework.R;
import com.example.fouthhomework.bean.Bean;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyHolder> {
    private final List<Bean> bean;

    public RecyclerviewAdapter(List<Bean> bean) {
        this.bean = bean;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item_recyclerview,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.setData(bean.get(position));
    }

    @Override
    public int getItemCount() {
        if (bean!=null){
            return bean.size();
        }
        return 0;
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;
        private final TextView mTextView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.iv_top_pic);
            mTextView = itemView.findViewById(R.id.tv_name);
        }

        public void setData(Bean bean) {
            mImageView.setImageResource(bean.icon);
            mTextView.setText(bean.name);
        }
    }
}
