package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etGebruikersnaam = (EditText) findViewById(R.id.etGebruikersnaam);
        final EditText etWachtwoord = (EditText) findViewById(R.id.etWachtwoord);
        final Button bInloggen = (Button) findViewById(R.id.bInloggen);
        final TextView Aanmeldlink = (TextView) findViewById(R.id.tvHieraanmelden);

        Aanmeldlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, registerActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }
}
