package com.ivieleague.randomizerassistant

object Keysanity {
    val game = Game(
            aliases = mapOf(
                    "East Dark World Death Mountain" to Requirement.And(
                            listOf(
                                    Requirement.Has("canLiftDarkRocks"),
                                    Requirement.Has("East Death Mountain")
                            )
                    ),
                    "West Dark World Death Mountain" to Requirement.None,
                    "Mire Dark World" to Requirement.And(
                            listOf(
                                    Requirement.Has("canFly"),
                                    Requirement.Has("canLiftDarkRocks")
                            )
                    ),
                    "North East Dark World" to Requirement.Or(
                            listOf(
                                    Requirement.Has("DefeatAgahnim"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("Hammer"),
                                                    Requirement.Has("canLiftRocks"),
                                                    Requirement.Has("Moon Pearl")
                                            )
                                    ),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("canLiftDarkRocks"),
                                                    Requirement.Has("Flippers"),
                                                    Requirement.Has("Moon Pearl")
                                            )
                                    )
                            )
                    ),
                    "North West Dark World" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("North East Dark World"),
                                                                    Requirement.And(
                                                                            listOf(
                                                                                    Requirement.Has("Hookshot"),
                                                                                    Requirement.Or(
                                                                                            listOf(
                                                                                                    Requirement.Has("Flippers"),
                                                                                                    Requirement.Has("canLiftRocks"),
                                                                                                    Requirement.Has("Hammer")
                                                                                            )
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    ),
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hammer"),
                                                                    Requirement.Has("canLiftRocks")
                                                            )
                                                    ),
                                                    Requirement.Has("canLiftDarkRocks")
                                            )
                                    )
                            )
                    ),
                    "South Dark World" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("North East Dark World"),
                                                                    Requirement.Or(
                                                                            listOf(
                                                                                    Requirement.Has("Hammer"),
                                                                                    Requirement.And(
                                                                                            listOf(
                                                                                                    Requirement.Has("Hookshot"),
                                                                                                    Requirement.Or(
                                                                                                            listOf(
                                                                                                                    Requirement.Has("Flippers"),
                                                                                                                    Requirement.Has("canLiftRocks")
                                                                                                            )
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    ),
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hammer"),
                                                                    Requirement.Has("canLiftRocks")
                                                            )
                                                    ),
                                                    Requirement.Has("canLiftDarkRocks")
                                            )
                                    )
                            )
                    ),
                    "East Death Mountain" to Requirement.And(
                            listOf(
                                    Requirement.Has("West Death Mountain"),
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hammer"),
                                                                    Requirement.Has("Magic Mirror")
                                                            )
                                                    ),
                                                    Requirement.Has("Hookshot")
                                            )
                                    )
                            )
                    ),
                    "West Death Mountain" to Requirement.Or(
                            listOf(
                                    Requirement.Has("canFly"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("canLiftRocks"),
                                                    Requirement.Has("Lamp")
                                            )
                                    )
                            )
                    ),
                    "Desert Palace" to Requirement.Or(
                            listOf(
                                    Requirement.Has("BookOfMudora"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("Magic Mirror"),
                                                    Requirement.Has("canLiftDarkRocks"),
                                                    Requirement.Has("canFly")
                                            )
                                    )
                            )
                    ),
                    "Eastern Palace" to Requirement.None,
                    "Ganons Tower" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("Crystal1"),
                                    Requirement.Has("Crystal2"),
                                    Requirement.Has("Crystal3"),
                                    Requirement.Has("Crystal4"),
                                    Requirement.Has("Crystal5"),
                                    Requirement.Has("Crystal6"),
                                    Requirement.Has("Crystal7"),
                                    Requirement.Has("East Dark World Death Mountain")
                            )
                    ),
                    "Hyrule Castle" to Requirement.None,
                    "Castle Tower" to Requirement.Or(
                            listOf(
                                    Requirement.Has("Cape"),
                                    Requirement.Has("hasUpgradedSword"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("configSwordless"),
                                                    Requirement.Has("Hammer")
                                            )
                                    )
                            )
                    ),
                    "Ice Palace" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("Flippers"),
                                    Requirement.Has("canLiftDarkRocks"),
                                    Requirement.Has("canMeltThings")
                            )
                    ),
                    "Light World" to Requirement.None,
                    "Misery Mire" to Requirement.Has("Medallion"),
                    "Dark Palace" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("North East Dark World")
                            )
                    ),
                    "Skull Woods" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("North West Dark World")
                            )
                    ),
                    "Swamp Palace" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("Magic Mirror"),
                                    Requirement.Has("Flippers"),
                                    Requirement.Has("South Dark World")
                            )
                    ),
                    "Thieves Town" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("North West Dark World")
                            )
                    ),
                    "Tower Of Hera" to Requirement.And(
                            listOf(
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.Has("Magic Mirror"),
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hookshot"),
                                                                    Requirement.Has("Hammer")
                                                            )
                                                    )
                                            )
                                    ),
                                    Requirement.Has("West Death Mountain")
                            )
                    ),
                    "Turtle Rock" to Requirement.Has("Medallion"),
                    "canLightTorches" to Requirement.Or(
                            listOf(
                                    Requirement.Has("Fire Rod"),
                                    Requirement.Has("Lamp")
                            )
                    ),
                    "hasUpgradedSword" to Requirement.HasMultiple("Sword",
                            2,
                            2),
                    "canExtendMagic" to Requirement.None,
                    "canLiftDarkRocks" to Requirement.HasMultiple("Gloves",
                            2,
                            2),
                    "canLiftRocks" to Requirement.Has("Gloves"),
                    "configSwordless" to Requirement.None,
                    "configCanTakeDamage" to Requirement.None,
                    "canBlockLasers" to Requirement.HasMultiple("Shield",
                            3,
                            3),
                    "canFly" to Requirement.Has("Flute"),
                    "canShootArrows" to Requirement.Has("Bow"),
                    "hasSword" to Requirement.HasMultiple("Sword",
                            1,
                            1),
                    "canMeltThings" to Requirement.Or(
                            listOf(
                                    Requirement.Has("Bombos"),
                                    Requirement.Has("Fire Rod")
                            )
                    ),
                    "hasABottle" to Requirement.HasMultiple("Sword",
                            1,
                            1)
            ),
            locations = listOf(
                    Location(
                            name = "Hookshot Cave - Top Left",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hookshot Cave - Top Right",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hookshot Cave - Bottom Left",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Superbunny Cave - Top",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "Superbunny Cave - Bottom",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "Hookshot Cave - Bottom Right",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Has("Pegasus Boots")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Spike Cave",
                            region = "West Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("canExtendMagic"),
                                                                                            Requirement.Has("Magic Cape")
                                                                                    )
                                                                            ),
                                                                            Requirement.Has("Cane Of Byrna")
                                                                    )
                                                            ),
                                                            Requirement.Has("West Death Mountain")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "DarkMire Shed - Right",
                            region = "Mire Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Mire Dark World"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "DarkMire Shed - Left",
                            region = "Mire Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Mire Dark World"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "Pyramid",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Bow",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Left",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Catfish",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("canLiftRocks")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Sword",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("hasSword"),
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Right",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Brewery",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Blacksmith",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.Has("canLiftDarkRocks")
                                    )
                            )
                    ),
                    Location(
                            name = "Purple Chest",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.Has("canLiftDarkRocks")
                                    )
                            )
                    ),
                    Location(
                            name = "Bumper Cave",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Magic Cape")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "C-Shaped House",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hammer Pegs",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Chest Game",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Bottom",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - NPC",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Middle Left",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Digging Game",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Middle Right",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Stumpy",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Top",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Right",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Middle",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Spiral Cave",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Left",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Upper - Left",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Far Right",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mimic Cave",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    2,
                                                                    2),
                                                            Requirement.Has("Turtle Rock")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Far Left",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Upper - Right",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Floating Island",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("canLiftDarkRocks")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ether Tablet",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Book Of Mudora"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Mirror"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Spectacle Rock",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.Has("Magic Mirror")
                                    )
                            )
                    ),
                    Location(
                            name = "Spectacle Rock Cave",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Old Man",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.Has("Lamp")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Torch",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Big Key Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Desert Palace Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Prize",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Book Of Mudora"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("canLiftDarkRocks"),
                                                                                            Requirement.Has("canFly")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Desert Palace Big Key"),
                                                            Requirement.Has("Desert Palace Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Big Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Desert Palace Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Map Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Desert Palace - Lanmolas",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Book Of Mudora"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("canLiftDarkRocks"),
                                                                                            Requirement.Has("canFly")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Desert Palace Big Key"),
                                                            Requirement.Has("Desert Palace Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Compass Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Desert Palace Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Map Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Armos Knights",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Eastern Palace Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Big Key Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.Has("Lamp")
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Cannonball Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Big Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.Has("Eastern Palace Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Prize",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Eastern Palace Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Compass Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Firesnake Room",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Map Chest",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Pegasus Boots"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Bottom Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Bob's Chest",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane Of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Mini Helmasaur Room - Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Top Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Bottom Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Top Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Top Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Tile Room",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.Has("Cane Of Somaria")
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Key Chest",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane Of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Bob's Torch",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Bottom Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Bottom Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Pre-Moldorm Chest",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Top Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Top Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Key Room - Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane Of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Bottom Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Hope Room - Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Hope Room - Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Bottom Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Chest",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane Of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Top Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Key Room - Right",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane Of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Mini Helmasaur Room - Left",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Moldorm Chest",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            ),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Agahnim 2",
                            region = "Ganons Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganons Tower"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sewers - Dark Cross",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Hyrule Castle Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hyrule Castle - Zelda's Cell",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.Has("Hyrule Castle Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Sewers - Secret Room - Right",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("Lamp"),
                                                                            Requirement.Has("Hyrule Castle Key")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hyrule Castle - Boomerang Chest",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.Has("Hyrule Castle Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Sewers - Secret Room - Middle",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("Lamp"),
                                                                            Requirement.Has("Hyrule Castle Key")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Sanctuary",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hyrule Castle - Map Chest",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sewers - Secret Room - Left",
                            region = "Hyrule Castle",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Hyrule Castle"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("Lamp"),
                                                                            Requirement.Has("Hyrule Castle Key")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Agahnim",
                            region = "Castle Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Castle Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Castle Tower Key",
                                                                    2,
                                                                    2),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Or(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Hammer"),
                                                                                                            Requirement.Has("Bug Catching Net")
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Castle Tower - Dark Maze",
                            region = "Castle Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Castle Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Castle Tower Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Castle Tower - Room 03",
                            region = "Castle Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Castle Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Castle Tower Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Big Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.Has("Ice Palace Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Spike Room",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("configCanTakeDamage"),
                                                                            Requirement.Has("Cane Of Byrna"),
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Or(
                                                                                    listOf(
                                                                                            Requirement.And(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Ice Palace Big Key"),
                                                                                                            Requirement.Has("Hookshot")
                                                                                                    )
                                                                                            ),
                                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                                    1,
                                                                                                    1)
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Prize",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Flippers"),
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Ice Palace Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Cane Of Somaria"),
                                                                                            Requirement.Has("Ice Palace Key")
                                                                                    )
                                                                            ),
                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                    2,
                                                                                    2)
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Big Key Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("configCanTakeDamage"),
                                                                            Requirement.Has("Cane Of Byrna"),
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Or(
                                                                                    listOf(
                                                                                            Requirement.And(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Ice Palace Big Key"),
                                                                                                            Requirement.Has("Hookshot")
                                                                                                    )
                                                                                            ),
                                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                                    1,
                                                                                                    1)
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Freezor Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.Has("canMeltThings")
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Kholdstare",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Flippers"),
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Ice Palace Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Cane Of Somaria"),
                                                                                            Requirement.Has("Ice Palace Key")
                                                                                    )
                                                                            ),
                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                    2,
                                                                                    2)
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Map Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("configCanTakeDamage"),
                                                                            Requirement.Has("Cane Of Byrna"),
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Or(
                                                                                    listOf(
                                                                                            Requirement.And(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Ice Palace Big Key"),
                                                                                                            Requirement.Has("Hookshot")
                                                                                                    )
                                                                                            ),
                                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                                    1,
                                                                                                    1)
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Compass Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ice Palace - Iced T Room",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Bombos Tablet",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Book Of Mudora"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("South Dark World")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Link's Uncle",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ice Rod Cave",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Master Sword Pedestal",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Pendant Of Power"),
                                                            Requirement.Has("Pendant Of Wisdom"),
                                                            Requirement.Has("Pendant Of Courage")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "King Zora",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Flippers")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Lake Hylia Island",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Flippers"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("South Dark World"),
                                                                            Requirement.Has("North East Dark World")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - NPC",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakariko Tavern",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Checkerboard Cave",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canFly"),
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("Magic Mirror")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Link's House",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Secret Passage",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "King's Tomb",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Pegasus Boots"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("canLiftDarkRocks"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Moon Pearl"),
                                                                                            Requirement.Has("North West Dark World")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hobo",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Cave 45",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("South Dark World")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Ledge",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Desert Palace")
                                    )
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Far Left ",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Zora's Ledge",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Flute Spot",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Shovel")
                                    )
                            )
                    ),
                    Location(
                            name = "Sahasrahla's Hut - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Top",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sick Kid",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("hasABottle")
                                    )
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Far Right ",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Floodgate Chest",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Aginah's Cave",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Bottle Merchant",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Library",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Middle",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Bottom",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Potion Shop",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Mushroom")
                                    )
                            )
                    ),
                    Location(
                            name = "Sahasrahla",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Pendant Of Courage")
                                    )
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Far Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Magic Bat",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Powder"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Moon Pearl"),
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("canLiftDarkRocks")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Sahasrahla's Hut - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sahasrahla's Hut - Middle",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mushroom",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Waterfall Fairy - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Maze Race",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sunken Treasure",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Pegasus Rocks",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Far Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Lumberjack Tree",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Agahnim Defeated"),
                                                            Requirement.Has("Pegasus Boots")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Top",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Chicken House",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Graveyard Ledge",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("North West Dark World")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Waterfall Fairy - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Lost Woods Hideout",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Misery Mire - Spike Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("configCanTakeDamage"),
                                                            Requirement.Has("Cane Of Byrna"),
                                                            Requirement.Has("Magic Cape")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Big Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Has("Misery Mire Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Bridge Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Misery Mire - Main Lobby",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Misery Mire Key"),
                                                            Requirement.Has("Misery Mire Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Prize",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Misery Mire Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("canShootArrows")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Compass Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.HasMultiple("Misery Mire Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Map Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Misery Mire Key"),
                                                            Requirement.Has("Misery Mire Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Vitreous",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Misery Mire Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("canShootArrows")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Big Key Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.HasMultiple("Misery Mire Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Prize",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Stalfos Basement",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Palace of Darkness Key"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("canShootArrows"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Maze - Bottom",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Basement - Left",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Big Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    5,
                                                    5)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Helmasaur King",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - The Arena - Bridge",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Palace of Darkness Key"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("canShootArrows"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Big Key Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    5,
                                                    5)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Basement - Right",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - The Arena - Ledge",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Has("canShootArrows")
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Compass Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    3,
                                                    3)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Map Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Has("canShootArrows")
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Harmless Hellway",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    5,
                                                    5)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Shooter Room",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Maze - Top",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Big Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.Has("Skull Woods Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Compass Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Pot Prison",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Mothula",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Or(
                                                                                                    listOf(
                                                                                                            Requirement.Has("canExtendMagic"),
                                                                                                            Requirement.Has("Hammer")
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            ),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Skull Woods Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Map Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Prize",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Or(
                                                                                                    listOf(
                                                                                                            Requirement.Has("canExtendMagic"),
                                                                                                            Requirement.Has("Hammer")
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            ),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Skull Woods Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Bridge Room",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Fire Rod")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Pinball Room",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Big Key Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Map Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.Has("Swamp Palace Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Compass Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Big Key Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - West Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Big Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Swamp Palace Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Flooded Room - Left",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Prize",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Entrance",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Flooded Room - Right",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Arrghus",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Waterfall Room",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Ambush Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Attic",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Theives' Town Key"),
                                                            Requirement.Has("Theives' Town Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Big Key Chest",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Blind",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("North West Dark World"),
                                                            Requirement.Has("Theives' Town Key"),
                                                            Requirement.Has("Theives' Town Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("Cane Of Somaria"),
                                                                            Requirement.Has("Cane Of Byrna")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Prize",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("North West Dark World"),
                                                            Requirement.Has("Theives' Town Key"),
                                                            Requirement.Has("Theives' Town Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("Cane Of Somaria"),
                                                                            Requirement.Has("Cane Of Byrna")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Map Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Compass Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Big Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Blind's Cell",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.Has("Theives' Town Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Compass Chest",
                            region = "Tower Of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower Of Hera"),
                                            Requirement.Has("Tower of Hera Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Map Chest",
                            region = "Tower Of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower Of Hera"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Prize",
                            region = "Tower Of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower Of Hera"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Mirror"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hookshot"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("West Death Mountain"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            ),
                                                            Requirement.Has("Tower of Hera Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Big Key Chest",
                            region = "Tower Of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower Of Hera"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Tower of Hera Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Basement Cage",
                            region = "Tower Of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower Of Hera"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Moldorm",
                            region = "Tower Of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower Of Hera"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Mirror"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hookshot"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("West Death Mountain"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            ),
                                                            Requirement.Has("Tower of Hera Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Big Chest",
                            region = "Tower Of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower Of Hera"),
                                            Requirement.Has("Tower of Hera Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Compass Chest",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.Has("Cane Of Somaria")
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Prize",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    4,
                                                                    4),
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Ice Rod"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Chain Chomps",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.Has("Turtle Rock Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Bottom Right",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane Of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Roller Room - Right",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane Of Somaria")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Trinexx",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    4,
                                                                    4),
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Ice Rod"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Big Chest",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Cane Of Somaria"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    2,
                                                                    2)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Top Right",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane Of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Crystaroller Room",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    2,
                                                                    2)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Roller Room - Left",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane Of Somaria")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Big Key Chest",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.HasMultiple("Turtle Rock Key",
                                                    2,
                                                    2)
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Bottom Left",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key", 3, 3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane Of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Top Left",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane Of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane Of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    )
            ),
            items = mapOf(
                    "Cane Of Byrna" to Item(
                            name = "Cane Of Byrna",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Turtle Rock Complete" to Item(
                            name = "Turtle Rock Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Misery Mire Complete" to Item(
                            name = "Misery Mire Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Ice Palace Complete" to Item(
                            name = "Ice Palace Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Hyrule Castle Big Key" to Item(
                            name = "Hyrule Castle Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Theives' Town Complete" to Item(
                            name = "Theives' Town Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Fire Rod" to Item(
                            name = "Fire Rod",
                            image = null,
                            categories = listOf()
                    ),
                    "Skull Woods Complete" to Item(
                            name = "Skull Woods Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Swamp Palace Complete" to Item(
                            name = "Swamp Palace Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Palace of Darkness Complete" to Item(
                            name = "Palace of Darkness Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Flute" to Item(
                            name = "Flute",
                            image = null,
                            categories = listOf()
                    ),
                    "Tower of Hera Big Key" to Item(
                            name = "Tower of Hera Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Desert Palace Big Key" to Item(
                            name = "Desert Palace Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Eastern Palace Big Key" to Item(
                            name = "Eastern Palace Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Bottle" to Item(
                            name = "Bottle",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Hookshot" to Item(
                            name = "Hookshot",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Quake" to Item(
                            name = "Quake",
                            image = null,
                            categories = listOf(
                                    "Medallion"
                            )
                    ),
                    "Magic Boomerang" to Item(
                            name = "Magic Boomerang",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Castle Tower Big Key" to Item(
                            name = "Castle Tower Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Book Of Mudora" to Item(
                            name = "Book Of Mudora",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Castle Tower Map" to Item(
                            name = "Castle Tower Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Bombs" to Item(
                            name = "Bombs",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Ganon's Tower Map" to Item(
                            name = "Ganon's Tower Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Eastern Palace Key" to Item(
                            name = "Eastern Palace Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Half Magic" to Item(
                            name = "Half Magic",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Desert Palace Key" to Item(
                            name = "Desert Palace Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Tower of Hera Key" to Item(
                            name = "Tower of Hera Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Pegasus Boots" to Item(
                            name = "Pegasus Boots",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Hyrule Castle Key" to Item(
                            name = "Hyrule Castle Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Silver Arrows" to Item(
                            name = "Silver Arrows",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Boomerang" to Item(
                            name = "Boomerang",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Flippers" to Item(
                            name = "Flippers",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Ganon's Tower Big Key" to Item(
                            name = "Ganon's Tower Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Magic Mirror" to Item(
                            name = "Magic Mirror",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Mail" to Item(
                            name = "Mail",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Hyrule Castle Map" to Item(
                            name = "Hyrule Castle Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Shovel" to Item(
                            name = "Shovel",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Quarter Magic" to Item(
                            name = "Quarter Magic",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Heart Piece" to Item(
                            name = "Heart Piece",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Hyrule Castle Compass" to Item(
                            name = "Hyrule Castle Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Shield" to Item(
                            name = "Shield",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Mushroom" to Item(
                            name = "Mushroom",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Ice Rod" to Item(
                            name = "Ice Rod",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Desert Palace Compass" to Item(
                            name = "Desert Palace Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Tower of Hera Compass" to Item(
                            name = "Tower of Hera Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Eastern Palace Compass" to Item(
                            name = "Eastern Palace Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Tower of Hera Complete" to Item(
                            name = "Tower of Hera Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Desert Palace Map" to Item(
                            name = "Desert Palace Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Desert Palace Complete" to Item(
                            name = "Desert Palace Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Eastern Palace Complete" to Item(
                            name = "Eastern Palace Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Tower of Hera Map" to Item(
                            name = "Tower of Hera Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Eastern Palace Map" to Item(
                            name = "Eastern Palace Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Theives' Town Big Key" to Item(
                            name = "Theives' Town Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Hammer" to Item(
                            name = "Hammer",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Skull Woods Big Key" to Item(
                            name = "Skull Woods Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Swamp Palace Big Key" to Item(
                            name = "Swamp Palace Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Palace of Darkness Big Key" to Item(
                            name = "Palace of Darkness Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Hyrule Castle Complete" to Item(
                            name = "Hyrule Castle Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Sword" to Item(
                            name = "Sword",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Heart Container" to Item(
                            name = "Heart Container",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Crystal 6" to Item(
                            name = "Crystal 6",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Crystal 7" to Item(
                            name = "Crystal 7",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Turtle Rock Big Key" to Item(
                            name = "Turtle Rock Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Misery Mire Big Key" to Item(
                            name = "Misery Mire Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Ice Palace Big Key" to Item(
                            name = "Ice Palace Big Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Ice Palace Key" to Item(
                            name = "Ice Palace Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Crystal 1" to Item(
                            name = "Crystal 1",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Misery Mire Key" to Item(
                            name = "Misery Mire Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Turtle Rock Key" to Item(
                            name = "Turtle Rock Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Bug Catching Net" to Item(
                            name = "Bug Catching Net",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Crystal 4" to Item(
                            name = "Crystal 4",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Crystal 5" to Item(
                            name = "Crystal 5",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Ganon's Tower Complete" to Item(
                            name = "Ganon's Tower Complete",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Crystal 2" to Item(
                            name = "Crystal 2",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Crystal 3" to Item(
                            name = "Crystal 3",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Bow" to Item(
                            name = "Bow",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Pendant Of Wisdom" to Item(
                            name = "Pendant Of Wisdom",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Castle Tower Compass" to Item(
                            name = "Castle Tower Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Palace of Darkness Key" to Item(
                            name = "Palace of Darkness Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Swamp Palace Key" to Item(
                            name = "Swamp Palace Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Ganon's Tower Compass" to Item(
                            name = "Ganon's Tower Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Gloves" to Item(
                            name = "Gloves",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Skull Woods Key" to Item(
                            name = "Skull Woods Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Theives' Town Key" to Item(
                            name = "Theives' Town Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Swamp Palace Map" to Item(
                            name = "Swamp Palace Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Ganon's Tower Key" to Item(
                            name = "Ganon's Tower Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Skull Woods Map" to Item(
                            name = "Skull Woods Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Palace of Darkness Map" to Item(
                            name = "Palace of Darkness Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Magic Powder" to Item(
                            name = "Magic Powder",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Misery Mire Map" to Item(
                            name = "Misery Mire Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Turtle Rock Map" to Item(
                            name = "Turtle Rock Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Theives' Town Map" to Item(
                            name = "Theives' Town Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Pendant Of Courage" to Item(
                            name = "Pendant Of Courage",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    ),
                    "Ice Palace Map" to Item(
                            name = "Ice Palace Map",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Bombos" to Item(
                            name = "Bombos",
                            image = null,
                            categories = listOf(
                                    "Medallion"
                            )
                    ),
                    "Misery Mire Compass" to Item(
                            name = "Misery Mire Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Turtle Rock Compass" to Item(
                            name = "Turtle Rock Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Lamp" to Item(
                            name = "Lamp",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Theives' Town Compass" to Item(
                            name = "Theives' Town Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Ice Palace Compass" to Item(
                            name = "Ice Palace Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Swamp Palace Compass" to Item(
                            name = "Swamp Palace Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Castle Tower Key" to Item(
                            name = "Castle Tower Key",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Skull Woods Compass" to Item(
                            name = "Skull Woods Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Agahnim Defeated" to Item(
                            name = "Agahnim Defeated",
                            image = null,
                            categories = listOf(
                                    "Dungeon Item",
                                    "Prize"
                            )
                    ),
                    "Palace of Darkness Compass" to Item(
                            name = "Palace of Darkness Compass",
                            image = null,
                            categories = listOf("Dungeon Item")
                    ),
                    "Ether" to Item(
                            name = "Ether",
                            image = null,
                            categories = listOf(
                                    "Medallion"
                            )
                    ),
                    "Cane Of Somaria" to Item(
                            name = "Cane Of Somaria",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Magic Cape" to Item(
                            name = "Magic Cape",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Moon Pearl" to Item(
                            name = "Moon Pearl",
                            image = null,
                            categories = listOf(
                            )
                    ),
                    "Pendant Of Power" to Item(
                            name = "Pendant Of Power",
                            image = null,
                            categories = listOf(
                                    "Prize"
                            )
                    )
            ),
            alternativeAliases = mapOf(
                    "Turtle Rock" to listOf(
                            Requirement.Has("Bombos"),
                            Requirement.Has("Ether"),
                            Requirement.Has("Quake")
                    ),
                    "Misery Mire" to listOf(
                            Requirement.Has("Bombos"),
                            Requirement.Has("Ether"),
                            Requirement.Has("Quake")
                    )
            )
    )


}