package com.example.invitado.practica11radiobutton;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Practica11Radiobutton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica11_radiobutton);
        RadioGroup grupo = (RadioGroup)findViewById(R.id.GR_grupo);
        RadioButton masculino = (RadioButton) findViewById(R.id.RB_masculino);
        RadioButton femenino = (RadioButton) findViewById(R.id.RB_Femenino);
        final EditText primero = (EditText)findViewById(R.id.ET_primero);
        final EditText segundo = (EditText)findViewById(R.id.ET_segundo);
        final EditText tercero = (EditText)findViewById(R.id.ET_tercero);
        //  if (masculino.isChecked()){
        //    Toast.makeText(this, "Masculino", Toast.LENGTH_LONG).show();
        // }  else if (femenino.isChecked()) {
        //       Toast.makeText(this, "Femenino", Toast.LENGTH_LONG).show();
        // }
        //  }

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.RB_masculino)
                {
                    primero.setVisibility(View.VISIBLE);
                    segundo.setVisibility(View.INVISIBLE);
                    tercero.setVisibility(View.INVISIBLE);
                } else if (checkedId == R.id.RB_Femenino)
                    {
                        primero.setVisibility(View.INVISIBLE);
                        segundo.setVisibility(View.VISIBLE);
                        tercero.setVisibility(View.VISIBLE);
                    }
            }
        });
    }
}
