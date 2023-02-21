package com.lno.makemydinner

import Menu
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MenuTest {

    @Test
    fun getGroceriesList_shouldReturnAListOfAllIngredients() {
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
        val recipes = listOf(
            Recipe("Pasta Carbonara", ingredientsForPastaCarbonara),
            Recipe("Pasta Al Amatriciana", ingredientsForPastaAlAmatriciana),
        )
        val menu = Menu(recipes)
        val expectedIngredientList = listOf(
            Ingredient("egg"),
            Ingredient("linguine"),
            Ingredient("parmigiano"),
            Ingredient("pepper"),
            Ingredient("tomatoe"),
            Ingredient("linguine"),
            Ingredient("wine"),
            Ingredient("bacon bites"),
            Ingredient("pepper")
        )

        val groceriesList = menu.getGroceriesList()

        assertThat(groceriesList).isEqualTo(expectedIngredientList)
    }
}