package KOTLIN_BASIC

fun main() {
    val box1 = Box(10)          // Box<Int> 타입의 인스턴스 생성
    val box2 = Box("apple")     // Box<String> 타입의 인스턴스 생성

    println(box1.value)         // 출력: 10
    println(box2.value)         // 출력: apple
}

class Box<T>(var value: T) {
    // 제네릭 클래스 정의
}
