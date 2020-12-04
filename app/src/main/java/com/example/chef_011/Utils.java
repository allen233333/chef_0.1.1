package com.example.chef_011;

import java.util.ArrayList;

public class Utils {
    private static Utils instance;
    private static ArrayList<Recipe> allrecipes;

    private Utils(){
        if(null == allrecipes){
            allrecipes = new ArrayList<>();
            initData();
        }

    }

    public static Utils getInstance()
    {
        if(null != instance){
            return instance;
        } else
        {
            instance = new Utils();
            return instance;
        }

    }

    private void initData()
    {

        allrecipes.add(new Recipe(1,"FriedChicken","crackers, flour, potato flakes, salt, black pepper, chicken breast, egg","https://cdn.cnn.com/cnnnext/dam/assets/190123071624-fried-chicken-stock-super-tease.jpg"));
        allrecipes.add(new Recipe(2,"FriedRice", "Rice, Carrot, Onion, Beens, Corns", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));
        allrecipes.add(new Recipe(3,"FriedRice", "Rice, Carrot, Onion, Beens, Corns", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));
        allrecipes.add(new Recipe(4,"FriedRice", "Rice, Carrot, Onion, Beens, Corns", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));
        allrecipes.add(new Recipe(5,"FriedRice", "Rice, Carrot, Onion, Beens, Corns", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));
        allrecipes.add(new Recipe(6,"FriedRice", "Rice, Carrot, Onion, Beens, Corns", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));
        allrecipes.add(new Recipe(7,"FriedRice", "Rice, Carrot, Onion, Beens, Corns", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));

    }

    public static ArrayList<Recipe> getAllrecipes() {
        return allrecipes;
    }

    public boolean removeFromList (Recipe recipe)
    {
        return allrecipes.remove(recipe);
    }

    public Recipe getRecipebyId(int id){
        for (Recipe r:allrecipes){
            if(r.getRecipeId() == id)
            {
                return r;
            }
        }

        return null;
    }

}
