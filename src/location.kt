class Location(
    val name: String = "Неизвестная локация",
    val dangerLevel: String = "Низкий",
    val requiredLevel: Int = 1
) {
    fun isDangerous(): Boolean {
        return dangerLevel == "Высокий"
    }
}