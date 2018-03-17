package com.example.tommywahyu44.Pelatihan5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tommywahyu44.Pelatihan5.Adapter.CardviewAdapter;
import com.example.tommywahyu44.Pelatihan5.Model.CardviewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fauziw97 on 9/12/17.
 */

public class CardviewFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private CoordinatorLayout linearLayout;
    public static List<CardviewModel> listItems;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card_view, container, false);
              linearLayout = view.findViewById(R.id.layoutCoord);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycleViewForum);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setStackFromEnd(true);
        linearLayoutManager.setReverseLayout(true);


        listItems = new ArrayList<>();

        adapter = new CardviewAdapter(listItems,getContext());
        recyclerView.setAdapter(adapter);


        CardviewModel listItem = new CardviewModel("Nama1");
        listItems.add(listItem);
        adapter.notifyDataSetChanged();

        CardviewModel listItem2 = new CardviewModel("Nama2");
        listItems.add(listItem2);
        adapter.notifyDataSetChanged();

        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }




}
