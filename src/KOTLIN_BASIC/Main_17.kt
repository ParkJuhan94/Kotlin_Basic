package KOTLIN_BASIC

interface Drawable1 {
    fun draw() {
        println("Drawing")
    }
}

interface Printable {
    fun print() {
        println("Printing")
    }
}

class Document : Drawable1, Printable {
    override fun draw() {
        println("Document Drawing")
    }

    override fun print() {
        println("Document Printing")
    }
}

fun main() {
    val drawable1: Drawable1 = Document()

    // 강제 타입 변환 사용
    val doc = drawable1 as Document

    doc.draw()  // 출력: Document Drawing
    doc.print() // 출력: Document Printing
}

