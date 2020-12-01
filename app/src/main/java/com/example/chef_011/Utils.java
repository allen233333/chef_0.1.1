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
        allrecipes.add(new Recipe("FriedChicken", "crackers, flour, potato flakes, salt, black pepper, chicken breast, egg", "https://cdn.cnn.com/cnnnext/dam/assets/190123071624-fried-chicken-stock-super-tease.jpg" ));
        allrecipes.add(new Recipe("FriedRice", "Rice, Carrot, Onion, Beens, Corns", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));

    }

    public static ArrayList<Recipe> getAllrecipes() {
        return allrecipes;
    }

    public boolean addToList (Recipe recipe)
    {
        return allrecipes.add(recipe);
    }

    public boolean removeFromList (Recipe recipe)
    {
        return allrecipes.remove(recipe);
    }

}
