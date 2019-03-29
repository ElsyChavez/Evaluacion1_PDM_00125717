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
        String productosmostrados = bundle.getString(AppConstants.text_contTotal);
        text_total.setText(productosmostrados);

        String producto1 = bundle.getString(AppConstants.text_cont1);
        pro1.setText(producto1);
        String producto2 = bundle.getString(AppConstants.text_cont2);
        pro1.setText(producto2;
        String producto3 = bundle.getString(AppConstants.text_cont3);
        pro1.setText(producto3);
        String producto4 = bundle.getString(AppConstants.text_cont4);
        pro1.setText(producto4);
        String producto5 = bundle.getString(AppConstants.text_cont5);
        pro1.setText(producto5);
        String producto6 = bundle.getString(AppConstants.text_cont6);
        pro1.setText(producto6);
        String producto7 = bundle.getString(AppConstants.text_cont7);
        pro1.setText(producto7);
        String producto8 = bundle.getString(AppConstants.text_cont8);
        pro1.setText(producto8);
        String producto9 = bundle.getString(AppConstants.text_cont9);
        pro1.setText(producto9);

        String conjunto_datos = "Usuario: " + usuariomostrado + " Email: " + emailmostrado + " Productos en total: " + productosmostrados
                +" Producto1: " + producto1
                +" Producto2: " + producto2
                +" Producto3: " + producto3
                +" Producto4: " + producto4
                +" Producto5: " + producto5
                +" Producto6: " + producto6
                +" Producto7: " + producto7
                +" Producto8: " + producto8
                +" Producto9: " + producto9;

        boton_share.setOnClickListener(v->{
            Intent mIntent=new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, conjunto_datos);
            startActivity(mIntent);
        });

    }
}
