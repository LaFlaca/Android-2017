package com.example.invitado.practicaintents;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    SharedPreferences shared = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

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


}
