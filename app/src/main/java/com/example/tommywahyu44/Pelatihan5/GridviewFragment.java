package com.example.tommywahyu44.Pelatihan5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tommywahyu44.Pelatihan5.Model.GridviewAdapter;
import com.example.tommywahyu44.Pelatihan5.View.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fauziw97 on 9/12/17.
 */

public class GridviewFragment extends Fragment {
    GridSpacingItemDecoration spacingDecoration;
    private RecyclerView.Adapter mAdapter;
    RecyclerView mRecyclerView;
    private List<GridviewAdapter> GridModel = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid_view, container, false);
        mRecyclerView = view.findViewById(R.id.recycler_view_promethee);
        spacingDecoration = new GridSpacingItemDecoration(3, com.example.tommywahyu44.Pelatihan5.Util.Measure.pxToDp(8, getContext()), true);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.addItemDecoration(spacingDecoration);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

        GridviewAdapter model = new GridviewAdapter("","Grid 1");
        GridModel.add(model);
        mAdapter = new com.example.tommywahyu44.Pelatihan5.Adapter.GridviewAdapter(GridModel, getActivity());
        mRecyclerView.setAdapter(mAdapter);

        GridviewAdapter model2 = new GridviewAdapter("","Grid 2");
        GridModel.add(model2);
        mAdapter = new com.example.tommywahyu44.Pelatihan5.Adapter.GridviewAdapter(GridModel, getActivity());
        mRecyclerView.setAdapter(mAdapter);

        GridviewAdapter model3 = new GridviewAdapter("","Grid 3");
        GridModel.add(model3);
        mAdapter = new com.example.tommywahyu44.Pelatihan5.Adapter.GridviewAdapter(GridModel, getActivity());
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }



}
