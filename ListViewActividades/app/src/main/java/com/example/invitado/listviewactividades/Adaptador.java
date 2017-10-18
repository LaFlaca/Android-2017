package com.example.invitado.listviewactividades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.invitado.listviewactividades.R;

/**
 * Created by Invitado on 17/10/2017.
 */

public class Adaptador extends BaseAdapter {

    private Context context;

    public Adaptador(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return Pokemon.ITEMS.length;
    }

    @Override
    public Pokemon getItem(int position) {
        return Pokemon.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {


        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenpoke = (ImageView) view.findViewById(R.id.pokemon);
        TextView nombrepoke = (TextView) view.findViewById(R.id.nombre_poke);

        final Pokemon item = getItem(position);
        Glide.with(imagenpoke.getContext())
                .load(item.getIdDrawable())
                .into(imagenpoke);

        nombrepoke.setText(item.getNombre());

        return view;
                 }
    }

