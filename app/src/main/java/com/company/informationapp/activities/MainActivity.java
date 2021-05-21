package com.company.informationapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.company.informationapp.R;
import com.company.informationapp.adapter.AdapterClass;
import com.company.informationapp.model.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        arrayList = new ArrayList<>();

        ModelClass modelClass1 = new ModelClass("planets", "The Planets");
        ModelClass modelClass2 = new ModelClass("music", "Classic musicians");
        ModelClass modelClass3 = new ModelClass("usa", "The USA presidents");
        ModelClass modelClass4 = new ModelClass("worldmap", "The Countries");

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter = new AdapterClass(arrayList, this);
        recyclerView.setAdapter(adapter);

    }
}