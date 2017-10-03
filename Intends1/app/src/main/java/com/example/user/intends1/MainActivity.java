package com.example.user.intends1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
        EditText etdato;
    Button btnguardar, btnmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;
        SharedPreferences shared = getSharedPreferences("Archivo", context.MODE_PRIVATE);

        View btn = findViewById(R.id.btn_cambiar);
        btn.setOnClickListener(this);

        etdato = (EditText)findViewById(R.id.ET_dato);
        btnguardar = (Button)findViewById(R.id.btn_guardar);
        btnmostrar = (Button)findViewById(R.id.btn_mostrar);


        btnmostrar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharpref = getPreferences(context.MODE_PRIVATE);
                String valor = sharpref.getString("MiDato","No hay Dato");
                Toast.makeText(getApplicationContext(), "Dato Guardado: "+valor, Toast.LENGTH_SHORT).show();
            }
        });

        btnguardar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharpref = getPreferences(context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharpref.edit();
                editor.putString("MiDato", etdato.getText().toString());
                editor.commit();
            }
        });
    }

    @Override
    public void onClick(View v) {

        Intent abrir = new Intent(this, Actividad2.class);
        startActivity(abrir);
        Toast.makeText(this, "Cambiando a actividad 2", Toast.LENGTH_LONG).show();
    }
}
