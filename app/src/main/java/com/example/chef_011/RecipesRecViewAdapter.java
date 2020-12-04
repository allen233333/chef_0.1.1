package com.example.chef_011;

import android.content.Context;
import android.content.Intent;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class RecipesRecViewAdapter extends RecyclerView.Adapter<RecipesRecViewAdapter.ViewHolder> {
    private ArrayList<Recipe> recipes = new ArrayList<>();
    private Context mContext;

    public RecipesRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_recipe, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: Called");
        holder.txtName.setText(recipes.get(position).getName());
        Glide.with(mContext)
                .asBitmap()
                .load(recipes.get(position).getImageUrl())
                .into(holder.imgRecipe);

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RecipeActivity.class);
                intent.putExtra("recipeId", recipes.get(position).getRecipeId());
                mContext.startActivity(intent);
            }
        });


        holder.txtRecipe.setText(recipes.get(position).getIngredient());

        if(recipes.get(position).isExpanded())
        {
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelLayout.setVisibility(View.VISIBLE);
            holder.downArrow.setVisibility(View.GONE);
            holder.btnDelete.setVisibility(View.VISIBLE);
            holder.btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(Utils.getInstance().removeFromList(recipes.get(position))){
                        Toast.makeText(mContext,  "Recipe removed", Toast.LENGTH_SHORT).show();
                        notifyDataSetChanged();
                    }else{
                        Toast.makeText(mContext, "Please try again", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else{
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelLayout.setVisibility(View.GONE);
            holder.downArrow.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public void setRecipes(ArrayList<Recipe> recipes)
    {
        this.recipes = recipes;
        notifyDataSetChanged();
    }

    public void filteredList(ArrayList<Recipe> filterList) {
        recipes = filterList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private ImageView imgRecipe;
        private TextView txtName;

        private ImageView downArrow, upArrow;
        private RelativeLayout expandedRelLayout;
        private TextView txtRecipe;
        private TextView btnDelete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgRecipe = itemView.findViewById(R.id.imgRecipe);
            txtName = itemView.findViewById(R.id.txtRecipe);

            downArrow = itemView.findViewById(R.id.btnDownArrow);
            upArrow = itemView.findViewById(R.id.btnUpArrow);
            expandedRelLayout = itemView.findViewById(R.id.expandedRelLayout);
            txtRecipe = itemView.findViewById(R.id.ingredientText);
            btnDelete = itemView.findViewById(R.id.btnDelete);

            downArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Recipe recipe = recipes.get(getAdapterPosition());
                    recipe.setExpanded(!recipe.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            upArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Recipe recipe = recipes.get(getAdapterPosition());
                    recipe.setExpanded(!recipe.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
