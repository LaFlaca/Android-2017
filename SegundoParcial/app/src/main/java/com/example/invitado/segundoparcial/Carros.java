package com.example.invitado.segundoparcial;

/**
 * Created by Invitado on 23/10/2017.
 */

public class Carros {
    private String nombre;
    private int idDrawable;

    public Carros(String nombre, int idDrawable) {
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

    public static Carros [] ITEMS = {
            new Carros("BMW x6", R.drawable.bmw),
            new Carros("Chevrolet Corvette", R.drawable.chevr),
            new Carros("Dodge Charger", R.drawable.dodge),
            new Carros("Jaguar XJ", R.drawable.jaguar),
            new Carros("Mercedes C Coupe", R.drawable.mercedes),
            new Carros("Mitsubishi ASX", R.drawable.mitsu),
            new Carros("Nissan GTR", R.drawable.nissan),
            new Carros("Toyota CHR", R.drawable.toyota),
            new Carros("Volkswagen Passat", R.drawable.volks),
            new Carros("Volvo XC40", R.drawable.volvo),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Coche
     */
    public static Carros getItem(int id) {
        for (Carros item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
