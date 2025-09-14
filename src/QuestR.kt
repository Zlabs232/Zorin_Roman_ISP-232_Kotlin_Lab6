fun main() {
    val quest = Quest("", 0, 0, "")

    print("Введите название квеста: ")
    val title = readln()
    print("Введите время выполнения (в часах): ")
    val duration = readln().toInt()
    print("Введите награду (в монетах): ")
    val reward = readln().toInt()
    print("Введите уровень сложности: ")
    val difficulty = readln()

    quest.printInfo()

    val quests = mutableListOf<Quest>()

    for (i in 1..3) {
        println("Добавим квест #$i")
        print("Название: ")
        val qTitle = readln()
        print("Время (в часах): ")
        val qDuration = readln().toInt()
        print("Награда: ")
        val qReward = readln().toInt()
        print("Сложность: ")
        val qDifficulty = readln()

        val q = Quest(qTitle, qDuration, qReward, qDifficulty)
        quests.add(q)
        println()
    }

    println("Все доступные квесты:")
    for (q in quests) {
        q.printInfo()
    }
}