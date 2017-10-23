package com.example.invitado.segundoparcial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Invitado on 23/10/2017.
 */

public class Adaptador extends BaseAdapter {

    private Context context;

    public Adaptador(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return Carros.ITEMS.length;
    }

    @Override
    public Carros getItem(int position) {
        return Carros.ITEMS[position];
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

        ImageView imagenpoke = (ImageView) view.findViewById(R.id.iv_carro);
        TextView nombrepoke = (TextView) view.findViewById(R.id.nombre_carro);

        final Carros item = getItem(position);
        Glide.with(imagenpoke.getContext())
                .load(item.getIdDrawable())
                .into(imagenpoke);

        nombrepoke.setText(item.getNombre());

        return view;
    }
}
