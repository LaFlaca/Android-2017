package com.example.invitado.segundoparcial;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lista = (ListView) findViewById(R.id.LV_lista);

        String[] companeros={"Leer Placa","Vehiculos afiliados","Acerca de","Cerrar sesion"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(lista.getContext(),android.R.layout.simple_list_item_1,companeros);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {

                String selectedFromList =(String) (lista.getItemAtPosition(myItemInt));
               Intent intent = new Intent(getBaseContext() , Lector.class);
                switch (selectedFromList){
                    case "Leer Placa":

                        String texto = null;
                     //   intent.putExtra("uwu", texto);
                       startActivity(intent);

                        break;
                    case "Vehiculos afiliados":

                       Intent intent2 = new Intent(getBaseContext() , Grid.class);
                        startActivity(intent2);

                        break;
                    case "Acerca de":

                        dialogo();
                        
                        break;

                    case "Cerrar sesion":
                       AlertDialog.Builder ale = new AlertDialog.Builder(Principal.this);
                        ale.setTitle(" ").
                                setMessage("Desea cerrar sesion?").
                                setCancelable(true).
                                setPositiveButton("Cerrar sesion", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent I = new Intent(Principal.this, MainActivity.class);
                                        startActivity(I);
                                    }
                                }).setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        ale.show();

                }
            }
        });
    }

    private void dialogo() {
        final android.app.AlertDialog builder = new android.app.AlertDialog.Builder(this).create();
        LayoutInflater dialogo = this.getLayoutInflater();
        View v = dialogo.inflate(R.layout.activity_dialogo, null);
        builder.setView(v);

        Button btnWeb = (Button)v.findViewById(R.id.btn_web);
        Button btnLogin = (Button)v.findViewById(R.id.btn_login);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/LaFlaca";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getBaseContext() , MainActivity.class);
                startActivity(intent2);
            }
        });
        builder.show();
    }

}

