# chef_0.1.1
**App name**: Chefs++

**Platform:** Android

**Creators:** Ivan Barcenes, Issam Haddad, Elisa Cordeiro Lopes and Xinyu Liu.

**Language:** Java




**Description and Usage:

How much time do you spend looking at the ingredients in your fridge and thinking of a recipe that would include all of them. Well we can save you some time: Cheddar Cheese does not go on Apple Pie. That's why the Chefs++ app is here to help!
Because of the Coronavirus Pandemic, people are cooking at home more than ever. If you are not able to decide what to cook, simply enter the ingredients you wish to use, and the application is going to generate a list of recipe you can use. Tap on the recipe you wish to cook. Finally, click on the "Instructions" button at the bottom of the page to access a website with all of the information you need to know.



**RecipesRecViewAdapter:** An adapter class to show a card view of a recipe. Using the function onBindViewHolder to create a cardview of a single recipe. In this                              class, we use the function setOnClickListener to get to the detail page of this recipe when the user clicks on this recipe by calling a                              function getRecipeId to get the id of this recipe and direct to the detailed page for this recipe, and we use isExanped function  whichis                           inside the Recipe class to check if the cardview is expanded, if no the adapter will only show the name and the image of this recipe yes,                            it will also show the ingredient of this recipe. And we also have a ViewHolder class which controls the up arrow, down arrow and a                                  delete button to remove this recipe from all recipes. 

**AllRecipeActivity:**  An activity class to show the cardview for all recipes and get text from the search bar. In private function filter to parse the input text                         into ingredients and generate a new arraylist that contains only the matched cardview of specific recipe. The GUI is defined in this file. 


**Recipe:** A basic class of single recipe, which holds all elements of the recipe, such as name and preparation  time.  It also has  a boolean function isExpanded             tocheck if the cardview of the recipe is showing the ingredients or not.



**RecipeActivity:** An activity class to show the detailed information of a specific recipe if the user clicks it. There is also a button which takes the user to a                      website with recipe instructions. This button was added after receiving the in class demo feedback.


**Utils:** An upper class of all recipes. This class will create an arraylist to store all recipes, and also initialize the recipe data. This contains all functions            of the arraylist. The function removeFromList removes a single recipe from this arraylist. The function getRecipeById can get a single recipe by the                element‘id’ of this recipe. 




**Library included:** "github.bumptech.glide:glide:4.11.0"
