package com.example.tommywahyu44.Pelatihan5.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tommywahyu44.Pelatihan5.Model.CardviewModel;
import com.example.tommywahyu44.Pelatihan5.R;

import java.util.List;

/**
 * Created by tommywahyu44 on 4/12/2017.
 */

public class CardviewAdapter extends RecyclerView.Adapter<CardviewAdapter.ViewHolder> {

    public static String a;


    private List<CardviewModel> listItems;
    private Context context;

    public CardviewAdapter(List<CardviewModel> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public CardviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_item_list, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(final CardviewAdapter.ViewHolder holder, final int position) {

        final CardviewModel listItem = listItems.get(position);
        holder.Nama.setText(listItem.getNama());
    }


    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private TextView Nama;


        public ViewHolder(View itemView) {
            super(itemView);
            Nama = itemView.findViewById(R.id.nama);

            itemView.setClickable(true);
            itemView.setOnClickListener(this);


        }


        public void onClick(final View v) {

        }
    }
}
