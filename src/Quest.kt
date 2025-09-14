class Quest(
    val title: String,
    val duration: Int,
    val reward: Int,
    val difficulty: String
) {
    fun printInfo() {
        println("Название квеста: $title")
        println("Время выполнения: $duration часов")
        println("Награда: $reward монет")
        println("Уровень сложности: $difficulty")
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "Сложный"
    }

    fun goldPerHour(): Double {
        return reward.toDouble() / duration
    }
}