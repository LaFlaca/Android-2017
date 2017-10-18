package com.example.invitado.listviewactividades;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends AppCompatActivity {
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);



        lista = (ListView) findViewById(R.id.lista);

        String[] companeros={"Escanear Codigo QR","Pasar datos entre Actividades","Dialogo","Grid","Salir"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(lista.getContext(),android.R.layout.simple_list_item_1,companeros);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {

                String selectedFromList =(String) (lista.getItemAtPosition(myItemInt));
                Intent intent = new Intent(getBaseContext() , Lector.class);
                switch (selectedFromList){
                    case "Escanear Codigo QR":

                        String texto = null;
                        intent.putExtra("uwu", texto);
                        startActivity(intent);

                        break;
                    case "Pasar datos entre Actividades":

                        Intent intent2 = new Intent(getBaseContext() , PasarDato.class);
                        startActivity(intent2);

                        break;
                    case "Dialogo":


                        Intent intent3 = new Intent(getBaseContext() , Dialogo.class);

                        startActivity(intent3);

                        break;
                    case "Grid":

                        Intent intent4 = new Intent(getBaseContext() , Grid.class);

                        startActivity(intent4);
                       // startActivity(intent);
                        break;
                    case "Salir":
                        AlertDialog.Builder ale = new AlertDialog.Builder(listview.this);
                        ale.setTitle("Vamonoooooos").
                                setMessage("Desea salir de la app?").
                                setCancelable(true).
                                setPositiveButton("Sipirili", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        System.exit(0);
                                    }
                                }).setNegativeButton("Nel pastel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(listview.this, "oki", Toast.LENGTH_SHORT).show();
                            }
                        }).show();

                }
            }
        });
    }
}
