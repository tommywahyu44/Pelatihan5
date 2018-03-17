package com.example.tommywahyu44.Pelatihan5.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tommywahyu44.Pelatihan5.R;
import com.example.tommywahyu44.Pelatihan5.GridviewFragment;

import java.util.List;

/**
 * Created by Fauziw97 on 9/15/17.
 */
public class GridviewAdapter extends RecyclerView.Adapter<GridviewAdapter.ViewHolder> {


    GridviewFragment kriteria;
    String name;
    com.example.tommywahyu44.Pelatihan5.Model.GridviewAdapter grid;
    private List<com.example.tommywahyu44.Pelatihan5.Model.GridviewAdapter> GridModel;
    private Context context;

    public GridviewAdapter(List<com.example.tommywahyu44.Pelatihan5.Model.GridviewAdapter> GridModel, Context context) {
        this.GridModel = GridModel;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView kriteriaName;
        ImageView kriteriaImage;
        View root;


        public ViewHolder(View view) {
            super(view);
            kriteriaName = view.findViewById(R.id.kriteria_name);
            kriteriaImage = view.findViewById(R.id.kriteria_image);
            root = view;
            root.setClickable(true);
            root.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }


    @Override
    public GridviewAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gridview_item_list, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final GridviewAdapter.ViewHolder holder, int position) {
        holder.root.setTag(GridModel.get(position));
        grid = GridModel.get(position);
        holder.kriteriaName.setText(grid.getKriteriaName());
        if (grid.getKriteriaName().equalsIgnoreCase("Grid 1"))
            holder.kriteriaImage.setImageResource(R.drawable.kriteria_tinggi);
        else if (grid.getKriteriaName().equalsIgnoreCase("Grid 2"))
            holder.kriteriaImage.setImageResource(R.drawable.kriteria_berat);
        else holder.kriteriaImage.setImageResource(R.drawable.kriteria_mata);
    }

    @Override
    public int getItemCount() {
        return GridModel.size();
    }


}
