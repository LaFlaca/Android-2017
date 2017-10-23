package com.example.invitado.segundoparcial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dialogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogo);
    }

    public void back2login(View view) {
        Intent intent2 = new Intent(getBaseContext() , MainActivity.class);
        startActivity(intent2);
    }

    public void web(View view) {
        String url = "https://github.com/LaFlaca";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
