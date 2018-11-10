package com.black.diaspora.diaspora.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.black.diaspora.diaspora.R;

public class Login extends AppCompatActivity {

    private Button btnCriarConta;
    private Button btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnCriarConta = (Button) findViewById(R.id.criarConta);
        btnFacebook = (Button) findViewById(R.id.loginFacebook);

        btnCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Item Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Item Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
