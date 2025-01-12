package KOTLIN_BASIC

fun main() {
    val items1 = listOf(1, 2, 3, 4, 5)   // 변경 불가
    // mutableListOf<Int>(1, 2, 3, 4, 5) : <Int> 는 타입추론이 있기 때문에 생략 가능
    val items2 = mutableListOf(1, 2, 3, 4, 5)   // 변경 가능

    items2.add(6)
    items2.remove(3)
    items2[0] = 100

    // 출력 : 100 2 3 4 5 6
    for (item in items2) {
        println(item)
    }

    val items3 = arrayOf(1, 2, 3)
    println(items3.size)
    items3[0] = 10
}