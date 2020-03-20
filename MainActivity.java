package com.xcheko51x.cambiarcoloresapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Window window;
    Button btnColorUno, btnColorDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        window = getWindow();

        btnColorUno = findViewById(R.id.btnColorUno);
        btnColorDos = findViewById(R.id.btnColorDos);

        btnColorUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String primarioDark = "#AB000D";
                String primario = "#E53935";
                cambiarColor(primarioDark, primario);

            }
        });

        btnColorDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String primarioDark = "#00701A";
                String primario = "#43A047";
                cambiarColor(primarioDark, primario);
            }
        });
    }

    public void cambiarColor(String primarioDark, String primario) {
        window.setStatusBarColor(Color.parseColor(primarioDark));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(primario)));
    }
}
