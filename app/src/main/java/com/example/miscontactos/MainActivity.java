package com.example.miscontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos = new ArrayList<Contacto>();
        contactos.add (new Contacto("Anahi Salggado","44444444", "anahi@gmail.com"));
        contactos.add (new Contacto("Otro Salggado","7787517444", "anahi@gmail.com"));
        contactos.add (new Contacto("Anahi Otro","733224", "anahi@gmail.com"));
        contactos.add (new Contacto("Pablo Franco","7774455", "anahi@gmail.com"));
        contactos.add (new Contacto("Pablo Salggado","788444", "anahi@gmail.com"));
        contactos.add (new Contacto("Anahi Franco", "799444", "anahi@gmail.com"));

        ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contacto contacto:contactos){
        nombresContacto.add(contacto.getNombre());
        }

        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactos));
        )
    }
}