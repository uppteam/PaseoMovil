package com.makingdreams.dani.paseomovil.rutasTuzobus;

import com.makingdreams.dani.paseomovil.R;

/**
 * Created by dani on 1/08/16.
 */
public class RutasTuzobus {
    private String nombre;
    private int idDrawable;
    private String[] lugares;

    public RutasTuzobus(String nombre, int idDrawable, String[] lugares) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
        this.lugares = lugares;
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

    public String[] getLugares() {
            return lugares;
        }

    public static RutasTuzobus[] ITEMS = {
            new RutasTuzobus("Exprés T02", R.drawable.tuzobus, new String[]{"Matilde", "Felipe Ángeles", "Centro de Justicia", "Vicente Segura", "Juan C. Doria", "Hospitales", "Bicentenario", "Zona Plateada", "Tecnológico de Monterrey", "Central de Autobuses", "Prepa 1", "Revolución", "Presidente Alemán", "Plaza Juárez"}),
            new RutasTuzobus("Exprés T04", R.drawable.tuzobus, new String[]{"Matilde", "Efrén Rebolledo", "Ejército Mexicano", "Felipe Ángeles", "SEPH", "Tecnológico", "Bicentenario", "Tecnológico de Monterrey", "Central de Autobuses", "Santa Julia", "Presidente Aléman", "Niños Héroes", "Centro Histórico", "Plaza Juárez"}),
            new RutasTuzobus("Paradora T05", R.drawable.tuzobus, new String[]{"Terminal Téllez", "Gabriel Mancera", "Matilde", "Efrén Rebolledo", "Tercera Edad", "San Antonio", "Ejército Mexicano", "Felipe Ángeles", "Centro de Justicia", "Vicente Segura", "Juan C. Doria", "Hospitales", "SEPH", "Tecnológico", "Bicentenario", "Centro Minero", "Zona Plateada", "Tecnológico de Monterrey", "Central de Autobuses", "Cuna del Fútbol", "Prepa 1", "Revolución", "Manuel Dublán", "Presidente Aléman", "Niños Héroes", "Centro Histórico", "Plaza Juárez", "Bioparque"})
    };

    public static RutasTuzobus getItem(int id) {
        for (RutasTuzobus item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
