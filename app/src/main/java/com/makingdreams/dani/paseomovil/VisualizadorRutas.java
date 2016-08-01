package com.makingdreams.dani.paseomovil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by dani on 1/08/16.
 */
public class VisualizadorRutas extends Fragment {

    public static final String ARG_SECTION_TITLE = "section_number";
    public static int resourceImage;
    public static String[] rutas;


    public static VisualizadorRutas newInstance(String sectionTitle, int img, String[] values) {
        resourceImage = img;
        rutas = values;
        VisualizadorRutas fragment = new VisualizadorRutas();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public VisualizadorRutas() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listado_rutas, container, false);

        String title = getArguments().getString(ARG_SECTION_TITLE);
        TextView titulo = (TextView) view.findViewById(R.id.id_ruta);
        titulo.setText(title);

        ImageView imagen = (ImageView) view.findViewById(R.id.img_ruta);
        imagen.setImageResource(resourceImage);

        ListView listadoRutas = (ListView) view.findViewById(R.id.list_lugares);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),
                R.layout.element_listview, rutas);

        listadoRutas.setAdapter(adapter);
        return view;
    }

}
