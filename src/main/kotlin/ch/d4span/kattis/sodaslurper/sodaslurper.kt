import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var empty = scanner.nextInt()
    val found = scanner.nextInt()
    val c = scanner.nextInt()

    println(computeSodas(empty, found, c))
}

fun computeSodas(e: Int, found: Int, c: Int): Int {
    var empty: Int = e + found

    var sodas = 0

    while (canGetSoda(empty, c)) {
        sodas += empty / c
        val remainingEmpty: Int = empty % c

        empty = sodas + remainingEmpty
    }

    return sodas
}

fun canGetSoda(empty: Int, c: Int) = empty >= c