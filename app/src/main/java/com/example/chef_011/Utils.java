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

        allrecipes.add(new Recipe(1,"2, 1/2 Hours","Apple Pie",
                "Flour, Sugar, Salt, Butter, Egg, Lemon, Apple, Cinamon, Nutmeg",
                "https://i.ytimg.com/vi/RoHWiA6pogg/maxresdefault.jpg",
                "Dessert"));
        allrecipes.add(new Recipe(2,"45 Minutes","Beef Stew",
                "Beef, Garlic, Salt, Black Pepper, Zucchini, Broth, Carrot, Cabbage, Cilantro, Onion, Corn",
                "https://www.isabeleats.com/wp-content/uploads/2018/09/caldo-de-res-small-5-500x375.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(3,"45 Minutes","Clam Chowder",
                "Clams, , Salt, Black Pepper, Potato, Cream, Onion",
                "https://letsdishrecipes.com/wp-content/uploads/2018/12/Clam-Chowder-feature-480x480.jpg",
                "Snack"));
        allrecipes.add(new Recipe(4,"35 Minutes","FriedChicken",
                "Crackers, Flour, Potato Flakes, Salt, Black pepper, Chicken breast, Egg",
                "https://cdn.cnn.com/cnnnext/dam/assets/190123071624-fried-chicken-stock-super-tease.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(5,"20 Minutes","FriedRice",
                "Rice, Carrot, Onion, Beans, Corn, Oil",
                "https://journeyto8.files.wordpress.com/2011/03/chicken-fried-rice.jpg",
                "Lunch"));
        allrecipes.add(new Recipe(6,"1 Hour","Gyro",
                "Pita Bread, Greek Yogurt, Lamb, Feta, Onion, Pepper, Dill",
                "https://www.greekboston.com/wp-content/uploads/2018/07/Traditional-Gyro.jpg",
                "Lunch"));
        allrecipes.add(new Recipe(7,"5 Minutes", "Guacamole",
                "Avacado, Lime, Salt, Onion, Cilantro",
                "https://www.simplyrecipes.com/wp-content/uploads/2018/07/Guacamole-LEAD-2.jpg",
                "Snack"));
        allrecipes.add(new Recipe(8, "15 Minutes", "Hamburger",
                "Beef, Buns, Lettuce, Onion, Cheese, Ketchup, Mustard",
                "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2004/2/25/0/bw2b07_hambugers1.jpg.rend.hgtvcom.616.462.suffix/1558017418187.jpeg",
                "Dinner"));
        allrecipes.add(new Recipe(9, "20 Minutes", "Lobster Roll",
                "Lobster, Bun, Butter, Mayonnaise, Butter, Dill",
                "https://www.simplyrecipes.com/wp-content/uploads/2020/07/New-England-Lobster-Rolls-LEAD-3c.jpg",
                "Lunch"));
        allrecipes.add(new Recipe(10,"40 Minutes","Mac & Cheese",
                "Macaroni, Butter, Oil, Milk, Cheddar, Bread Crumbs",
                "https://www.momontimeout.com/wp-content/uploads/2018/10/homemade-mac-and-cheese-recipe-titled-500x500.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(11,"35 Minutes","Mashed Potatoes",
                "Potato, Heavy Cream, Butter, Thyme, Salt, Pepper",
                "https://www.thespruceeats.com/thmb/aV3a6phN-0r_0hsFnrMb5ezHG1g=/3000x3000/smart/filters:no_upscale()/easy-microwave-mashed-potatoes-3059678_hero-01-520a91abceb44719ae5a24a179af8645.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(12,"10 Minutes","Oatmeal",
                "Oats, Milk, Sugar, Berries, Banana, Cinamon, Chia Seeds",
                "https://fitfoodiefinds.com/wp-content/uploads/2015/10/classic-oatmeal.jpg",
                "Breakfast"));
        allrecipes.add(new Recipe(13,"15 Minutes","Omelette",
                "Egg, Butter, Spinach, Mushroom, Provalon, Salt",
                "https://www.thechunkychef.com/wp-content/uploads/2017/11/Cheesy-Mushroom-Spinach-Omelet-feat.jpg",
                "Breakfast"));
        allrecipes.add(new Recipe(14,"20 Minutes","Pancakes",
                "Flour, Baking Powder, Salt, Sugar, Milk, Egg, Butter, Syrup",
                "https://recipesbycarina.com/wp-content/uploads/2020/09/Pancake-Recipe.jpg",
                "Breakfast"));
        allrecipes.add(new Recipe(15,"2 Hours","Ravioli",
                "Flour, Salt, Olive Oil, Egg, Ricotta Cheese, Cream Cheese, Mozzarella, Garlic, Heavy cream, Marinara, Basil",
                "https://saltsugarspice.com/wp-content/uploads/2020/04/20200329_173329-1.jpg",
                "Dinner"));
    }

    public static ArrayList<Recipe> getAllRecipes() {
        return allrecipes;
    }

    public boolean removeFromList (Recipe recipe)
    {
        return allrecipes.remove(recipe);
    }

    public Recipe getRecipeById(int id){
        for (Recipe r:allrecipes){
            if(r.getRecipeId() == id)
            {
                return r;
            }
        }

        return null;
    }

}
