class Enemy(
    val name: String,
    var hp: Int,
    val element: String
) {
    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }

    fun isStrong(): Boolean {
        return hp > 100
    }
}

