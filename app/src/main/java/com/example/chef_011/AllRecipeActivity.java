package com.example.chef_011;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;


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
        adapter.setRecipes(Utils.getAllrecipes());

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
        ArrayList<Recipe> filterList = new ArrayList<>();

        for(Recipe item: Utils.getAllrecipes())
        {
            if(item.getName().toLowerCase().contains(text.toLowerCase()))
            {
                filterList.add(item);
            }
        }
        adapter.filteredList(filterList);
    }

}