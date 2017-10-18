package com.example.invitado.listviewactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Texto extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto);


        TextView txtView = (TextView) findViewById(R.id.tv_texto);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            String getName = (String) bd.get("name");
            txtView.setText(getName);

        }
    }

    public void regresar(View view) {
        Intent regresar = new Intent(getBaseContext() , listview.class);
        startActivity(regresar);
    }
}
