package com.makingdreams.dani.paseomovil.rutasAlimentadoras;

import com.makingdreams.dani.paseomovil.R;

/**
 * Created by dani on 1/08/16.
 */
public class RutasAlimentadoras {
    private String nombre;
    private int idDrawable;
    private String[] lugares;

    public RutasAlimentadoras(String nombre, int idDrawable, String[] lugares) {
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

    public static RutasAlimentadoras[] ITEMS = {
            new RutasAlimentadoras("Ruta Alimentadora 01 - Matilde", R.drawable.alimentadora, new String[]{"Ida: Carr. Federal México - Pachuca", "Ida: Calle Reforma Agraria", "Ida: Ejido 18", "Regreso: Ejido 18", "Regreso: Calle 1ro de Junio", "Regreso: Prol. Valle de las Flores", "Regreso: Ejido 5", "Regreso: Calle Lindero", "Regreso: Ejido 9", "Regreso: Calle Reforma Agraria", "Regreso: Ejido 4", "Regreso: Ejido 2", "Regreso: Carr. Federal México - Pachuca"}),
            new RutasAlimentadoras("Ruta Alimentadora 02a - Circuito Nuevo Santa Matilde", R.drawable.alimentadora, new String[]{"Ida: Circuito Nueva Santa Matilde", "Ida: Blvd. San Guillermo", "Ida: Calle Ley Agraria", "Ida: Calle Nicolás Bravo", "Ida: Calle Julián Villagrán", "Ida: Reforma Agraria", "Ida: Carr. Federal México-Pachuca", "Regreso: Carr. Federal México-Pachuca", "Regreso: Calle Ley Agraria", "Regreso: Blvd. San Guillermo", "Regreso: Circuito Nueva Santa Matilde"}),
            new RutasAlimentadoras("Ruta Alimentadora 02b - San Alfonso/Villa Fontana", R.drawable.alimentadora, new String[]{"Villa Fontana", "Blvd. San Alfonso", "Av. Téllez", }),
            new RutasAlimentadoras("Ruta Alimentadora 03 - Circuito Nuevo Santa Matilde", R.drawable.alimentadora, new String[]{"Ida: Calle Antiguo Camino Hidalgo", "Ida: Av. La Principal", "Regreso: Av. La Principal", "Regreso: Calle Camino Interparcelario", "Regreso: Libramiento las Torres", "Regreso: Calle Antiguo Camino FFCC Hidalgo"}),
            new RutasAlimentadoras("Ruta Alimentadora 04a - La Palma", R.drawable.alimentadora, new String[]{"Ida: Blvd. La Palma", "Ida: Carr. Federal México-Pachuca", "Regreso: Carr. Federal México-Pachuca", "Regreso: Calle Antonio Ávila", "Regreso: Blvd. La Palma"}),
            new RutasAlimentadoras("Ruta Alimentadora 04b - Matilde", R.drawable.alimentadora, new String[]{"Ida: Calle Reforma Agraria", "Ida: Calle Almacenes", "Ida: Calle Maquinaria", "Ida: Calle Lindero San Antonio", "Ida: Carr. Federal México-Pachuca", "Regreso: Carr. Federal México Pachuca", "Regreso: Calle Servicios Técnicos", "Regreso: Calle Maquinaria", "Regreso: Calle Almacenes", "Regreso: Calle Reforma Agraria"}),
            new RutasAlimentadoras("Ruta Alimentadora 05 - Parque Urbano", R.drawable.alimentadora, new String[]{"Ida: Calle San Antonio", "Ida: Av. Ferrocarril Hidalgo", "Ida: De Los Gurriones", "Regreso: Carr. Federal México-Pachuca", "Regreso: Calle Felipe Ángeles", "Regreso: Calle Samuel Carro", "Regreso: Calle Manuel Vargas Cataño", "Regreso Av. Ferrocarril Hidalgo", "Regreso: Calle San Antonio"}),
            new RutasAlimentadoras("Ruta Alimentadora 06 - Hogares Unión", R.drawable.alimentadora, new String[]{"Ida: Calle Campo de Tiro", "Ida: Calle Yuhani", "Ida: Calle 14 de Febrero", "Ida: Carr. Federal México-Pachuca", "regreso: Calle 24 de Octubre", "Regreso: Calle 15 de Septiembre", "Regreso: Calle Campo de Tiro"}),
            new RutasAlimentadoras("Ruta Alimentadora 07 - Rancho La Colonia", R.drawable.alimentadora, new String[]{"Ida: Av. México", "Ida: Av. de los Cisnes Oriente", "Ida: Av. de las Aves", "Regreso: Av. de las Aves", "Av. de los Canarios", "Av. México"}),
            new RutasAlimentadoras("Ruta Alimentadora 08 - Los Tuzos", R.drawable.alimentadora, new String[]{"Ida: Av. de los ingenieros", "Ida: Calle Romero de Terreno", "Ida: Calle Planímetro", "Ida: Calle Ciencias Exactas", "Ida: Circuito Francisco Herraiz Serrano", "Ida: Blvd. Arq. Alejandro Hierro Berber", "Ida: Av. de los Árboles", "Ida. Av. Pachuca", "Ida: Blvd. Felipe Ángeles", "Regreso: Av. Lic. y Gral. Germán Cororna del Rosal", "Regreso: Calle Lic. Javier Rojo Gómez", "Regreso: Av. Pachuca", "Regreso: Av. de los Árboles", "Regreso: Blvd. Arq. Alejandro Hierro Berber", "Regreso: Circuito francisco Herraiz Serrano", "Regreso: Calle Ciencias Exactas", "Regreso: Calle Maestros", "Regreso: Av. de los Ingenieros"}),
            new RutasAlimentadoras("Ruta Alimentadora 09 - Pitahayas", R.drawable.alimentadora, new String[]{"Ida: Blvd. Hda. de Pitahayas", "Ida: Blvd. Santa Catarina", "Ida: Blvd. Felipe Ángeles", "Regreso: Calle Los Prismas", "Regreso: Blvd. Nuevo Hidalgo", "Regreso: Blvd. Santa Catarina", "Regreso: Blvd. Hda. de Pitahayas"}),
            new RutasAlimentadoras("Ruta Alimentadora 10 - Paseo de Camelinas", R.drawable.alimentadora, new String[]{"Ida: Calle Bugambilias", "Ida: Blvd. Ramón G. Bonfil", "Ida: Blvd. Santa Catarina", "Ida: Blvd. Felipe Ángeles", "Regreso: Calle Los Prismas", "Regreso Blvd. Nuevo Hidalgo", "Regreso: Blvd. Santa Catarina", "Regreso: Blvd. Ramón G. Bonfil", "Regreso: Calle Bugambilias"}),
            new RutasAlimentadoras("Ruta Alimentadora 11 - El Huixmí", R.drawable.alimentadora, new String[]{"Ida: Calle Mayas", "Ida: Calle Totonacas", "Ida: Calle 1° de Mayo", "Ida: Calle Ejército Mexicano", "Ida: Calle 5 de Mayo", "Ida: Blvd. Marcos Souberville González", "Ida: Carretera Huximí", "Ida: Blvd. Santa Catarina", "Ida: Blvd. Felipe Ángeles", "Regreso: Calle Los Prismas", "Regreso: Blvd. Nuevo Hidalgo", "Regreso: Blvd. Santa Catarina", "Regreso: Carretera Huixmí", "Regreso: Blvd. Marcos Souverville Gonzaléz", "Regreso: Calle 5 de Mayo", "Regreso: Calle 1° de Mayo", "Regreso: Calle Mexicas", "Regreso: Calle Mayas"}),
            new RutasAlimentadoras("Ruta Alimentadora 12 - La Colonia/Magisterio", R.drawable.alimentadora, new String[]{"Ida: Av. Magisterio", "Ida: Av. de los Venados", "Ida: Av. de los Árboles", "Ida: Av. Pachuca", "Ida: Blvd. Felipe Ángeles", "Regreso: Av. Pachuca", "Regreso: Av. Magisterio", "Regreso: Calle Framboyanes", "Regreso: Av. de los Árboles", "Regreso: Av. Los Venados", "Regreso: Av. Magisterio"}),
            new RutasAlimentadoras("Ruta Alimentadora 13 - El Venado/Los Tuzos", R.drawable.alimentadora, new String[]{"Ida: Av. Moreda", "Ida: Vuelta en 'U' Av. Moreda", "Ida. Av. Moreda", "Ida. Calle Jacarandas", "Ida: Av. Felipe Ángeles", "Ida: Av. El Venado", "Av. Río Papaloapan", "Regreso: Blvd. Felipe Ángeles", "Regreso: Av. Río Papaloapan", "Regreso: Av. El Venado", "Regreso: Av. Vicente Guerrero", "Regreso: Av. Felipe Ángeles", "Regreso: Calle Ignacio Zaragoza", "Regreso: Av. Moreda"}),
            new RutasAlimentadoras("Ruta Alimentadora 14 - San Pedro Nopancalco", R.drawable.alimentadora, new String[]{"Ida: Calle 30 de Julio", "Ida: Calle 13 de Octubre", "Ida. Calle 20 de Agosto", "Ida: Calle 28 de Febrero", "Ida: Calle 21 de Marzo", "Ida: Calle 1 de Mayo", "Ida: Calle 20 de Noviembre", "Ida: Blvd. Ramón G. Bonfil", "Ida: Av. Álamo", "Ida: Av. Tezontle", "Regreso: Blvd. Felipe Ángeles", "Regreso: Av. Tezontle", "Regreso: Av. Álamo", "Regreso: Blvd. Ramón G. Bonfil", "Regreso: Calle 20 de Noviembre", "Regreso: Calle 1 de Mayo", "Regreso: Calle 21 de Marzo", "Regreso: Calle 30 de Julio"}),
            new RutasAlimentadoras("Ruta Alimentadora 15a - La Loma", R.drawable.alimentadora, new String[]{"Ida: Av. Javier Rojo Gómez", "Ida: Calle Vicente Suárez", "Ida: Calle Pino Suárez", "Ida: Calle Río de los Remedios", "Ida: Av. Javier Rojo Gómez", "Ida: Calle Volcán de Chinchón", "Ida: Calle Volcán Quínceo", "Ida: Calle Nevado de Chícon", "Ida: Av. Ferrocarril Central", "Ida: Blvd. Luis Donaldo Colosio", "Ida: Blvd. Felipe Ángeles", "Regreso: Vuelta en 'U' Felipe Ángeles", "Regreso: Blvd. Luis Donaldo Colosio", "Regreso: Av. Ferrocarril Central", "Regreso: Calle Iztaccíhuatl", "Regreso: Volcán de Chinchón", "Regreso: Av. Javier Rojo Gómez", "Regreso: Calle Río de los Remedios", "Regreso: Calle Pino Suárez", "Regreso: Calle Vicente Suárez", "Regreso: Av. Javier Rojo Gómez"}),
            new RutasAlimentadoras("Ruta Alimentadora 15b - La Loma/Abetos", R.drawable.alimentadora, new String[]{"Ida: Calle Roble", "Ida: Calle Río Camarones", "Ida: Calle José María Morelos", "Ida: Calle Esmeralda", "Ida: Calle Diamante", "Ida: Calle Zafiro", "Ida: Calle de las Torres", "Ida: Blvd. Luis Donaldo Colosio", "Ida: Blvd Felipe Ángeles", "Regreso: Vuelta en 'U' Felipe Ángeles", "Regreso: Blvd. Luis Donaldo Colosio", "Regreso: Vuelta en 'U' Blvd. Luis Donaldo Colosio", "Regreso: Colosio", "Regreso: Callde de las Torres", "Regreso: Calle Zafiro", "Regreso: Calle Esmerada", "regreso: Calle Francisco Javier Mina", "Regreso: Calle José María Morelos", "Regreso: Calle Río Camarones", "Regreso: Calle Roble"}),
            new RutasAlimentadoras("Ruta Alimentadora 16 - San Carlos", R.drawable.alimentadora, new String[]{"Av. San Carlos", "Blvd. Ramón G. Bonfil", "Camino Real de la Plata"}),
            new RutasAlimentadoras("Ruta Alimentadora 17 - Punta Azul", R.drawable.alimentadora, new String[]{"Ida: Av. Constituyentes", "Ida: Av. Solidaridad", "Ida: Av. Piracantos", "Ida: Blvd. Ramón G. Bonfil", "Ida: Calle 16 de Septiembre", "Ida: Av. Ferrocarril Central", "Ida: Av. Palmar", "Ida: Calle Tula", "Ida: Calle Paseo Toltecas", "Ida: Calle Fundadores", "Ida: Av. Constituyentes", "Ida: Av. Benito Juárez", "Ida: Calle Art. 3ro", "Regreso: Calle Art. 3ro", "Regreso: Av. Constituyentes", "Regreso: Av. Palmar", "Regreso: Calle Paseo Toltecas", "Regreso: Calle Tula", "Regreso: Blvd Ramón G. Bonfil", "Regreso Av. Piracantos", "Regreso: Av Solidaridad", "Regreso Av. Constituyentes"}),
            new RutasAlimentadoras("Ruta Alimentadora 18 - Real del Valle", R.drawable.alimentadora, new String[]{"Ida: Blvd. Real del Valle", "Ida: Blvd. Valle de San Javier", "Ida: Calle Cuesco", "Ida: Av. Benito Juárez", "Regreso: Blvd. Valle de San Javier", "Regreso: Blvd. Real del Valle"}),
            new RutasAlimentadoras("Ruta Alimentadora 19 - Parque de Poblamiento", R.drawable.alimentadora, new String[]{"Ida: Av. Solidaridad", "Ida: Av. Federalismo", "Ida: Calle Puerto Mazatlán", "Ida: Av. Javier Rojo Gómez", "Ida: Av. Ferrocarril Central", "Ida: Calle 5 de Mayo", "Ida: Calle Fundadores", "Ida: Av. Constituyentes", "Ida: Calle Art. 3ro", "Ida: Av. Benito Juárez", "Regreso: Calle 5 de Mayo", "Regreso: Calle 5 de Mayo", "Regreso: Calle V. Carranza", "Regreso: Av. Javier Rojo Gómez", "Regreso: Calle Iztacihuatl", "Regreso: Av. Federalismo", "Regreso: Av. Solidaridad"}),
            new RutasAlimentadoras("Ruta Alimentadora 20 - Central de Autobuses", R.drawable.alimentadora, new String[]{"Ida: Bahía de Estación Central de Autobuses", "Ida: Blvd Felipe Ángeles", "Ida: Blvd. Javier Rojo Gómez", "Regreso: Blvd. Javier Rojo Gómez", "Regreso: Blvd Felipe Ángeles", "Regreso: Paradero de Estación Central de Autobuses"}),
        };

    public static RutasAlimentadoras getItem(int id) {
        for (RutasAlimentadoras item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
