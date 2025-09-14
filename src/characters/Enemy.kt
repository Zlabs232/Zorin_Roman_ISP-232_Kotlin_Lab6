package characters

class Enemy(
    val name: String,
    var hp: Int,
    val element: String,
    val aggressionLevel: Int = 2
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

    fun getThreatLevel(): String {
        if (hp < 0) return "НЕкорректное здоровье"
        return when {
            hp <= 50 -> "Низкий"
            hp <= 150 -> "Средний"
            else -> "Высокий"
        }
    }

    fun calculatePower(): Int {
        return hp * aggressionLevel
    }
}
