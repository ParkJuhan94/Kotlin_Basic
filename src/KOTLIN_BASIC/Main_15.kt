package KOTLIN_BASIC

fun main() {
    val john = Person1("John", 20)

//    john.hobby = "독서" // 불가능
    println(john.hobby)  // "취미 : 축구" 출력
}

class Person1(
    val name: String,  // 읽기 전용 프로퍼티
    var age: Int       // 읽기 및 쓰기 가능 프로퍼티
) {
    var hobby = "축구"
        private set   // 외부에서 `hobby`를 변경할 수 없도록 설정
        get() = "취미 : $field"  // 커스텀 게터를 사용하여 "취미 : 값" 형식으로 반환

    init {
        println("init")  // 객체가 생성될 때 실행되는 초기화 블록
    }

    fun some() {
        hobby = "농구"  // 클래스 내부에서는 `hobby` 프로퍼티를 변경할 수 있음
    }
}