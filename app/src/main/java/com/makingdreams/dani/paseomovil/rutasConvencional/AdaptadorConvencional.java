package com.makingdreams.dani.paseomovil.rutasConvencional;

/**
 * Created by dani on 31/07/16.
 */
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
 * Created by dani on 23/06/16.
 */
public class AdaptadorConvencional extends BaseAdapter {
    private Context context;

    public AdaptadorConvencional(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return RutasConvencional.ITEMS.length;
    }

    @Override
    public RutasConvencional getItem(int position) {
        return RutasConvencional.ITEMS[position];
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

        final RutasConvencional item = getItem(position);
        Glide.with(imagenRuta.getContext())
                .load(item.getIdDrawable())
                .into(imagenRuta);

        nombreRuta.setText(item.getNombre());

        return view;
    }
}