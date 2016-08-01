package com.makingdreams.dani.paseomovil.rutasConvencional;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.makingdreams.dani.paseomovil.R;
import com.makingdreams.dani.paseomovil.VisualizadorRutas;

/**
 * Created by dani on 31/07/16.
 */
public class Convencional extends Fragment implements AdapterView.OnItemClickListener {

    private GridView gridView;
    private AdaptadorConvencional adaptador;
    public static final String ARG_SECTION_TITLE = "section_number";

    public static Convencional newInstance(String sectionTitle) {
        Convencional fragment = new Convencional();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public Convencional() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rutas_principal, container, false);
        gridView = (GridView) view.findViewById(R.id.grid);
        if (gridView != null) {
            adaptador = new AdaptadorConvencional(getContext().getApplicationContext());
            gridView.setAdapter(adaptador);
        }


        gridView.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment;
        RutasConvencional tipo = (RutasConvencional) parent.getItemAtPosition(position);
        fragment = VisualizadorRutas.newInstance(tipo.getNombre(), tipo.getIdDrawable(), tipo.getLugares());

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.main_content, fragment)
                .commit();

    }

}