package com.makingdreams.dani.paseomovil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import com.bumptech.glide.Glide;

/**
 * Created by dani on 23/06/16.
 */
public class AdaptadorRutasVehiculos extends BaseAdapter {
    private Context context;

    public AdaptadorRutasVehiculos(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return RutasVehiculos.ITEMS.length;
    }

    @Override
    public RutasVehiculos getItem(int position) {
        return RutasVehiculos.ITEMS[position];
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

        ImageView imagenCoche = (ImageView) view.findViewById(R.id.imagen_coche);
        TextView nombreCoche = (TextView) view.findViewById(R.id.nombre_coche);

        final RutasVehiculos item = getItem(position);
        Glide.with(imagenCoche.getContext())
                .load(item.getIdDrawable())
                .into(imagenCoche);

        nombreCoche.setText(item.getNombre());

        return view;
    }
}
