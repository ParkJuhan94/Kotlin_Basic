package KOTLIN_BASIC

fun main() {

}

interface Drawable {
    fun draw()
}

abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class Dog : Animal(), Drawable {
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