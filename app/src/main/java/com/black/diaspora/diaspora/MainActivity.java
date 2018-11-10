package com.black.diaspora.diaspora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.black.diaspora.diaspora.Views.Login;

public class MainActivity extends AppCompatActivity {
    private ImageView splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splash = (ImageView) findViewById(R.id.splashCreen);

        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen = new Intent(getApplicationContext(), Login.class);
                startActivity(loginScreen);
            }
        });
    }

    //TODO load user token here


    //TODO load any useful resource for the app in this splash screen


}
