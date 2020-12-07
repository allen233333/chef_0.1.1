package com.example.chef_011;

public class Recipe {
    private int RecipeId;
    private String prepTime;
    private String name;
    private String ingredient;
    private String ImageUrl;
    private String InstructionsUrl;
    private String Description;
    private boolean isExpanded;

    public Recipe(int RecipeId, String prepTime, String name, String ingredient,
                  String ImageUrl, String Description, String InstructionsUrl){
        this.RecipeId = RecipeId;
        this.prepTime = prepTime;
        this.name = name;
        this.ingredient = ingredient;
        this.ImageUrl = ImageUrl;
        this.InstructionsUrl=InstructionsUrl;
        this.Description = Description;
        isExpanded = false;
    }

    public int getRecipeId() {
        return RecipeId;
    }

    public void setRecipeId(int recipeId) {
        RecipeId = recipeId;
    }

    public String getPrepTime() { return prepTime; }

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

    public String getDescription() {return Description; }

    public String getImageUrl()
    {
        return ImageUrl;
    }
    public String getInstructionsUrl() {return InstructionsUrl;}

    public void setImageUrl(String ImageUrl)
    {
        this.ImageUrl = ImageUrl;
    }


}
