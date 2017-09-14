package com.example.invitado.primerparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class primerparcial extends AppCompatActivity {
        EditText etcanttotal;
    TextView tvporcentaje,tvcantactual;
        Button add5,add15,add30,add50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primerparcial);

        etcanttotal= (EditText)findViewById(R.id.ET_total);
        tvcantactual =(TextView)findViewById(R.id.TV_cantactual);
        tvporcentaje=(TextView)findViewById(R.id.TV_calcporcent);

     }

    public void add5(View view) {
       String C = tvcantactual.getText().toString();
        int R = Integer.parseInt(C);

        tvcantactual.setText(String.valueOf(R+5));
    }

    public void add15(View view) {
        String C = tvcantactual.getText().toString();
        int R = Integer.parseInt(C);

        tvcantactual.setText(String.valueOf(R+15));
    }

    public void add30(View view) {
        String C = tvcantactual.getText().toString();
        int R = Integer.parseInt(C);

        tvcantactual.setText(String.valueOf(R+30));
    }

    public void add50(View view) {
        String C = tvcantactual.getText().toString();
        int R = Integer.parseInt(C);

        tvcantactual.setText(String.valueOf(R+50));
    }

    public void calcular(View view) {


        String C = tvcantactual.getText().toString();
        int R = Integer.parseInt(C);
        String T = etcanttotal.getText().toString();
        int Tr =Integer.parseInt(T);

        tvporcentaje.setText(String.valueOf(((R*100)/Tr)));

    }



    public void tmanzanas(View view) {
        String C = etcanttotal.getText().toString();
        int R = Integer.parseInt(C);
        int manzanas= R*80;

        Toast.makeText(this, ""+manzanas, Toast.LENGTH_SHORT).show();
    }
}
