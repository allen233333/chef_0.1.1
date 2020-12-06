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

        allrecipes.add(new Recipe(1,"Apple Pie", "Flour, Sugar, Salt, Butter, Egg, Lemon, Apple, Cinamon, Nutmeg", "https://i.ytimg.com/vi/RoHWiA6pogg/maxresdefault.jpg"));
        allrecipes.add(new Recipe(2,"Beef Stew", "Beef, Garlic, Salt, Black Pepper, Zucchini, Broth, Carrot, Cabbage, Cilantro, Onion, Corn", "https://www.isabeleats.com/wp-content/uploads/2018/09/caldo-de-res-small-5-500x375.jpg"));
        allrecipes.add(new Recipe(3,"Clam Chowder", "Clams, , Salt, Black Pepper, Potato, Cream, Onion", "https://letsdishrecipes.com/wp-content/uploads/2018/12/Clam-Chowder-feature-480x480.jpg"));
        allrecipes.add(new Recipe(4,"FriedChicken","Crackers, Flour, Potato Flakes, Salt, Black pepper, Chicken breast, Egg","https://cdn.cnn.com/cnnnext/dam/assets/190123071624-fried-chicken-stock-super-tease.jpg"));
        allrecipes.add(new Recipe(5,"FriedRice", "Rice, Carrot, Onion, Beans, Corn", "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg"));
        allrecipes.add(new Recipe(6,"Gyro", "Pita Bread, Greek Yogurt, Lamb, Feta, Onion, Pepper, Dill", "https://www.greekboston.com/wp-content/uploads/2018/07/Traditional-Gyro.jpg"));
        allrecipes.add(new Recipe(7,"Mac & Cheese", "Macaroni, Butter, Oil, Milk, Cheddar, Bread Crumbs", "https://www.momontimeout.com/wp-content/uploads/2018/10/homemade-mac-and-cheese-recipe-titled-500x500.jpg"));
        allrecipes.add(new Recipe(8,"Mashed Potatoes", "Potato, Heavy Cream, Butter, Thyme, Salt, Pepper", "https://www.thespruceeats.com/thmb/aV3a6phN-0r_0hsFnrMb5ezHG1g=/3000x3000/smart/filters:no_upscale()/easy-microwave-mashed-potatoes-3059678_hero-01-520a91abceb44719ae5a24a179af8645.jpg"));
        allrecipes.add(new Recipe(9,"Oatmeal", "Oats, Milk, Sugar, Berries, Banana, Cinamon, Chia Seeds", "https://fitfoodiefinds.com/wp-content/uploads/2015/10/classic-oatmeal.jpg"));
        allrecipes.add(new Recipe(10,"Omelette", "Egg, Butter, Spinach, Mushroom, Provalon, Salt", "https://www.thechunkychef.com/wp-content/uploads/2017/11/Cheesy-Mushroom-Spinach-Omelet-feat.jpg"));
        allrecipes.add(new Recipe(11,"Pancakes", "Flour, Baking Powder, Salt, Sugar, Milk, Egg, Butter, Syrup", "https://recipesbycarina.com/wp-content/uploads/2020/09/Pancake-Recipe.jpg"));

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
