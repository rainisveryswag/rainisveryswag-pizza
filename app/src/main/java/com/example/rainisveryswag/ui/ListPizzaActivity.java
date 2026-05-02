package com.example.rainisveryswag.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.rainisveryswag.R;
import com.example.rainisveryswag.adapter.CustomPizzaAdapter;
import com.example.rainisveryswag.services.PizzaProvider;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        // Titre personnalisé dans la barre d'action
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("rainisveryswag Menu");
        }

        ListView listView = findViewById(R.id.lvPizzas);

        // Utilisation de notre manager personnalisé
        PizzaProvider manager = PizzaProvider.getManager();

        CustomPizzaAdapter adapter = new CustomPizzaAdapter(this, manager.findAll());
        listView.setAdapter(adapter);

        // Gestion du clic pour voir les détails
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(ListPizzaActivity.this, PizzaDetailActivity.class);
            // On passe l'UID de la pizza sélectionnée
            intent.putExtra("PIZZA_ID", id);
            startActivity(intent);
        });
    }
}