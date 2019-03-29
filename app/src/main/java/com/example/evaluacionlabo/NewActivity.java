package com.example.evaluacionlabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaluacionlabo.utils.AppConstants;

public class NewActivity extends AppCompatActivity {

    TextView text_usuario, text_email, text_total, pro1, pro2, pro3, pro4, pro5, pro6, pro7, pro8, pro9;
    Button boton_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        text_usuario = findViewById(R.id.espacio_usuario);
        text_email = findViewById(R.id.espacio_correo);
        text_total = findViewById(R.id.espacio_productos);
        boton_share = findViewById(R.id.boton_share);
        pro1 = findViewById(R.id.espacio1);
        pro2 = findViewById(R.id.espacio2);
        pro3 = findViewById(R.id.espacio3);
        pro4 = findViewById(R.id.espacio4);
        pro5 = findViewById(R.id.espacio5);
        pro6 = findViewById(R.id.espacio6);
        pro7 = findViewById(R.id.espacio7);
        pro8 = findViewById(R.id.espacio8);
        pro9 = findViewById(R.id.espacio9);

        Bundle bundle = getIntent().getExtras();

        String usuariomostrado = bundle.getString(AppConstants.TEXT_KEY1);
        text_usuario.setText(usuariomostrado);
        String emailmostrado = bundle.getString(AppConstants.TEXT_KEY2);
        text_email.setText(emailmostrado);

        String conjunto_datos = "Usuario: " + usuariomostrado + "Email: " + emailmostrado;

        boton_share.setOnClickListener(v->{
            Intent mIntent=new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, conjunto_datos);
            startActivity(mIntent);
        });

    }
}
