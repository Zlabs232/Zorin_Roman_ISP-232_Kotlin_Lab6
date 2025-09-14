package world

fun main() {
    val contract1 = Contract("Чухан Элрик", "Охотиться на гоблинов в лесу", 500, true)
    val contract2 = Contract("Мопс Альберт", "Доставить товар в соседний город", 300)

    contract1.printContractInfo()
    println()
    contract2.printContractInfo()
}