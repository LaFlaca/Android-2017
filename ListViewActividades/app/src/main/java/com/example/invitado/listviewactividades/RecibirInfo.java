package com.example.invitado.listviewactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecibirInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_info);
        TextView nombre = (TextView) findViewById(R.id.tv_nombre);
        TextView apellido = (TextView) findViewById(R.id.tv_apellido);

        Intent intent = getIntent();
        String str = intent.getStringExtra("location");
        String str2 = intent.getStringExtra("location2");
        nombre.setText(str);
        apellido.setText(str2);
    }

    public void menu(View view) {
        Intent regresar = new Intent(getBaseContext() , listview.class);
        startActivity(regresar);
    }
}
