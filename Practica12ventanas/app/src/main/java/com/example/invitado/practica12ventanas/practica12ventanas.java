package com.example.invitado.practica12ventanas;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class practica12ventanas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica12ventanas);

    }

    public void imagen(View view) {
        Dialog settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.imagensita, null));
        settingsDialog.setCanceledOnTouchOutside(true);
        settingsDialog.show();

    }

    public void cerrar(View view) {
        AlertDialog.Builder ale = new AlertDialog.Builder(this);
        ale.setTitle("Vamonoooooos").
                setMessage("Desea salir de la app pendejo?").
                setCancelable(true).
                setPositiveButton("Sipirili", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);
                    }
                }).setNegativeButton("Nel pastel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(practica12ventanas.this, "oki", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
}
