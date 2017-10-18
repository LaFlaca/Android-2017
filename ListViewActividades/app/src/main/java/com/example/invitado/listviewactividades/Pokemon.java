package com.example.invitado.listviewactividades;

/**
 * Created by Invitado on 18/10/2017.
 */

public class Pokemon {

    private String nombre;
    private int idDrawable;

    public Pokemon(String nombre, int idDrawable) {
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

    public static Pokemon[] ITEMS = {
            new Pokemon("Espeon", R.drawable.eespeon),
            new Pokemon("Flareon", R.drawable.fflareon),
            new Pokemon("Glaceon", R.drawable.gglaceon),
            new Pokemon("Leafeon", R.drawable.lleafeon),
            new Pokemon("UmbreonT", R.drawable.uumbreon),

    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Coche
     */
    public static Pokemon getItem(int id) {
        for (Pokemon item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
