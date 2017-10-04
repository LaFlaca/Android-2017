package com.example.invitado.practicaintents;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements OnClickListener {

    SharedPreferences shared = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        View btn = findViewById(R.id.btn_cambiar);
        btn.setOnClickListener(this);

        shared = getSharedPreferences("firstrun", MODE_PRIVATE);

        if (shared.getBoolean("firstrun", true)){
            shared.edit().putBoolean("firstrun", false).commit();

            Intent P = new Intent(this, Paseo.class);
            startActivity(P);
        }

    }
    public void act2 (View view){
        Intent S = new Intent(this, Actividad2.class);
        EditText texto = (EditText)findViewById(R.id.et_texto);
        S.putExtra("cadena", texto.getText().toString());
        startActivity(S);
    }


    @Override
    public void onClick(View view) {
        Intent abrir = new Intent(this, Actividad2.class);
        startActivity(abrir);
        Toast.makeText(this, "Cambiando a actividad 2", Toast.LENGTH_LONG).show();
    }
}
