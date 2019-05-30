import java.util.*
import kotlin.math.absoluteValue

fun main() {
    val scanner = Scanner(System.`in`)

    println((1..scanner.nextInt())
            .map { scanner.nextInt() }
            .filter { it < 0 }
            .sum()
            .absoluteValue)
}