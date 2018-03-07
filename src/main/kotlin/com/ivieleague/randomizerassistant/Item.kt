package com.ivieleague.randomizerassistant

data class Item(
        var name: String = "",
        val image: String? = null,
        var categories: List<String> = listOf()
) {
    fun toCreateCode(): String = "Item(name=\"$name\",image=${if (image == null) "null" else "\"$image\""},categories=listOf(${categories.joinToString { "\"$it\"" }}))"
}