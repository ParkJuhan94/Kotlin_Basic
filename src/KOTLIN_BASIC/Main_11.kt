package KOTLIN_BASIC

fun main() {
    val items = listOf(1, 2, 3)

    // 출력: Index 4 out of bounds for length 3
    try {
        val item = items[4]
    } catch (e: Exception) {
        println(e.message)
    }
}