package com.example.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {
    private ImageView mImgImage;
    private TextView mTvText;

    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        initviews();
    }

    private void initviews() {
        mImgImage=itemView.findViewById(R.id.ivAnimal);
        mTvText=itemView.findViewById(R.id.tvName);
    }
    public void setData(Animal animal)
    {
        mImgImage.setImageResource(animal.getImageId());
        mTvText.setText(animal.getName());
    }
}
