package com.example.invitado.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Practica4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica4);

     Toast toast1=Toast.makeText(this, "mensajito UwU", Toast.LENGTH_LONG);
        toast1.show();

        String nombre= "Fernandita ";
        String apellido = "Lopez ";
        Toast toast2= Toast.makeText(this, nombre + apellido, Toast.LENGTH_LONG);
        toast2.show();




    }
}
