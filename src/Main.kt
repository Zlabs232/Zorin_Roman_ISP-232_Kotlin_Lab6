fun main() {
    val naruto = Hero(
        name = "Наруто",
        gender = "мужской",
        role = "Шиноби",
        level = 5,
        element = "Ветер",
        hp = 150,
        mp = 200
    )
    naruto.showStats()

    val kakashi = Hero(
        name = "Какаши",
        gender = "мужской",
        role = "Шиноби",
        level = 15,
        element = "Молния",
        hp = 250,
        mp = 300
    )
    kakashi.showStats()

    val orochimaru = Enemy(
        name = "Орочинару",
        hp = 350,
        element = "Ветер"
    )

    naruto.castSpellOn(enemy = orochimaru, spellName = "Расенган", damage = 30)
    naruto.duel(opponent = kakashi)
}