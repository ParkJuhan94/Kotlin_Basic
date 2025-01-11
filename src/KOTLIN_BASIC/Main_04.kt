package KOTLIN_BASIC

import java.lang.Integer.max

fun main() {
    var i = 10
    var j = 20

    // Math 클래스의 max 메서드를 사용하여 최대값을 구함
    print(Math.max(i, j))  // 결과: 20

    // Integer 클래스의 max 메서드를 사용하여 최대값을 구함
    print(max(i, j))  // 결과: 20
}