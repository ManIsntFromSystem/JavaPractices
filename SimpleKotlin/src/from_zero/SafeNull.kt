package from_zero

fun main(){
    var a: String = "abc"
    //a = null // compilation error

    var b: String? = "abc"
    b = null // ok
    println(b)

    val l1 = a.length
    //val l2 = b.length

    val l3 = if (b != null) b.length else -1

    val c: String? = "Kotlin"
    if (c != null && c.length > 0) {
        println("String of length ${c.length}")
    } else {
        println("Empty string")
    }

    val a1 = "Kotlin"
    val b1: String? = null
    println(b1?.length)
    println(a1?.length) // Unnecessary safe call

    //bob?.department?.head?.name

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }

    //val l4 = b1!!.length
}