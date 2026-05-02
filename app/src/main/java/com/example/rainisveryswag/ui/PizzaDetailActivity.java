package com.example.rainisveryswag.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.rainisveryswag.R;
import com.example.rainisveryswag.classes.PizzaEntity;
import com.example.rainisveryswag.services.PizzaProvider;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Récupération de l'ID envoyé
        long pizzaId = getIntent().getLongExtra("PIZZA_ID", -1);
        PizzaEntity pizza = PizzaProvider.getManager().findById(pizzaId);

        // Liaison avec les vues (IDs mis à jour pour correspondre au layout XML)
        ImageView img = findViewById(R.id.detail_image);
        TextView name = findViewById(R.id.detail_name);
        TextView specs = findViewById(R.id.detail_specs);
        TextView ingredients = findViewById(R.id.detail_ingredients);
        TextView description = findViewById(R.id.detail_description);
        TextView steps = findViewById(R.id.detail_steps);

        if (pizza != null) {
            img.setImageResource(pizza.getThumbnail());
            name.setText(pizza.getLabel());
            specs.setText(pizza.getPrepTime() + " • Cost: " + pizza.getCost() + "€");
            ingredients.setText(pizza.getComponents());
            description.setText(pizza.getSummary());
            steps.setText(pizza.getInstructions());

            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(pizza.getLabel());
                getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Bouton retour
            }
        }
    }

    // Permet au bouton retour de la barre d'action de fonctionner
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}