package com.makingdreams.dani.paseomovil;

/**
 * Created by dani on 23/06/16.
 */
public class RutasVehiculos {
    private String nombre;
    private int idDrawable;

    public RutasVehiculos(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static RutasVehiculos[] ITEMS = {
            new RutasVehiculos("Transporte Convencional", R.drawable.combi),
            new RutasVehiculos("Tuzobus", R.drawable.tuzobus),
            new RutasVehiculos("Alimentadoras", R.drawable.alimentadora)
    };

    public static RutasVehiculos getItem(int id) {
        for (RutasVehiculos item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
