package com.example.invitado.listviewactividades;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Dialogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogo);
    }

    public void dialogo(View view) {

        Dialog settingsDialog = new Dialog(this);
        settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.activity_dialogo_imagen, null));
        settingsDialog.setCanceledOnTouchOutside(true);
        settingsDialog.show();

    }

    public void regresar(View view) {
        Intent regresar = new Intent(getBaseContext() , listview.class);
        startActivity(regresar);
    }
}
