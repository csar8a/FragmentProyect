package com.ingwilson.fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    String contenido;
    String de;
    String asunto;
    TextView mitext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        Bundle extras = getIntent().getExtras();
        contenido = extras.getString("texto");
        de = extras.getString("de");
        asunto = extras.getString("asunto");
        mitext= findViewById(R.id.TxtDetalle);
        mitext.setText("De:"+de+" asunto:"+asunto+" contenido: "+contenido);
    }
}
