package KOTLIN_BASIC

import kotlin.random.Random

fun main() {
    var randomIntNum = Random.nextInt()
    println(randomIntNum)

    randomIntNum = Random.nextInt(0, 100)
    println(randomIntNum)

    var randomDoubleNum = Random.nextDouble(0.0, 1.0)
    println(randomDoubleNum)
}