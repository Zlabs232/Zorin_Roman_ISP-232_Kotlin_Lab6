class Item {
    val name: String
    val type: String
    val value: Int

    constructor(name: String, type: String, value: Int) {
        this.name = name
        this.type = type
        this.value = value
    }

    constructor(name: String, type: String) : this(name, type, 0)

    fun printInfo() {
        println("Предмет: $name")
        println("Тип: $type")
        println("Стоимость: $value монет")
    }
}