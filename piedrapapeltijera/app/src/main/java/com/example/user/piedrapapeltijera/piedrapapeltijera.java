package com.example.user.piedrapapeltijera;

import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class piedrapapeltijera extends AppCompatActivity {

    Button btn;
    ImageView img;
    private SensorManager sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedrapapeltijera);


        btn = (Button) findViewById(R.id.BTN);
        img = (ImageView) findViewById(R.id.iv_item);
        ShakeListener mShaker = new ShakeListener(this);


        mShaker.setOnShakeListener(new ShakeListener.OnShakeListener() {

            public void onShake() {
                Random r = new Random();
                int e = r.nextInt(3) + 1;

                if (e == 1) {
                    img.setImageResource(R.drawable.piedra);
                } else {
                    if (e == 2) {
                        img.setImageResource(R.drawable.papel);
                    } else {
                        if (e == 3) {
                            img.setImageResource(R.drawable.tijeras);
                        }
                    }
                }
            }
        });
    }
}