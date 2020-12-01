package com.example.chef_011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    private TextView textView2;
    private Button btntolist;
    private RecyclerView recipesRecView;
    private RecipesRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        adapter = new RecipesRecViewAdapter(this);


        btntolist = findViewById(R.id.add_new);

        btntolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText new_name = findViewById(R.id.new_name);
                EditText new_ingredient = findViewById(R.id.new_ingredient);
                EditText new_Image = findViewById(R.id.new_image);


                Recipe recipe = new Recipe(new_name.getText().toString(), new_ingredient.getText().toString(),"111");
                if(Utils.getInstance().addToList(recipe))
                {
                    Toast.makeText(RecipeActivity.this, "Recipe Added", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }



}