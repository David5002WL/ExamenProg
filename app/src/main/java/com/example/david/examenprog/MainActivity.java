package com.example.david.examenprog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();


        Button info =(Button) findViewById(R.id.botonInfo);

        info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=getIntent();
                Bundle extras =intent.getExtras();

                Intent explicit_intent;//Declaro el Intent

                //Instanciamos el Intent dandole:
                // el contexto y la clase a la cual nos deseamos dirigir
                explicit_intent = new Intent(getApplicationContext(),InfoActivity.class);

                String datoNombre=(String)extras.get("nombreyapellidos");
                String datoEdad=(String)extras.get("edad");
                String datoLibros=(String)extras.get("libros");
                String datoRevistas=(String)extras.get("revistas");
                String datoRedes=(String)extras.get("redes");

                explicit_intent.putExtra("datoNombre",datoNombre);//Guardamos una cadena
                explicit_intent.putExtra("datoEdad",datoEdad);
                explicit_intent.putExtra("datoLibros",datoLibros);
                explicit_intent.putExtra("datoRevistas",datoRevistas);
                explicit_intent.putExtra("datoRedes",datoRedes);

                startActivity(explicit_intent);

        }
        });
    }
    }