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

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{
    Context context;
    ArrayList<FruitModel> fruitModels;

    public FruitAdapter(Context context, ArrayList<FruitModel> fruitModels) {
        this.context = context;
        this.fruitModels = fruitModels;
    }

    @NonNull
    @Override
    public FruitAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_fruits,parent,false);
        FruitAdapter.ViewHolder viewHolder = new FruitAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.ViewHolder holder, int position) {
        FruitModel model = (FruitModel) fruitModels.get(position);
        holder.imageView.setImageResource(model.img1);
        holder.fname.setText(model.name1);
        holder.fkg.setText(model.Kg1);
        holder.frs.setText(model.Rs1);
    }

    @Override
    public int getItemCount() {
        return fruitModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView fname,fkg,frs;
        CheckBox checkBox;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.fruit_image);
            fname=itemView.findViewById(R.id.fruit_name);
            fkg=itemView.findViewById(R.id.fruit_Weight);
            frs=itemView.findViewById(R.id.rs);
            checkBox=itemView.findViewById(R.id.checkbox);

        }
    }
}
