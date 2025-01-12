package KOTLIN_BASIC

fun main() {
    var name: String? = null  // Nullable 변수, null을 가질 수 있음
    name = "주퓨터"
    name = null

    var name2: String = ""  // Non-nullable 변수, null을 가질 수 없음

    // Null Safety 처리 방법 1: null 체크
    if(name != null) {
        name2 = name
    }

    // Null Safety 처리 방법 2: 강제 널 안전성 연산자 사용 (주의 필요)
    name2 = name!!  // name이 null이 아님을 보장 (null일 경우 NPE 발생)

    // Null Safety 처리 방법 3: Safe Call과 let 블록
    name?.let {
        name2 = it  // name이 null이 아닐 때만 let 블록 실행
    }
}