package com.example.rainisveryswag.services;

import com.example.rainisveryswag.classes.PizzaEntity;
import com.example.rainisveryswag.R;
import com.example.rainisveryswag.classes.PizzaEntity;
import com.example.rainisveryswag.dao.IDao;
import java.util.ArrayList;
import java.util.List;

public class PizzaProvider implements IDao<PizzaEntity> {
    private List<PizzaEntity> pizzaStore;
    private static PizzaProvider instance;

    private PizzaProvider() {
        pizzaStore = new ArrayList<>();
        populate();
    }

    public static synchronized PizzaProvider getManager() {
        if (instance == null) instance = new PizzaProvider();
        return instance;
    }

    private void populate() {
        pizzaStore.add(new PizzaEntity("ROYAL BLUE MARGHERITA", 2, R.drawable.pizza1, "25 min",
                "- 2 cups 00 flour\n- 1 cup San Marzano tomatoes\n- 200g fresh mozzarella\n- fresh basil\n- extra virgin olive oil",
                "Our signature twist on the Italian classic — hand-stretched dough, rich tomato, and the freshest mozzarella.",
                "STEP 1: Stretch dough by hand into a 12-inch circle.\nSTEP 2: Spread crushed tomatoes evenly.\nSTEP 3: Tear mozzarella and scatter on top.\nSTEP 4: Bake at 475° for 10-12 mins.\nSTEP 5: Finish with fresh basil and olive oil."));

        pizzaStore.add(new PizzaEntity("GOLDEN TRUFFLE MUSHROOM", 4, R.drawable.pizza2, "35 min",
                "- 300g mixed wild mushrooms\n- 2 tbsp truffle oil\n- 1/2 cup crème fraîche\n- 100g gruyère\n- fresh thyme",
                "A luxurious combination of earthy wild mushrooms drizzled with aromatic truffle oil on a creamy base.",
                "STEP 1: Sauté mushrooms in butter until golden.\nSTEP 2: Spread crème fraîche over dough.\nSTEP 3: Layer mushrooms and gruyère.\nSTEP 4: Bake at 460° for 12-14 mins.\nSTEP 5: Drizzle truffle oil before serving."));

        pizzaStore.add(new PizzaEntity("RAINI SIGNATURE SUPREME", 5, R.drawable.pizza3, "40 min",
                "- pepperoni\n- Italian sausage\n- red & green peppers\n- black olives\n- red onion\n- 3-cheese blend",
                "The ultimate pizza loaded with premium toppings — our most popular creation since day one.",
                "STEP 1: Spread tomato sauce on stretched dough.\nSTEP 2: Layer cheese blend evenly.\nSTEP 3: Add all toppings generously.\nSTEP 4: Bake at 450° for 15-18 mins until crust is golden."));

        pizzaStore.add(new PizzaEntity("SPICY HONEY PEPPERONI", 3, R.drawable.pizza4, "30 min",
                "- thick-cut pepperoni\n- chili flakes\n- raw honey\n- fresh mozzarella\n- tomato base",
                "The perfect sweet-heat balance. Crispy pepperoni cups filled with honey — bold and unforgettable.",
                "STEP 1: Layer tomato sauce and mozzarella.\nSTEP 2: Add pepperoni slices.\nSTEP 3: Sprinkle chili flakes.\nSTEP 4: Bake at 450° for 12 mins.\nSTEP 5: Drizzle honey immediately after baking."));

        pizzaStore.add(new PizzaEntity("MEDITERRANEAN VEGGIE", 3, R.drawable.pizza5, "30 min",
                "- roasted zucchini\n- sun-dried tomatoes\n- kalamata olives\n- feta cheese\n- hummus base\n- za'atar",
                "A vibrant vegetarian pizza bursting with Mediterranean flavors and colorful roasted vegetables.",
                "STEP 1: Spread hummus as the base.\nSTEP 2: Layer roasted zucchini and tomatoes.\nSTEP 3: Scatter olives and feta.\nSTEP 4: Bake at 450° for 13 mins.\nSTEP 5: Dust with za'atar before serving."));

        pizzaStore.add(new PizzaEntity("BLUE CHEESE STEAK PIZZA", 5, R.drawable.pizza6, "45 min",
                "- 200g sirloin steak strips\n- blue cheese crumbles\n- caramelized onions\n- arugula\n- balsamic glaze",
                "Tender steak strips meet bold blue cheese on a crispy crust — a sophisticated pizza for true food lovers.",
                "STEP 1: Sear steak strips in cast iron until medium-rare.\nSTEP 2: Caramelize onions slowly for 20 mins.\nSTEP 3: Top dough with onions, steak, and blue cheese.\nSTEP 4: Bake at 460° for 12 mins.\nSTEP 5: Top with arugula and balsamic drizzle."));

        pizzaStore.add(new PizzaEntity("SMOKY BBQ PULLED PORK", 4, R.drawable.pizza7, "35 min",
                "- slow-cooked pulled pork\n- smoky BBQ sauce\n- pickled red onion\n- smoked cheddar\n- coleslaw",
                "Fall-off-the-bone pulled pork meets tangy BBQ sauce on a golden crust — Southern comfort, Italian style.",
                "STEP 1: Spread BBQ sauce generously on dough.\nSTEP 2: Layer smoked cheddar.\nSTEP 3: Add pulled pork and pickled onion.\nSTEP 4: Bake at 450° for 14 mins.\nSTEP 5: Top with cold coleslaw after baking."));

        pizzaStore.add(new PizzaEntity("PROSCIUTTO & FIG", 3, R.drawable.pizza8, "25 min",
                "- thin-sliced prosciutto\n- fresh figs\n- gorgonzola\n- honey\n- rocket leaves\n- walnut pieces",
                "An elegant sweet-savory masterpiece with silky prosciutto, fresh figs, and creamy gorgonzola.",
                "STEP 1: Bake dough with gorgonzola base for 8 mins.\nSTEP 2: Remove and add prosciutto and fig slices.\nSTEP 3: Return to oven for 4 more mins.\nSTEP 4: Finish with honey, rocket, and crushed walnuts."));

        pizzaStore.add(new PizzaEntity("CHICKEN PESTO ROYALE", 3, R.drawable.pizza9, "35 min",
                "- grilled chicken breast\n- homemade basil pesto\n- sun-dried tomatoes\n- fresh mozzarella\n- pine nuts",
                "Herb-rich pesto replaces tomato sauce in this bright, aromatic pizza loaded with grilled chicken.",
                "STEP 1: Grill chicken with olive oil and herbs.\nSTEP 2: Spread pesto generously over dough.\nSTEP 3: Add mozzarella, chicken, and tomatoes.\nSTEP 4: Bake at 450° for 13 mins.\nSTEP 5: Scatter toasted pine nuts on top."));

        pizzaStore.add(new PizzaEntity("FOUR CHEESE GOLD", 4, R.drawable.pizza10, "30 min",
                "- fresh mozzarella\n- aged parmesan\n- gorgonzola\n- smoked scamorza\n- honey drizzle\n- black pepper",
                "A cheese lover's dream — four carefully selected Italian cheeses melted to golden perfection.",
                "STEP 1: Stretch dough to 12 inches.\nSTEP 2: Layer all four cheeses evenly.\nSTEP 3: Crack fresh black pepper generously.\nSTEP 4: Bake at 475° for 11-13 mins until bubbling.\nSTEP 5: Finish with a light honey drizzle."));
    }

    @Override public PizzaEntity create(PizzaEntity p) { pizzaStore.add(p); return p; }
    @Override public List<PizzaEntity> findAll() { return pizzaStore; }
    public PizzaEntity findById(long id) {
        for(PizzaEntity p : pizzaStore) if(p.getUid() == id) return p;
        return null;
    }
    // Complétez update et delete de la même manière si nécessaire
    @Override public PizzaEntity update(PizzaEntity t) { return null; }
    @Override public boolean delete(long id) { return pizzaStore.removeIf(p -> p.getUid() == id); }
}