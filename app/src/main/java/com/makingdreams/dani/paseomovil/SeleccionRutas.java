package com.makingdreams.dani.paseomovil;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.makingdreams.dani.paseomovil.rutasAlimentadoras.Alimentadoras;
import com.makingdreams.dani.paseomovil.rutasConvencional.Convencional;
import com.makingdreams.dani.paseomovil.rutasTuzobus.Tuzobus;


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


        gridView.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle args = new Bundle();
        args.putString(PlaceholderFragment.ARG_SECTION_TITLE, "temporalTitle");
        Fragment fragment;

        RutasVehiculos tipo = (RutasVehiculos) parent.getItemAtPosition(position);
        if (tipo.getNombre().equals("Transporte Convencional"))
            fragment = Convencional.newInstance("Convencional");
        else if (tipo.getNombre().equals("Tuzobus"))
            fragment = Tuzobus.newInstance("Tuzobus");
        else
            fragment = Alimentadoras.newInstance("Alimentadora");

        fragment.setArguments(args);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.main_content, fragment)
                .commit();

    }
}
