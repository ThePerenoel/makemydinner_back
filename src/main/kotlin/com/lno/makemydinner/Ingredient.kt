package com.lno.makemydinner

class Ingredient(val name: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ingredient) return false

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "Ingredient(name='$name')"
    }
}
