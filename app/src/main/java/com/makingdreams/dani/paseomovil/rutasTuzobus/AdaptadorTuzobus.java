package com.makingdreams.dani.paseomovil.rutasTuzobus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.makingdreams.dani.paseomovil.R;

/**
 * Created by dani on 1/08/16.
 */
public class AdaptadorTuzobus extends BaseAdapter {
    private Context context;

    public AdaptadorTuzobus(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return RutasTuzobus.ITEMS.length;
    }

    @Override
    public RutasTuzobus getItem(int position) {
        return RutasTuzobus.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenRuta = (ImageView) view.findViewById(R.id.imagen_coche);
        TextView nombreRuta = (TextView) view.findViewById(R.id.nombre_coche);

        final RutasTuzobus item = getItem(position);
        Glide.with(imagenRuta.getContext())
                .load(item.getIdDrawable())
                .into(imagenRuta);

        nombreRuta.setText(item.getNombre());

        return view;
    }
}