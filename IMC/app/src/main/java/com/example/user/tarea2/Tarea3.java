package com.example.user.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tarea3 extends AppCompatActivity {

    EditText editalt, editpeso;
    TextView mostrarimc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea3);

        editalt = (EditText)findViewById(R.id.editalt);
        editpeso = (EditText)findViewById(R.id.editpeso);
        mostrarimc = (TextView)findViewById(R.id.tvmostrar);

    }

    public double calcularMasaCorporal (){


        double imc;
        double altura = Double.parseDouble(editalt.getText().toString());
        double peso = Double.parseDouble(editpeso.getText().toString());

            imc = peso / (altura * altura);
            return imc;

        }
}

    public void calcular(View view) {
        double imcc;
        imcc = calcularMasaCorporal();
        mostrarimc.setText("" + imcc);
    }
}
