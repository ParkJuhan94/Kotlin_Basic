package KOTLIN_BASIC

fun main() {
    var i = 10
    var l = 20L

    l = i.toLong()  // Int를 Long으로 변환
    i = l.toInt()   // Long을 Int로 변환

    var name = " "
    name = i.toString()  // Int를 String으로 변환
}