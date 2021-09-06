package com.example.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimalFragment1 extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Animal>arrayList=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setAdapter();
    }

    private void setAdapter() {
        myAdapter adapter=new myAdapter(arrayList);
        GridLayoutManager grid=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(grid);
        recyclerView.setAdapter(adapter);
    }

    private void buildList() {
        for(int i=0;i<100;i++)
        {
            Animal animal=new Animal("Haha",R.drawable.abc);
            arrayList.add(animal);
        }
    }

    private void initViews(View view) {
        recyclerView=view.findViewById(R.id.recycleView);
    }
}