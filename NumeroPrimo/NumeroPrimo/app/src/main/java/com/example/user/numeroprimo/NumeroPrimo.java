package com.example.user.numeroprimo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NumeroPrimo extends AppCompatActivity {



    Button validar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_primo);


    }

    public void Calcular(View view) {

        EditText et=(EditText)findViewById(R.id.ET_numero);
        validar=(Button)findViewById(R.id.BTN_calcular);


        int i, a=0;

        if (et.getText().length()> 0){

            int numero = Integer.parseInt(et.getText().toString());

            for (i =1; i<=numero;i++){
                    if (numero % i ==0){
                        a++;
                    }
        }
        if (a !=2){
            Toast msj =Toast.makeText(this,"No es primo",Toast.LENGTH_LONG);
            msj.show();
        } else {
            Toast msj =Toast.makeText(this,"Es primo",Toast.LENGTH_LONG);
            msj.show();
                }

                                    } else {
            Toast msj =Toast.makeText(this,"ingresa un valor",Toast.LENGTH_LONG);
            msj.show();
        }
    }
}
