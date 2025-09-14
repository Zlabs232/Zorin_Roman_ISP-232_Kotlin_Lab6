class Spell {
    val name: String
    val width: Int
    val height: Int
    val symbol: String

    constructor(name: String, width: Int, height: Int, symbol: String) {
        this.name = name
        this.width = width
        this.height = height
        this.symbol = symbol
    }

    constructor(name: String, size: Int, symbol: String) : this(name, size, size, symbol)

    constructor() : this("", 0, 0, "")

    fun cast() {
        println("Кастуем $name!")
        for (i in 1..height) {
            for (j in 1..width) {
                print(symbol)
            }
            println()
        }
        println()
    }
}