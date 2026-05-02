package com.example.rainisveryswag;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.rainisveryswag.ui.SplashActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Redirection immédiate vers le Splash Screen si l'app arrive ici par erreur
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
        finish();
    }
}