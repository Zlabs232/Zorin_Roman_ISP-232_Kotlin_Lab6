package magic

import magic.Spell

fun main() {
    val fireWall = Spell(
        name = "Огненная Стена",
        width = 5,
        height = 3,
        symbol = "\uD83D\uDD25"
    )
    fireWall.cast()

    val iceShield = Spell(
        name = "Ледяной Щит",
        width = 4,
        height = 4,
        symbol = "❄"
    )
    iceShield.cast()

    val lightning = Spell(
        name = "Молния",
        width = 3,
        height = 6,
        symbol = "\u26A1"
    )
    lightning.cast()

    val waterStrike = Spell(
        name = "Водяной Удар",
        width = 7,
        height = 2,
        symbol = "\uD83C\uDF0A"
    )
    waterStrike.cast()

    val fireball = Spell("Огненный шар", 3, 3, "🔥")
    val heal = Spell("Исцеление", 2, "❤️")

    println(fireball.description())
    println(heal.description())
}