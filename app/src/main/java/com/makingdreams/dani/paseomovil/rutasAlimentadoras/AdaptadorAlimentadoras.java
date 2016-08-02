package com.makingdreams.dani.paseomovil.rutasAlimentadoras;

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
public class AdaptadorAlimentadoras extends BaseAdapter {
    private Context context;

    public AdaptadorAlimentadoras(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return RutasAlimentadoras.ITEMS.length;
    }

    @Override
    public RutasAlimentadoras getItem(int position) {
        return RutasAlimentadoras.ITEMS[position];
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

        final RutasAlimentadoras item = getItem(position);
        Glide.with(imagenRuta.getContext())
                .load(item.getIdDrawable())
                .into(imagenRuta);

        nombreRuta.setText(item.getNombre());

        return view;
    }
}