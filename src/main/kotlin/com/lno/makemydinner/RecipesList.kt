package com.lno.makemydinner

import Menu

class RecipesList(private val recipes: List<Recipe>) {
    fun createMenu(numberOfMenus: Int): Menu {
        if (numberOfMenus > recipes.size) {
            return Menu(emptyList())
        }
        val subListOfRecipes = recipes.subList(0, numberOfMenus)
        return Menu(subListOfRecipes)
    }
}