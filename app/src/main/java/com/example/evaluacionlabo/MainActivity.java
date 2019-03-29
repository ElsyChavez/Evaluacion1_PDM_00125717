package com.example.evaluacionlabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.evaluacionlabo.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    EditText info_usuario, info_email;
    Button boton_cont1, boton_cont2,boton_cont3,boton_cont4,boton_cont5,boton_cont6,boton_cont7,boton_cont8,boton_cont9,boton_enviar;
    int cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8,cont9, cont_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info_usuario = findViewById(R.id.ingreso_usuario);
        info_email = findViewById(R.id.ingreso_email);
        boton_cont1 = findViewById(R.id.boton1);
        boton_cont2 = findViewById(R.id.boton2);
        boton_cont3 = findViewById(R.id.boton3);
        boton_cont4 = findViewById(R.id.boton4);
        boton_cont5 = findViewById(R.id.boton5);
        boton_cont6 = findViewById(R.id.boton6);
        boton_cont7 = findViewById(R.id.boton7);
        boton_cont8 = findViewById(R.id.boton8);
        boton_cont9 = findViewById(R.id.boton9);
        boton_enviar = findViewById(R.id.boton_send);

        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        cont6 = 0;
        cont7 = 0;
        cont8 = 0;
        cont9 = 0;
        cont_total = 0;

        boton_cont1.setOnClickListener(v -> {
            cont1 = cont1 +1;
            cont_total = cont_total + cont1;
        });

        boton_cont2.setOnClickListener(v -> {
            cont2 = cont2 +1;
            cont_total = cont_total + cont2;
        });

        boton_cont3.setOnClickListener(v -> {
            cont3 = cont3 +1;
            cont_total = cont_total + cont3;
        });

        boton_cont4.setOnClickListener(v -> {
            cont4 = cont4 +1;
            cont_total = cont_total + cont4;
        });

        boton_cont5.setOnClickListener(v -> {
            cont5 = cont5 +1;
            cont_total = cont_total + cont5;
        });

        boton_cont6.setOnClickListener(v -> {
            cont6 = cont6 +1;
            cont_total = cont_total + cont6;
        });

        boton_cont7.setOnClickListener(v -> {
            cont7 = cont7 +1;
            cont_total = cont_total + cont7;
        });

        boton_cont8.setOnClickListener(v -> {
            cont8 = cont8 +1;
            cont_total = cont_total + cont8;
        });

        boton_cont9.setOnClickListener(v -> {
            cont9 = cont9 +1;
            cont_total = cont_total + cont9;
        });

        boton_enviar.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY1, info_usuario.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY2, info_email.getText().toString());
            mIntent.putExtra(AppConstants.text_cont1, cont1+"");
            mIntent.putExtra(AppConstants.text_cont2, cont2+"");
            mIntent.putExtra(AppConstants.text_cont3, cont3+"");
            mIntent.putExtra(AppConstants.text_cont4, cont4+"");
            mIntent.putExtra(AppConstants.text_cont5, cont5+"");
            mIntent.putExtra(AppConstants.text_cont6, cont6+"");
            mIntent.putExtra(AppConstants.text_cont7, cont7+"");
            mIntent.putExtra(AppConstants.text_cont8, cont8+"");
            mIntent.putExtra(AppConstants.text_cont9, cont9+"");
            mIntent.putExtra(AppConstants.text_contTotal, cont_total+"");
            startActivity(mIntent);
        });


    }
}
