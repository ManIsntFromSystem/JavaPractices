package from_zero

fun main(){
//    fun happyBirthday(name: String, age: Int): String {
//        return "Happy ${age}th birthday, $name!"
//    }

    fun happyBirthday(name: String = "Joe", age: Int = 13) =
        "Happy ${age}th birthday, $name!"

    println(happyBirthday())
    println(happyBirthday("Sara", 33))
//    fun happyBirthday(name: String, age: String) =
//        "Happy ${age}th birthday, $name!, with String parameter"
//
//    fun happyBirthday(greeting: String, name: String, age: String) =
//        "$greeting, Happy ${age}th birthday, $name!, with 3 parameters"
//
//    println(happyBirthday("Jon", "13"))
//    println(happyBirthday("Hi","Jon", "13"))
//
//    var congrats = happyBirthday("Jon", 13)
//    println("Hello! $congrats")
//
//    fun happyBirthdayWithoutParams() {
//        println("Happy birthday!")
//    }
//
//    happyBirthdayWithoutParams()
//
    fun countAndPrintArgs(vararg numbers: Int) {
        println(numbers.size)
        for (number in numbers) println(number)
    }

    var numberList = listOf(1,2,3,4,5)

    countAndPrintArgs(*numberList.toIntArray())
}