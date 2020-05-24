package com.example.eva3_4_multiples_hilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hilo hilo= new Hilo();
        hilo.start();
        miRunnable MiRunnable= new miRunnable();
        Thread tHilo= new Thread(MiRunnable);
        tHilo.start();
    }
}
