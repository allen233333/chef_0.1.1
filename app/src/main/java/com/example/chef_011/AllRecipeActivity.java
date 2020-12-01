package com.example.chef_011;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;


import java.util.ArrayList;

public class AllRecipeActivity extends AppCompatActivity{


    private RecyclerView recipesRecView;
    private RecipesRecViewAdapter adapter;
    private Button addRecipe;
    ArrayAdapter <String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_recipe);

        ListView listView = findViewById(R.id.my_list);

        adapter = new RecipesRecViewAdapter(this);

        recipesRecView = findViewById(R.id.recipesRecView);

        recipesRecView.setAdapter(adapter);
        recipesRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Recipe> recipes = new ArrayList<>();

        addRecipe = findViewById(R.id.add_new_recipe);
        addRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllRecipeActivity.this, RecipeActivity.class);
                startActivity(intent);
            }
        });


        Utils.getInstance();
        adapter.setRecipes(Utils.getAllrecipes());

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, recipes);
        listView.setAdapter(arrayAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search Here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}