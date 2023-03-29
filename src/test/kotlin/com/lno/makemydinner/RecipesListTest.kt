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
        val recipes = listOf(
            Recipe("Pasta Carbonara", ingredientsForPastaCarbonara),
            Recipe("Pasta Al Amatriciana", ingredientsForPastaAlAmatriciana),
            Recipe("Chicken Saute", ingredientsForChickenSaute),
            Recipe("Vegan Bolognaise", ingredientsForVeganBolognaise),
            Recipe("Vegan Burger", ingredientsForVeganBurger),
            Recipe("Chicken Fajitas", ingredientsForChickenFajitas),
            Recipe("Thaï rice", ingredientsForThaiRice),
        )
        val recipesList = RecipesList(recipes)
        val expectedNumberOfRecipes = 5

        val menu: Menu = recipesList.createMenu(expectedNumberOfRecipes)

        assertThat(menu.hasNumberOfRecipes(expectedNumberOfRecipes)).isTrue
    }
}