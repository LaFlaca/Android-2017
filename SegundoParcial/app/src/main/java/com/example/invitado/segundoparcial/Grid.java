package com.example.invitado.segundoparcial;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Grid extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private GridView gridView;
    private Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new Adaptador (this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
    }
    public void regresar(View view) {
        Intent intent = new Intent(getBaseContext(), Principal.class);
        startActivity(intent);
        this.finish();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Carros item = (Carros) parent.getItemAtPosition(position);

        Intent intent = new Intent(this, detalle.class);
        intent.putExtra(detalle.EXTRA_PARAM_ID, item.getId());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            new Pair<View, String>(view.findViewById(R.id.iv_carro),
                                    detalle.VIEW_NAME_HEADER_IMAGE)
                    );

            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else
            startActivity(intent);
    }
}
