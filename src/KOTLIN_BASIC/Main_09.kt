package KOTLIN_BASIC

fun main() {
    val items = listOf(1, 2, 3, 4, 5)

    for (item in items) {
        println(item)
    }

    items.forEach { item ->
        println(item)
    }

    // for (int i = 0; i <= 3; i++)
    for(i in 0..3) {
        println(items[i])
    }
}