package com.example.chef_011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    private static final String RECIPE_ID_KEY = "recipeId";
    private TextView txtname, txtingredient;
    private ImageView recipeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        txtname = findViewById(R.id.txtname);
        txtingredient = findViewById(R.id.txtingredient);
        recipeImage = findViewById(R.id.imgRecipe);

        Intent intent = getIntent();

        if(null != intent){
            int recipeId = intent.getIntExtra(RECIPE_ID_KEY, -1 );
            if(recipeId != -1){
                Recipe incomingRecipe = Utils.getInstance().getRecipebyId(recipeId);
                if(null != incomingRecipe){
                    setData(incomingRecipe);
                }
            }
        }

    }

    private void setData(Recipe recipe){
        txtname.setText(recipe.getName());
        txtingredient.setText((recipe.getIngredient()));
        Glide.with(this)
                .asBitmap().load(recipe.getImageUrl())
                .into(recipeImage);
    }




}