package com.makingdreams.dani.paseomovil;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


/**
 * Created by dani on 23/06/16.
 */
public class SeleccionRutas extends Fragment implements AdapterView.OnItemClickListener {

    private GridView gridView;
    private AdaptadorRutasVehiculos adaptador;
    public static final String ARG_SECTION_TITLE = "section_number";

    public static SeleccionRutas newInstance(String sectionTitle) {
        SeleccionRutas fragment = new SeleccionRutas();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public SeleccionRutas() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rutas_principal, container, false);
        gridView = (GridView) view.findViewById(R.id.grid);
        if (gridView != null) {
            adaptador = new AdaptadorRutasVehiculos(getContext().getApplicationContext());
            gridView.setAdapter(adaptador);
        }


        //gridView.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        /*Intent intent = new Intent(this, ActividadDetalle.class);
        if (categoria.equals("Restaurantes")) {
            Restaurantes item = (Restaurantes) parent.getItemAtPosition(position);
            intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
        }
        else if (categoria.equals("Hoteles")) {
            Hoteles item = (Hoteles) parent.getItemAtPosition(position);
            intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
        }
        else if (categoria.equals("Zonas Naturales")) {
            Naturales item = (Naturales) parent.getItemAtPosition(position);
            intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
        }
        else if (categoria.equals("Zonas Culturales")) {
            Culturales item = (Culturales) parent.getItemAtPosition(position);
            intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
        }
        else {
            Coche item = (Coche) parent.getItemAtPosition(position);
            intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
        }

        intent.putExtra("Categoria", categoria);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            new Pair<View, String>(view.findViewById(R.id.imagen_coche),
                                    ActividadDetalle.VIEW_NAME_HEADER_IMAGE)
                    );

            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else
            startActivity(intent);*/
    }
}
