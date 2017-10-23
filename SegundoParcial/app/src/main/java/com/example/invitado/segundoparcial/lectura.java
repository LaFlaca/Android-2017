package com.example.invitado.segundoparcial;

import java.text.NumberFormat;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class lectura extends AppCompatActivity {

    EditText cant;
    RadioGroup grupo_rb;
    View v;
    double deuda = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura);
        cant =(EditText)findViewById(R.id.et_lectura);
        String lectura = getIntent().getStringExtra("TEXTO");
        final String [] lineas = lectura.split(",");
        String [] etiquetas = {"Marca", "Modelo", "Año", "Deuda"};
        if (lineas.length > 0) {
            deuda = Double.parseDouble(lineas[lineas.length-1]);
            lectura = etiquetas[0]+ ": " + lineas[0].toUpperCase();
            for (int i = 1; i < lineas.length; i++) {
                lectura += "\n" + etiquetas[i]+ ": " + lineas[i].toUpperCase();
            }
        }
        cant.setText(lectura);

        Button verDeuda = (Button)findViewById(R.id.btn_pagar);
        verDeuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lineas.length > 0) {
                    createLayerDialogo(deuda);
                }
            }
        });
    }
    public void createLayerDialogo(Double deuda) {
        final AlertDialog builder = new AlertDialog.Builder(this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        v = inflater.inflate(R.layout.activity_total_pagar, null);
        builder.setView(v);

        NumberFormat formater = NumberFormat.getCurrencyInstance();
        ((TextView)v.findViewById(R.id.tv_cantidad)).setText(formater.format(deuda));

        Button pagar = (Button)v.findViewById(R.id.btn_pagar_dialogo);

        grupo_rb = (RadioGroup)v.findViewById(R.id.opciones_grupo);
        grupo_rb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                RadioButton radioButton = (RadioButton) v.findViewById(i);
                Toast.makeText(lectura.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (grupo_rb.getCheckedRadioButtonId() > -1){
                    builder.dismiss();
                }else{
                    Toast.makeText(lectura.this, "Selecciona metodo de pago primero", Toast.LENGTH_SHORT).show();
                }
            }
        });

        builder.show();
    }
}
