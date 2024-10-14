package com.arseniy.hw4m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContinents;
    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvContinents = itemView.findViewById(R.id.tv_continents);
    }

    public void onBind(String music) {
        tvContinents.setText(music);
    }
}