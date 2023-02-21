import com.lno.makemydinner.Ingredient
import com.lno.makemydinner.Recipe

class Menu(private val recipes: List<Recipe>) {
    fun getGroceriesList(): List<Ingredient> {
        return recipes.flatMap { recipe -> recipe.ingredients }
            .distinct()
    }
}