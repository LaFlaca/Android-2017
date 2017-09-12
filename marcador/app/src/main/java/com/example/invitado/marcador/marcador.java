package com.example.invitado.marcador;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class marcador extends AppCompatActivity {
    TextView j1,j2,result;
    Button j1sumar,j2sumar,j1restar,j2restar;

    private SensorManager mSensorManager;
    private float mAccel; // acceleration apart from gravity
    private float mAccelCurrent; // current acceleration including gravity
    private float mAccelLast; // last acceleration including gravity

    private final SensorEventListener mSensorListener = new SensorEventListener() {

        public void onSensorChanged(SensorEvent se) {
            float x = se.values[0];
            float y = se.values[1];
            float z = se.values[2];
            mAccelLast = mAccelCurrent;
            mAccelCurrent = (float) Math.sqrt((double) (x*x + y*y + z*z));
            float delta = mAccelCurrent - mAccelLast;
            mAccel = mAccel * 0.9f + delta; // perform low-cut filter
            onPause();
            if (mAccel > 10) {
                ((TextView)findViewById(R.id.TV_j1puntos)).setText("0");
                ((TextView)findViewById(R.id.TV_j2puntos)).setText("0");
            }
            onResume();
        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        mSensorManager.unregisterListener(mSensorListener);
        super.onPause();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcador);

        mSensorManager = (SensorManager) getSystemService(this.SENSOR_SERVICE);
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        mAccel = 0.00f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;


        j1=(TextView)findViewById(R.id.TV_j1puntos);
        j2=(TextView)findViewById(R.id.TV_j2puntos);
        j1sumar = (Button)findViewById(R.id.btn_jg1mas);
        j2sumar = (Button) findViewById(R.id.btn_j2mas);
        j1restar = (Button) findViewById(R.id.btn_j1menos);
        j2restar = (Button)findViewById(R.id.btn_j2mas);
    }

    public void j1anota(View view) {
        int S = Integer.parseInt(j1.getText().toString());
        S++;
        if (S ==15){
            Toast toast = Toast.makeText(this,"Ganador jugador 1",Toast.LENGTH_LONG);
            toast.show();
            ((TextView)findViewById(R.id.TV_j1puntos)).setText("0");
            ((TextView)findViewById(R.id.TV_j2puntos)).setText("0");
            S=0;
        }
        j1.setText(S+"");
    }

    public void j1menos(View view) {
        int S = Integer.parseInt(j1.getText().toString());
        if (S > 0) {
            S--;
        }
        j1.setText(S+"");
    }

    public void j2anota(View view) {
        int S = Integer.parseInt(j2.getText().toString());
        S++;
        if (S ==15){
            Toast toast = Toast.makeText(this,"Ganador jugador 2",Toast.LENGTH_LONG);
            toast.show();
            ((TextView)findViewById(R.id.TV_j2puntos)).setText("0");
            ((TextView)findViewById(R.id.TV_j1puntos)).setText("0");
            S=0;
        }
        j2.setText(S+"");

    }

    public void j2menos(View view) {
        int S = Integer.parseInt(j2.getText().toString());
        if (S > 0) {
            S--;
        }
        j2.setText(S+"");
    }


}
