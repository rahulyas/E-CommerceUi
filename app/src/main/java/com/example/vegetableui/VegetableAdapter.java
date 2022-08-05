package com.example.vegetableui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VegetableAdapter extends RecyclerView.Adapter<VegetableAdapter.ViewHolder> {
   Context context;
   ArrayList<VegetableModel> vegetableModels;

    public VegetableAdapter(Context context, ArrayList<VegetableModel> vegetableModels) {
        this.context = context;
        this.vegetableModels = vegetableModels;
    }

    @NonNull
    @Override
    public VegetableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_vegetable,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VegetableAdapter.ViewHolder holder, int position) {
        VegetableModel model = (VegetableModel) vegetableModels.get(position);
        holder.imageView.setImageResource(model.img);
        holder.vname.setText(model.name);
        holder.vkg.setText(model.Kg);
        holder.vrs.setText(model.Rs);

    }

    @Override
    public int getItemCount() {
        return vegetableModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView vname,vkg,vrs;
        CheckBox checkBox;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.vegetable_image);
            vname=itemView.findViewById(R.id.vegetable_name);
            vkg=itemView.findViewById(R.id.vegetable_Weight);
            vrs=itemView.findViewById(R.id.rs);
            checkBox=itemView.findViewById(R.id.checkbox);
        }
    }
}
