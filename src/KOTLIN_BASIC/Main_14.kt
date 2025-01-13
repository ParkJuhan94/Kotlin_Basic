package KOTLIN_BASIC

fun main() {
    /*
    val john = Person("John", 25)
//    println("name: ${john.name}")   // 프로퍼티 접근 불가능

    // setter 사용하지 않아도 직접 값 변경 가능
    john.age = 26
    println("age: ${john.age}")
     */

    val john1 = Person("John", 20)
    val john2 = Person("John", 20)

    println(john1)
    println(john2)
    println(john1 == john2)
}

//class Person(
//    private val name: String,
//    var age: Int,
//)

data class Person(
    val name: String,
    var age: Int,
)