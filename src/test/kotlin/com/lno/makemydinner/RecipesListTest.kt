package com.lno.makemydinner

import Menu
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RecipesListTest {

    @Test
    @DisplayName("Given the number of recipes in the menu, createMenu should return a menu with the same number of recipes")
    fun createMenu_shouldCreateAMenu() {
        val recipes = getRecipes()
        val recipesList = RecipesList(recipes)
        val expectedNumberOfRecipes = 5

        val menu: Menu = recipesList.createMenu(expectedNumberOfRecipes)

        assertThat(menu.hasNumberOfRecipes(expectedNumberOfRecipes)).isTrue
    }

    @Test
    @DisplayName("Given a number of recipes higher than number of recipes in the list, createMenu should return an empty menu")
    fun createMenu_shouldReturnAnEmptyMenu() {
        val recipes = getRecipes()
        val recipesList = RecipesList(recipes)
        val expectedNumberOfRecipes = recipes.size + 2

        val menu: Menu = recipesList.createMenu(expectedNumberOfRecipes)

        assertThat(menu.isEmpty()).isTrue
    }

    private fun getRecipes(): List<Recipe> {
        val ingredientsForPastaCarbonara = listOf(
            Ingredient("egg"),
            Ingredient("linguine"),
            Ingredient("parmigiano"),
            Ingredient("pepper"),
        )
        val ingredientsForPastaAlAmatriciana = listOf(
            Ingredient("tomatoe"),
            Ingredient("linguine"),
            Ingredient("wine"),
            Ingredient("bacon bites"),
            Ingredient("pepper"),
        )
        val ingredientsForChickenSaute = listOf(
            Ingredient("chicken"),
            Ingredient("soy sauce"),
            Ingredient("carrots"),
            Ingredient("rice"),
            Ingredient("garlic"),
        )
        val ingredientsForVeganBurger = listOf(
            Ingredient("chicken"),
            Ingredient("soy sauce"),
            Ingredient("carrots"),
            Ingredient("rice"),
            Ingredient("garlic"),
        )
        val ingredientsForVeganBolognaise = listOf(
            Ingredient("lentils"),
            Ingredient("soy sauce"),
            Ingredient("carrots"),
            Ingredient("mushrooms"),
            Ingredient("tomatoe sauce"),
        )
        val ingredientsForChickenFajitas = listOf(
            Ingredient("chicken"),
            Ingredient("fajitas spices"),
            Ingredient("pepper"),
            Ingredient("tomatoe"),
            Ingredient("avocado"),
        )
        val ingredientsForThaiRice = listOf(
            Ingredient("chili pepper"),
            Ingredient("onion"),
            Ingredient("bacon bites"),
            Ingredient("rice"),
        )
        return listOf(
            Recipe("Pasta Carbonara", ingredientsForPastaCarbonara),
            Recipe("Pasta Al Amatriciana", ingredientsForPastaAlAmatriciana),
            Recipe("Chicken Saute", ingredientsForChickenSaute),
            Recipe("Vegan Bolognaise", ingredientsForVeganBolognaise),
            Recipe("Vegan Burger", ingredientsForVeganBurger),
            Recipe("Chicken Fajitas", ingredientsForChickenFajitas),
            Recipe("Thaï rice", ingredientsForThaiRice),
        )
    }
}