package com.example.invitado.segundoparcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText u,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        u = (EditText)findViewById(R.id.ET_log_usuario);
        c = (EditText)findViewById(R.id.ET_log_contra);
    }

    public void login(View view) {
        if (u.length()>0&&c.length()>0){

            String usuario = u.getText().toString();
            String contra = c.getText().toString();

                if (usuario.equals("segundoparcial")&&contra.equals("1")){
                    Intent intent = new Intent(getApplicationContext(),Principal.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectos",Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(getApplicationContext(),"Ingresar Usuario valido",Toast.LENGTH_LONG).show();
            }

        }

    }


