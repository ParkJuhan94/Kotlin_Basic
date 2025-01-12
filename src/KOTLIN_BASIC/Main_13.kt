package KOTLIN_BASIC

fun main() {
    println(sum(10, 20))            // 기본값 사용
    println(sum(b = 10, a = 20))    // 명명된 인자 사용
}

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c  // c에 기본값 0 설정
