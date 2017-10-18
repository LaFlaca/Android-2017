package com.example.invitado.listviewactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasarDato extends AppCompatActivity {

    Button avanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_dato);
        avanzar=(Button)findViewById(R.id.btn_avanzar);
    }

    public void avanzar(View view) {
        EditText nombre = (EditText) findViewById(R.id.et_nombre);
        EditText apellido = (EditText) findViewById(R.id.et_apellido);
        Intent intent = new Intent(PasarDato.this, RecibirInfo.class);
        intent.putExtra("location", nombre.getText().toString());
        intent.putExtra("location2", apellido.getText().toString());
        startActivity(intent);
    }

    public void regresar(View view) {
        Intent intent = new Intent(getBaseContext(), listview.class);
        startActivity(intent);
        this.finish();
    }
}
