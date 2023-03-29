package com.lno.makemydinner

import Menu

class RecipesList(private val recipes: List<Recipe>) {
    fun createMenu(numberOfMenus: Int): Menu {
        val subListOfRecipes = recipes.subList(0, numberOfMenus)
        return Menu(subListOfRecipes)
    }
}