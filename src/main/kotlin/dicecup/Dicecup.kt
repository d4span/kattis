import java.util.*

typealias NumberDiceRolls = Int
typealias Result = Int

fun main() {
    val scanner = Scanner(System.`in`)

    val firstDice = 1..scanner.nextInt()
    val secondDice = 1..scanner.nextInt()

    val diceRolls = mutableMapOf<Result, NumberDiceRolls>()

    firstDice.forEach { firstRoll ->
        secondDice.forEach { secondRoll ->
            val result = firstRoll + secondRoll
            diceRolls[result] = diceRolls[result]?.inc() ?: 1
        }
    }

    val highestProbability = diceRolls.values.max() ?: 0
    diceRolls.filter { entry -> entry.value == highestProbability }
            .keys
            .sorted()
            .forEach(::println)
}