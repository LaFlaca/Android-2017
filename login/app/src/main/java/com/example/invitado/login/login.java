package com.example.invitado.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void btn_log(View view) {
       String correo = ((EditText)findViewById(R.id.ET_correo)).getText().toString();
       String contraseña = ((EditText)findViewById(R.id.ET_contra)).getText().toString();


        if (correo.length() >0  && contraseña.length() >0  ){
            if (correo.equals("maryfer3112@hotmail.com") && contraseña.equals("1231ferl")){

                Intent intent = new Intent(getApplicationContext(),inicio.class);
                startActivity(intent);
            }
        }
        else Toast.makeText(this, "Ingresar valores", Toast.LENGTH_SHORT).show();


    }
}
