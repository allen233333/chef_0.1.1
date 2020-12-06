package com.example.chef_011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RecipeActivity extends AppCompatActivity {

    private static final String RECIPE_ID_KEY = "recipeId";
    private TextView txtName, txtIngredient, txtDescription, txtPrepTime;
    private ImageView recipeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        txtName = findViewById(R.id.txtName);
        txtIngredient = findViewById(R.id.txtingredient);
        txtDescription = findViewById(R.id.txtDescrip);
        txtPrepTime = findViewById(R.id.textPreptime);
        recipeImage = findViewById(R.id.imgRecipe);

        Intent intent = getIntent();

        if(null != intent){
            int recipeId = intent.getIntExtra(RECIPE_ID_KEY, -1 );
            if(recipeId != -1){
                Recipe incomingRecipe = Utils.getInstance().getRecipeById(recipeId);
                if(null != incomingRecipe){
                    setData(incomingRecipe);
                }
            }
        }

    }

    private void setData(Recipe recipe){
        txtName.setText(recipe.getName());
        txtIngredient.setText((recipe.getIngredient()));
        txtPrepTime.setText(recipe.getPrepTime());
        txtDescription.setText(recipe.getDescription());
        Glide.with(this)
                .asBitmap().load(recipe.getImageUrl())
                .into(recipeImage);
    }




}