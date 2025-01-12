package KOTLIN_BASIC

fun main() {
    val john = Person("John", 25)
    println("name: ${john.name}")

    // setter 사용하지 않아도 직접 값 변경 가능
    john.age = 26
    println("age: ${john.age}")
}

class Person(
    val name: String,
    var age: Int,
)