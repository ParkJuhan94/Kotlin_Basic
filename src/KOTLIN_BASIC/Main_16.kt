package KOTLIN_BASIC

fun main() {
    val dog: Animal = Dog()
    val cat = Cat()

    if (dog is Dog) {       // 타입 체크 is
        println("멍멍이")
    }
}

interface Drawable {
    fun draw()
}

abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class Dog : Animal(), Drawable1 {
    override fun move() {
        println("껑충")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살금")
    }
}