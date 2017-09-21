package com.example.invitado.practicacheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class PracticaCheckbox extends AppCompatActivity {
    CheckBox seleccion;
    EditText password, contar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_checkbox);
        seleccion = (CheckBox)findViewById(R.id.CB_recuerdame);
        password = (EditText)findViewById(R.id.ET_password);
        contar = (EditText)findViewById(R.id.ET_cero);


        contar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (s.length()>0){
                    String ts = s.toString();
                    int n = Integer.parseInt(ts);

                if (n > 1000) {
                    seleccion.setChecked(true);
                } else {
                    seleccion.setChecked(false);
                }
            } }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void cb_activar(View view) {

        if (seleccion.isChecked() == true){
            password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            Toast.makeText(this, "yasssss", Toast.LENGTH_SHORT).show();
        } else {
            password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            Toast.makeText(this, "nawwwww", Toast.LENGTH_SHORT).show();
        }
    }




}
