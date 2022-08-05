package com.example.vegetableui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ITEMLIST extends AppCompatActivity {
   Button next,back,done;
   CardView viewmore_v,viewmore_f;
   RecyclerView recyclerView_v,recyclerView_f;
   ArrayList<VegetableModel> model_v= new ArrayList<>();
   ArrayList<FruitModel> model_f= new ArrayList<>();

   VegetableAdapter adapter_v;
   FruitAdapter adapter_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemlist);
        next = findViewById(R.id.next);
        back = findViewById(R.id.back);
        done = findViewById(R.id.done);

        viewmore_v = findViewById(R.id.card3);
        viewmore_f = findViewById(R.id.card5);

        recyclerView_v = findViewById(R.id.recycleview_vegetable);
        recyclerView_f = findViewById(R.id.recycleview_fruite);

        recyclerView_v.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        model_v.add(new VegetableModel(R.drawable.v,"Cauliflower()","1Kg","50"));
        model_v.add(new VegetableModel(R.drawable.v1,"Beetroot","1Kg","40"));
        model_v.add(new VegetableModel(R.drawable.v2,"Sweet corn","1Kg","25"));
        model_v.add(new VegetableModel(R.drawable.v3,"Calabash","1Kg","20"));
        model_v.add(new VegetableModel(R.drawable.v4,"Potato","1Kg","30"));
        adapter_v =new VegetableAdapter(this,model_v);
        recyclerView_v.setAdapter(adapter_v);

////////////////////////////////
        recyclerView_f.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        model_f.add(new FruitModel(R.drawable.f1,"Cauliflower()","1Kg","50"));
        model_f.add(new FruitModel(R.drawable.f2,"Beetroot","1Kg","40"));
        model_f.add(new FruitModel(R.drawable.f3,"Sweet corn","1Kg","25"));
        model_f.add(new FruitModel(R.drawable.f4,"Calabash","1Kg","20"));
        model_f.add(new FruitModel(R.drawable.f5,"Potato","1Kg","30"));

        adapter_f =new FruitAdapter(this,model_f);
        recyclerView_f.setAdapter(adapter_f);
////////////////////////////////////////

        viewmore_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ITEMLIST.this,Tab.class);
                startActivity(intent);
            }
        });

        viewmore_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ITEMLIST.this,Tab.class);
                startActivity(intent1);
            }
        });

//////////////////////////////////////
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ITEMLIST.this,Tab.class);
                startActivity(intent2);
            }
        });
    }
}