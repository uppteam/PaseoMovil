package com.makingdreams.dani.paseomovil.rutasConvencional;

import com.makingdreams.dani.paseomovil.R;

/**
 * Created by dani on 31/07/16.
 */
public class RutasConvencional {
    private String nombre;
    private int idDrawable;
    private String[] lugares;

    public RutasConvencional(String nombre, int idDrawable, String[] lugares) {
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

    public static RutasConvencional[] ITEMS = {
            new RutasConvencional("Central - Providencia - 01 PCH C", R.drawable.r01pchc, new String[]{"Central de Autobuses", "Z.I. La Paz", "PRI Chacón", "UAEH", "Providencia"}),
            new RutasConvencional("Central - Campestre - 02 PCH C", R.drawable.r2pchc, new String[]{"Central de Autobuses", "Campestre Villas del Álamo"}),
            new RutasConvencional("Las Torres - Centro - 04 PCH C", R.drawable.r04pchc, new String[]{"Las Torres", "Col. Ávila Camacho", "Río de la Soledad", "La Surtidora", "Centro"}),
            new RutasConvencional("San Guillermo - Centro - 05 PCH C", R.drawable.r05pchc, new String[]{"San Guillermo", "Río de la Soledad", "La Surtidora", "Centro"}),
            new RutasConvencional("Dos Carlos - Campestre - 06 PCH C", R.drawable.r06pchc, new String[]{"Dos Carlos", "Col. Ávila Camacho", "Río de la Soledad", "La Surtidora", "Centro"}),
            new RutasConvencional("Piracantos - Pachuquilla - 07 PCH C", R.drawable.r07pchc, new String[]{"Piracantos", "Santa Julia", "Plutarco E. Calles", "Col. Doctores", "Cespedes", "UAEH", "Pachuquilla"}),
            new RutasConvencional("Fracc. Saucillo - Centro - 08 PCH C", R.drawable.r08pchc, new String[]{"Fracc. Saucillo", "PRI Chacón", "Centro"}),
            new RutasConvencional("Tulipanes - Centro - 09 PCH C", R.drawable.r09pchc, new String[]{"Tulipanes", "Tuzos", "La Reforma", "Centro"}),
            new RutasConvencional("11 de Julio - Centro - 10 PCH C", R.drawable.r10pchc, new String[]{"11 de Julio", "Doctores", "Surtidora", "Centro"}),
            new RutasConvencional("Col. Centro - Pachuqilla - 11 PCH C", R.drawable.r11pchc, new String[]{"Col. Centro", "Col. Periodistas", "Col. Céspedes Reforma", "Col. Unidad Minera", "Pachuquilla"}),
            new RutasConvencional("La Raza - Centro - 12 PCH C", R.drawable.r12pchc, new String[]{"La Raza", "Cubitos", "Doctores", "Centro"}),
            new RutasConvencional("Barrio La Cruz - Céspedes - 14 PCH C", R.drawable.r14pchc, new String[]{"Barrio La Cruz", "Barrio El Arbolito", "Centro", "Surtidora", "Céspedes"}),
            new RutasConvencional("Minerva - Centro - 15 PCH C", R.drawable.r15pchc, new String[]{"Minerva", "Guadalupe", "Río de la Soledad", "Céspedes", "Doctores", "Centro"}),
            new RutasConvencional("Dos Carlos - Centro - 19 PCH C", R.drawable.r19pchc, new String[]{"Dos Carlos", "Calabazas", "Jaltepec", "Surtidora", "Centro"}),
            new RutasConvencional("Centro - Campestre - 20 PCH C", R.drawable.r20pchc, new String[]{"Centro", "Céspedes", "Doctores", "UAEH", "Campestre Villas del Álamo"}),
            new RutasConvencional("Mirador - El Lobo - 21 PCH C", R.drawable.r21pchc, new String[]{"Mirador", "Centro", "Doctores", "Surtidora"}),
            new RutasConvencional("Centro - Fracc. Rinconada de los Ángeles - 25 B PCH C", R.drawable.r25bpchc, new String[]{"Centro", "Central de Autobuses", "CONALEP", "El Saucillo", "Providencia", "Fracc. Rinconada de los Ángeles"}),
            new RutasConvencional("Central - Centro - 25 C PCH C", R.drawable.r25cpchc, new String[]{"Central de Autobuses", "Bosques del Peñar", "Centro"}),
            new RutasConvencional("Plutarco E. Calles - Centro - 25 D PCH C", R.drawable.r25dpchc, new String[]{"Plutarco E. Calles", "Prepa 3", "Santa Julia", "Central de Autobuses", "Centro"}),
            new RutasConvencional("Punta Azul - Centro - 25 E PCH C", R.drawable.r25epchc, new String[]{"Punta Azul", "Palmar", "Central de Autobuses", "Centro"}),
            new RutasConvencional("Centro - Paseos de Chavarría - 25 F PCH C", R.drawable.r25fpchc, new String[]{"Centro", "Central de Autobuses", "CONALEP", "El Saucillo", "Providencia", "Fracc. Paseos de Chavarría"}),
            new RutasConvencional("Azoyatla - Centro - 27 PCH C", R.drawable.r27pchc, new String[]{"Azoyatla", "Campestre Villas del Álamo", "Surtidora", "Centro"}),
            new RutasConvencional("Anahuac - Centro - 28 F PCH C", R.drawable.r28fpchc, new String[]{"Anahuac", "Guadalupe", "El Lobo", "Doctores", "Centro"}),
            new RutasConvencional("Central - Ávila Camacho - 29 PCH C", R.drawable.r29pchc, new String[]{"Central de Autobuses", "Cubitos", "Doctores", "Céspedes", "Ávila Camacho"}),
            new RutasConvencional("Ciudad del Conocimiento - Centro - 35 PCH C", R.drawable.r35pchc, new String[]{"Ciudad del Conocimiento", "Santiago Tlapacoya", "Plutarco E. Calles", "Centro"}),
            new RutasConvencional("Barromex - Centro - 36 PCH C", R.drawable.r36pchc, new String[]{"Barromex", "López Portillo", "Centro"}),
            new RutasConvencional("Centro - Nva. Estrella - 37 PCH C", R.drawable.r37pchc, new String[]{"Centro", "Del Castillo", "La Palma", "El Arbolito", "Nva. Estrella"}),
            new RutasConvencional("Fracc. Colosio - Centro - 38 PCH C", R.drawable.r38pchc, new String[]{"Fracc. Colosio", "Campo de Tiro", "Plutarco E. Calles", "Morelos", "Centro"}),
            new RutasConvencional("La Pila - Centro - 39 PCH C", R.drawable.r39pchc, new String[]{"La Pila", "La Cruz", "San Bartolo", "Centro"}),
            new RutasConvencional("Punta Azul - Centro - 46 PCH C", R.drawable.r46pchc, new String[]{"Punta Azul", "Piracantos", "Parque de Poblamiento", "Plutarco E. Calles", "Col. Los Cedros", "Fracc. Aquiles Serdan", "Col. Rojo Gómez", "Col. Morelos", "Centro"}),
            new RutasConvencional("Luis D. Colosio - Carboneras - 47 PCH C", R.drawable.r47pchc, new String[]{"Luis D. Colosio", "Campo de Tiro", "Plutarco E. Calles", "Doctores", "Céspedes", "11 de Julio", "Taxistas", "Carboneras"}),
            new RutasConvencional("El Palmar - Col. Canutillo - 48 A PCH C", R.drawable.r48apchc, new String[]{"El Palmar", "IMSS", "Hospital General", "Col. Canutillo"}),
            new RutasConvencional("Camelinas - Col. Canutillo - 48 B PCH C", R.drawable.r48bpchc, new String[]{"Camelinas", "El Palmar", "IMSS", "Hospital General", "Col. Canutillo"}),
            new RutasConvencional("Parque Urbano - Cd. de los Niños - 52 PCH C", R.drawable.r52pchc, new String[]{"Parque Urbano", "San Antonio", "Soriana", "San Javier", "Real de Minas", "Cd. de los Niños"}),
            new RutasConvencional("Centro - Campestre Villas del Álamo - 53 A PCH C", R.drawable.r53apchc, new String[]{"Centro", "Doctores", "Carboneras", "Campestre Villas del Álamo"}),
            new RutasConvencional("Centro - Bosques del Peñar - 53 B PCH C", R.drawable.r53pchc, new String[]{"Centro", "Surtidora", "Doctores", "Bosques del Peñar"}),
            new RutasConvencional("Centro - El Saucillo - 54 PCH C", R.drawable.r54pchc, new String[]{"Centro", "Surtidora", "Doctores", "Colinas de Plata", "El Saucillo"}),
            new RutasConvencional("Centro - La Cruz - 55 PCH C", R.drawable.r55pchc, new String[]{"Centro", "San Nicolás", "La Alcantarilla", "Patoni", "Españita", "La Cruz"}),
            new RutasConvencional("Centro - 11 de Julio - 56 PCH C", R.drawable.r56pchc, new String[]{"Centro", "Doctores", "Cubitos", "Felipe Ángeles", "11 de Julio"}),
            new RutasConvencional("Distribuidor Miguel Hidalgo - Centro - 57 A PCH C", R.drawable.r57apchc, new String[]{"Distribuidor Vial Miguel Hidalgo", "El Palmar", "Piracantos", "Centro"}),
            new RutasConvencional("Distribuidor Miguel Hidalgo - Centro - 57 B PCH C", R.drawable.r57bpchc, new String[]{"Distribuidor Vial Miguel Hidalgo", "El Palmar", "Plutarco E. Calles", "Centro"}),
            new RutasConvencional("Col. Pirules - Centro - 58 PCH C", R.drawable.r58pchc, new String[]{"Col. Pirules", "Col. 20 de Noviembre", "Col. San Bartolo", "Centro"}),
            new RutasConvencional("Providencia - Centro - 59 A PCH C", R.drawable.r59apchc, new String[]{"Providencia", "UAEH", "Céspedes", "Doctores", "Centro"}),
            new RutasConvencional("Fracc. Rinconada de los Ángeles - Centro - 59 B PCH C", R.drawable.r59bpchc, new String[]{"Fracc. Rinconada de los Ángeles", "Providencia", "UAEH", "Doctores", "Centro"}),
            new RutasConvencional("Paseos de Chavarría - Centro - 59 C PCH C", R.drawable.r59cpchc, new String[]{"Fracc. Paseos de Chavarría", "Providencia", "UAEH", "Doctores", "Centro"}),
            new RutasConvencional("Ciudad del Conocimiento - Cabecera Municipal de Pachuca - 61 PCH C", R.drawable.r61pchc, new String[]{"Ciudad del Conocimiento", "Santiagp Tlapacoya", "Cabecera Municipal de Pachuca"}),
            new RutasConvencional("La Loma - Centro - 63 PCH C", R.drawable.r63pchc, new String[]{"La Loma", "El Palmar", "Santa Julia", "Plutarco E. Calles", "Centro"}),
            new RutasConvencional("Pachuca - La Higa - 64 PCH C", R.drawable.r64pchc, new String[]{"Pachuca", "Palma Gorda", "La Higa"}),
            new RutasConvencional("Cabecera Municipal de Pachuca - Cabecera Municipal de Zempoala - 66 PCH C", R.drawable.r66pchc, new String[]{"Cabecera Municipal de Pachuca", "Cabecera Municipal de Zempoala"}),
            new RutasConvencional("Pachuca - Tepa el Grande - 67 PCH C", R.drawable.r67pchc, new String[]{"Pachuca", "Zempoala", "Acelotla", "San Gabriel Azteca", "Tepa el Grande"}),
            new RutasConvencional("Cabecera Municipal de Pachuca - La Estanzuela - 68 A PCH C", R.drawable.r68apchc, new String[]{"Cabecera Municipal de Pachuca", "Camelia", "San Miguel Cerezo", "La Estanzuela"}),
            new RutasConvencional("Cabecera Municipal de Pachuca - El Cedral - 68 B PCH C", R.drawable.r68bpchc, new String[]{"Cebecera Municipal de Pachuca", "Camelia", "San Miguel Cerezo", "La Estanzuela", "Barrio Rincón Chico", "Barrio Centro", "El Cedral"}),
            new RutasConvencional("La Loma - Centro - 68 C PCH C", R.drawable.r68cpchc, new String[]{"La Loma", "El Palmar", "Santa Julia", "Plutarco E. Calles", "Centro"}),
            new RutasConvencional("Cabecera Municipal de Pachuca - Barrio España - 68 D PCH C", R.drawable.r68dpchc, new String[]{"Cabecera Municipal de Pachuca", "Camelia", "San Miguel Cerezo", "La Estanzuela", "Barrio España"}),
            new RutasConvencional("Parque los Encinos - Centro - 69 PCH C", R.drawable.r69pchc, new String[]{"Parque los Encinos", "Tuzos", "Tulipanes", "Central de Autobuses"}),
            new RutasConvencional("Villa de Tezontepec - Téllez - 71 PCH C", R.drawable.r71pchc, new String[]{"Villa de Tezontepec", "Col. Guadalupe", "Tlaquilpan", "Terminal Téllez"}),
            new RutasConvencional("Ciudad del Conocimiento - Plaza de Toros - 72 PCH C", R.drawable.r72pchc, new String[]{"Ciudad del Conocimiento", "Tlapacoya", "Plaza de Toros"}),
            new RutasConvencional("Col. Guadalupe - Universidad del Fútbol - 74 PCH C", R.drawable.r74pchc, new String[]{"Col. Guadalupe", "Universidad del Fútbol"}),
            new RutasConvencional("Fracc. La Providencia - Tilcuautla - 77 PCH C", R.drawable.r77pchc, new String[]{"Fracc. La Providencia", "El Saucillo", "Tuzos", "Tulipanes", "Plaza del Valle", "CEDISCO", "Tilcuautla"}),
            new RutasConvencional("Col. Jorge Obispo - Central de Abasto - 78 PCH C", R.drawable.r78pchc, new String[]{"Col. Jorge Obispo", "Unión Antorchista", "Manuel Otero", "Parque de Poblamiento", "Santa Julia", "Central de Abasto"}),
            new RutasConvencional("Fracc. Quinta Bonita - Centro - 79 PCH C", R.drawable.r79pchc, new String[]{"Fracc. Quinta Bonita", "Tulipanes", "Fracc. Tuzos", "Col. Adolfo López Mateos", "Cubitos", "Parque Hidalgo", "Centro"}),
            new RutasConvencional("Fracc. San Cristóbal - Centro - 80 PCH C", R.drawable.r80pchc, new String[]{"Fracc. San Cristóbal", "La Providencia", "Parque Ind. Canacintra", "Col. Adolfo López Mateos", "Cubitos", "Parque Hidalgo", "Centro"}),
            new RutasConvencional("Fracc. Los Gemelos - Centro - 83 PCH C", R.drawable.r83pchc, new String[]{"Fracc. Los Gemelos", "Fracc. Rinconada de los Ángeles", "Fracc. La Calera", "La Calera", "Central de Autobuses", "Plaza Milenio", "Centro"}),
            new RutasConvencional("Cabecera Municipal de Pachuca - Cabecera Municipal de Atotonilco el Grande - 90 PCH C", R.drawable.r90pchc, new String[]{"Cabecera Municipal de Pachuca", "Cabecera Municipal de Mineral del Monte", "Cabecera Municipal de Atotonilco el Grande"}),
            new RutasConvencional("Paseos de Chavarría - Centro - 92 PCH C", R.drawable.r92pchc, new String[]{"Fracc. Paseos de Chavarría", "Central de Autobuses", "Plaza Milenio", "Centro"}),
            new RutasConvencional("La Loma - Plaza de Toros - 94 PCH C", R.drawable.r94pchc, new String[]{"Los Órganos", "Plaza de Toros"}),
            new RutasConvencional("La Loma - Centro - 65 PCH C", R.drawable.r65pchc, new String[]{"La Loma", "Fracc. Colosio", "Piracantos", "Centro"}),
            new RutasConvencional("Pachuca - La Higa - 97 A PCH C", R.drawable.r97apchc, new String[]{"Pachuca", "Palma Gorda", "La Higa"}),
            new RutasConvencional("Cd. del Conocimiento - Centro - 97 B PCH C", R.drawable.r97bpchc, new String[]{"Cd. del Conocimiento", "Blvd. Colosio", "Av. del Palmar", "Blvd. del Minero", "Plaza Juárez", "1° de Mayo", "Centro"}),
            new RutasConvencional("Cd. del Conocimiento - Central de Abasto - 97 C PCH C", R.drawable.r97cpchc, new String[]{"Cd. del Conocimiento", "Blvd. Colosio", "Blvd. Nuevo Hidalgo", "Central de Abasto"})
    };

    public static RutasConvencional getItem(int id) {
        for (RutasConvencional item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
