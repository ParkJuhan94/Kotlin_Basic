package KOTLIN_BASIC

fun main() {
    myFunc {
        println("함수 호출")
    }
}

fun myFunc(callBack : () -> Unit) {
    println("함수 Start")
    callBack()
    println("함수 End")
}

/*
함수 Start
함수 호출
함수 End
 */