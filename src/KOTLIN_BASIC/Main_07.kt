package KOTLIN_BASIC

fun main() {
    var i = 5

    var result = when {
        i > 10 -> "10 보다 크다."
        i > 5 -> "5 보다 크다."
        else -> "5 이하이다."
    }

    println(result)
}