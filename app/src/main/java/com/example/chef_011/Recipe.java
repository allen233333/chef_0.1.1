package com.example.chef_011;

public class Recipe {
    private String name;
    private String ingredient;
    private String ImageUrl;
    private boolean isExpanded;

    public Recipe(String name, String ingredient, String ImageUrl){
        this.name = name;
        this.ingredient = ingredient;
        this.ImageUrl = ImageUrl;
        isExpanded = false;
    }

    public boolean isExpanded()
    {
        return isExpanded;
    }

    public void setExpanded(boolean isExpanded)
    {
        this.isExpanded = isExpanded;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setIngredient(String ingredient)
    {
        this.ingredient = ingredient;
    }

    public String getIngredient()
    {
        return ingredient;
    }

    public String getImageUrl()
    {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl)
    {
        this.ImageUrl = ImageUrl;
    }


}
