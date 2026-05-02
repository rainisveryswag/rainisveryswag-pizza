package com.example.rainisveryswag.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.rainisveryswag.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Petite animation de fondu pour éviter le plagiat visuel
        ImageView logo = findViewById(R.id.splash_logo);
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(1500);
        logo.startAnimation(fadeIn);

        Thread timer = new Thread(() -> {
            try {
                Thread.sleep(2500); // 2.5 secondes
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                startActivity(intent);
                finish();
            }
        });
        timer.start();
    }
}