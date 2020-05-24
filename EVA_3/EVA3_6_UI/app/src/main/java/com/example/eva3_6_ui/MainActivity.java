package com.example.eva3_6_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwDato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwDato=findViewById(R.id.txtVwDato);

        Thread tHilo= new Thread() {
            @Override
            public void run() {
                super.run();
                int i=0;
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.wtf("tHilo",i + "");
                    txtVwDato.append(i + "\n");
                    i++;
                }
            }
        };
        tHilo.start();
    }
}
