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
                "Flour, Sugar, Salt, Butter, Egg, Lemon, Apple, Cinnamon, Nutmeg, Cornstarch",
                "https://i.ytimg.com/vi/RoHWiA6pogg/maxresdefault.jpg",
                "Dessert"));
        allrecipes.add(new Recipe(2,"45 Minutes","Beef Stew",
                "Beef, Garlic, Salt, Black Pepper, Zucchini, Broth, Carrot, Cabbage, Cilantro, Onion, Corn",
                "https://www.isabeleats.com/wp-content/uploads/2018/09/caldo-de-res-small-5-500x375.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(3,"45 Minutes","Clam Chowder",
                "Clams, , Salt, Black Pepper, Potato, Cream, Onion",
                "https://honest-food.net/wp-content/uploads/2012/05/maine-clam-chowder-500x375.jpg",
                "Snack"));
        allrecipes.add(new Recipe(4,"35 Minutes","FriedChicken",
                "Crackers, Flour, Potato Flakes, Salt, Black Pepper, Chicken Breast, Egg",
                "https://cdn.cnn.com/cnnnext/dam/assets/190123071624-fried-chicken-stock-super-tease.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(5,"20 Minutes","FriedRice",
                "Rice, Carrot, Onion, Beans, Corn, Oil, Egg",
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
                "Beef, Buns, Lettuce, Onion, Pickles, Tomato, Cheese, Ketchup, Mustard",
                "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2004/2/25/0/bw2b07_hambugers1.jpg.rend.hgtvcom.616.462.suffix/1558017418187.jpeg",
                "Dinner"));
        allrecipes.add(new Recipe(9, "20 Minutes", "Lobster Roll",
                "Lobster, Bun, Butter, Mayonnaise, Butter, Dill",
                "https://www.simplyrecipes.com/wp-content/uploads/2020/07/New-England-Lobster-Rolls-LEAD-3c.jpg",
                "Lunch"));
        allrecipes.add(new Recipe(10,"40 Minutes","Mac & Cheese",
                "Macaroni, Butter, Oil, Milk, Cheddar, Bread Crumbs",
                "https://i.ytimg.com/vi/z7V5PoAgmt0/maxresdefault.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(11,"35 Minutes","Mashed Potatoes",
                "Potato, Heavy Cream, Butter, Thyme, Salt, Pepper",
                "https://assets.marthastewart.com/styles/wmax-750/d30/garlic-mashed-potatoes-a101006/garlic-mashed-potatoes-a101006_horiz.jpg?itok=veOwxEQD",
                "Dinner"));
        allrecipes.add(new Recipe(12,"10 Minutes","Oatmeal",
                "Oats, Milk, Sugar, Berries, Banana, Cinamon, Chia Seeds",
                "https://pickyeaterblog.com/wp-content/uploads/2010/11/Anjali_PumpkinPieOatmeal12.jpg",
                "Breakfast"));
        allrecipes.add(new Recipe(13,"15 Minutes","Omelette",
                "Egg, Butter, Spinach, Mushroom, Provalon, Salt",
                "https://www.thechunkychef.com/wp-content/uploads/2017/11/Cheesy-Mushroom-Spinach-Omelet-feat.jpg",
                "Breakfast"));
        allrecipes.add(new Recipe(14,"20 Minutes","Pancakes",
                "Flour, Baking Powder, Salt, Sugar, Milk, Egg, Butter, Syrup",
                "https://recipesbycarina.com/wp-content/uploads/2020/09/Pancake-Recipe.jpg",
                "Breakfast"));
        allrecipes.add(new Recipe(15,"50 Minutes","Quiche",
                "Pie Crust, Egg, Milk, Salt, Black Pepper, Cooked Ham, Shredded Cheese, Green Onions",
                "https://www.seasonsandsuppers.ca/wp-content/uploads/2019/03/classic-quiche-lorraine-A.jpg",
                "Breakfast"));
        allrecipes.add(new Recipe(16,"2 Hours","Ravioli",
                "Flour, Salt, Olive Oil, Egg, Ricotta Cheese, Cream Cheese, Mozzarella, Garlic, Heavy cream, Marinara, Basil",
                "https://saltsugarspice.com/wp-content/uploads/2020/04/20200329_173329-1.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(17,"2 Hours","Roast Beef",
                "Olive oil, Round Roast, Garlic, Rosemary, Thyme, Salt, Black Pepper",
                "https://challengedairy.com/sites/default/files/recipe/images/recipe_roast_beef_with_tangy_mustard_sauce_2280.jpg",
                "Dinner"));
        allrecipes.add(new Recipe(18,"20 Minutes","Salmon",
                "Honey, Soy Sauce, Lemon Juice, Red Pepper Flakes, Olive Oil, Salmon Fillets, Salt, Black Pepper, Garlic, Lemon",
                "https://hips.hearstapps.com/delish/assets/17/39/1506456157-delish-honey-garlic-glazed-salmon-1.jpg",
                "Lunch"));
        allrecipes.add(new Recipe(19,"30 Minutes","Tacos",
                "Olive Oil, Ground Beef, Onion Powder, Salt, Pepper, Tortilla, Sour Cream, Tomato, Shredded Cheese",
                "https://www.missionfoods.com/uploads/Ground-Beef-Soft-Taco.jpg",
                "Lunch"));
        allrecipes.add(new Recipe(20,"2 Hours 30 Minutes","Ukrainian Rolls",
                "Flower,Water, Honey, Vegetable Oil, Salt, Lemon Juice, Traditional Yeast, Egg Yolk, Garlic, Salt",
                "https://i0.wp.com/tarasmulticulturaltable.com/wp-content/uploads/2018/10/Pampushky-Ukrainian-Garlic-Bread-4-of-5.jpg?resize=720%2C479&ssl=1",
                "Breakfast"));

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
