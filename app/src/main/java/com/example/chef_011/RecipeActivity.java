package com.example.chef_011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RecipeActivity extends AppCompatActivity {

    private static final String RECIPE_ID_KEY = "recipeId";
    private TextView txtName, txtIngredient, txtDescription, txtPrepTime;
    private ImageView recipeImage;
    private Button Inst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        txtName = findViewById(R.id.txtName);
        txtIngredient = findViewById(R.id.txtingredient);
        txtDescription = findViewById(R.id.txtDescrip);
        txtPrepTime = findViewById(R.id.textPreptime);
        recipeImage = findViewById(R.id.imgRecipe);
        Inst=findViewById(R.id.instructions);

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
        Inst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoURL(recipe.getInstructionsUrl());;
            }
        });

        Glide.with(this)
                .asBitmap().load(recipe.getImageUrl())
                .into(recipeImage);
    }


private void gotoURL(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

}


}