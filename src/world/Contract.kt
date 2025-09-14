package world

class Contract(
    val clientName: String,
    val taskDescription: String,
    val reward: Int,
    val isUrgent: Boolean = false
) {
    fun printContractInfo() {
        println("Заказчик: $clientName")
        println("Задача: $taskDescription")
        println("Награда: $reward")
        println("Срочный: ${if (isUrgent) "Срочно!" else "Обычный контракт"}")
    }
}