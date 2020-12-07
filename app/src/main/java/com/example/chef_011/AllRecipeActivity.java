package com.example.chef_011;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;


import java.util.ArrayList;

public class AllRecipeActivity extends AppCompatActivity{


    private RecyclerView recipesRecView;
    private RecipesRecViewAdapter adapter;
    EditText txt_Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_recipe);

        adapter = new RecipesRecViewAdapter(this);

        recipesRecView = findViewById(R.id.recipesRecView);

        recipesRecView.setAdapter(adapter);
        recipesRecView.setLayoutManager(new LinearLayoutManager(this));

        txt_Search = (EditText)findViewById(R.id.txt_searchtext);

        ArrayList<Recipe> recipes = new ArrayList<>();

        Utils.getInstance();
        adapter.setRecipes(Utils.getAllRecipes());

        txt_Search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String text)
    {

        // parse the text string (i.e. "Salt, Sugar"), into each ingredient ("Salt","Sugar")
        String[] ingredients = text.split(", ");
        ArrayList<Recipe> filterList = new ArrayList<>();

        for(Recipe item: Utils.getAllRecipes())
        {
            // check each of the parsed ingredients
            for (String ingredient: ingredients) {
                if (item.getIngredient().toLowerCase().contains(ingredient.toLowerCase())) {
                    if(!(filterList.contains(item)))
                        filterList.add(item);
                }else {
                    filterList.remove(item);
                    break;
                }
            }
        }
        adapter.filteredList(filterList);
    }

}