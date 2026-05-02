package com.example.rainisveryswag.adapter;

import android.view.*;
import android.widget.*;
import com.example.rainisveryswag.R;
import com.example.rainisveryswag.classes.PizzaEntity;
import java.util.List;

public class CustomPizzaAdapter extends BaseAdapter {
    private List<PizzaEntity> items;
    private LayoutInflater inflater;

    public CustomPizzaAdapter(android.content.Context context, List<PizzaEntity> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }

    @Override public int getCount() { return items.size(); }
    @Override public Object getItem(int i) { return items.get(i); }
    @Override public long getItemId(int i) { return items.get(i).getUid(); }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) view = inflater.inflate(R.layout.item_pizza_card, viewGroup, false);

        ImageView icon = view.findViewById(R.id.pizza_icon);
        TextView title = view.findViewById(R.id.pizza_label);
        TextView info = view.findViewById(R.id.pizza_subtext);

        PizzaEntity p = items.get(i);
        icon.setImageResource(p.getThumbnail());
        title.setText(p.getLabel());
        info.setText(p.getPrepTime() + " | Price: " + p.getCost() + "$");

        return view;
    }
}