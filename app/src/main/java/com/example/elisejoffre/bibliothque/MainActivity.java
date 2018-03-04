package com.example.elisejoffre.bibliothque;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Livre MonLivre=null;
    TextView monTexte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monTexte=findViewById(R.id.texte);

        if(savedInstanceState==null){
            MonLivre = new Livre("Astérix et Obélix","Uderzo",30);
            monTexte.setText(MonLivre.toString());

        }else{
            monTexte.setText("Bien enregistre");
        }


    }
}