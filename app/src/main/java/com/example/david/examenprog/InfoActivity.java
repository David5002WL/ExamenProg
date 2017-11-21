package com.example.david.examenprog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        EditText nombre =(EditText) findViewById(R.id.editText);
        EditText edad =(EditText) findViewById(R.id.editText2);


        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoNombre=(String)extras.get("datoNombre");//Obtengo el nombre
            String datoEdad=(String)extras.get("datoEdad");


            nombre.setText(datoNombre);
            edad.setText(datoEdad);

        }
    }
}
