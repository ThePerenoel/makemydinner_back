package com.lno.makemydinner

import Menu

private const val LIST_FIRST_ELEMENT_INDEX = 0

class RecipesList(private val recipes: List<Recipe>) {
    fun createMenu(numberOfMenus: Int): Menu {
        if (numberOfMenus > recipes.size) {
            return Menu(emptyList())
        }
        val subListOfRecipes = recipes.subList(LIST_FIRST_ELEMENT_INDEX, numberOfMenus)
        return Menu(subListOfRecipes)
    }
}