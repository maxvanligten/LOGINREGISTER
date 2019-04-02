package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final EditText etLeeftijd =  (EditText) findViewById(R.id.etLeeftijd);
        final EditText etNaam = (EditText) findViewById(R.id.etNaam);
        final EditText etGebruikersnaam = (EditText) findViewById(R.id.etGebruikersnaam);
        final EditText etWachtwoord = (EditText) findViewById(R.id.etWachtwoord);
        final Button bAanmelden = (Button) findViewById(R.id.bAanmelden);

    }
}
