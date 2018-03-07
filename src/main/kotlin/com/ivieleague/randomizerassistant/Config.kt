package com.ivieleague.randomizerassistant

data class Config(
        val game: Game,
        val setAliases: Map<String, Requirement>,
        val locationsFound: Set<String>,
        val inventory: Map<String, Int>
) {
    fun availableLocations() = game.locations.filter { it.requires.accessible(inventory, game.aliases + setAliases) > 0f }
    fun obtain(item: String): Config {
        val newCount: Int = inventory.getOrDefault(item, 0) + 1
        return copy(inventory = inventory + (item to newCount))
    }

    fun setAlias(key: String, requirement: Requirement): Config {
        return copy(
                setAliases = setAliases + (key to requirement)
        )
    }
}