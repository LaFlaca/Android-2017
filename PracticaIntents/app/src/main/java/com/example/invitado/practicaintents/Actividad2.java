package com.example.invitado.practicaintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("Texto");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("Texto");
        }
        ((TextView)findViewById(R.id.tv_texto2)).setText(newString);

    }
}
