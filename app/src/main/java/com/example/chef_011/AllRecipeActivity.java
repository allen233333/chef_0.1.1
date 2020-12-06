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

        // string parse the
        ArrayList<Recipe> filterList = new ArrayList<>();

        for(Recipe item: Utils.getAllRecipes())
        {
            if(item.getIngredient().toLowerCase().contains(text.toLowerCase()))
            {
                filterList.add(item);
            }
        }
        adapter.filteredList(filterList);
    }

}