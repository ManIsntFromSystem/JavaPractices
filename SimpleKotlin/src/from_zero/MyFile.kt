package from_zero

fun main() {
    //////******* Loops ******/////////

    var sevenRainbowsColours = arrayOf("Red", "Orange", "Yellow", "Green", "Blue")
    for (color in sevenRainbowsColours) {
        println(color)
    }

    for (x in 0..4) println(x)

    for (x in 0 until 4) println(x)

    for (x in 0 until 7 step 2) println(x)

    for (x in 7 downTo 0 step 2) println(x)

    var numbers = 0 until 10
    var numbersList = numbers.toList()
    for(x in numbers step 2)
    println(x)

    for ((index, value) in sevenRainbowsColours.withIndex()){
        println("$index: $value")
    }

    val map = mapOf(1 to "One", 2 to "Two")

    for (entry in map) {
        println("${entry.key}: ${entry.value}")
    }

    for ((key, value) in map){
        println("$key: $value")
    }

    for (key in map.keys) {
        println(key)
    }

    for (value in map.values) {
        println(value)
    }

    var x = 0

    while (x < 5 ) {
        println(x)
        x++
    }

    outer@ for (n in 2..100) {
        for (d in 2 until n) {
            if (n % d == 0) continue@outer
        }
        println("$n is prime")
    }

    var mySet1 = mutableSetOf("2", "3")
    mySet1.add("1")
    mySet1.add("4")
    for (item in mySet1) println(item)

    var text = "Build completed successfully with 1 warning in 1 s 756 ms"
    var letterSet = mutableSetOf<Char>()
    for (letter in text){
        letterSet.add(letter)
    }

    var letterCount = 0
    for (letter in letterSet) {
        letterCount++
        println(letter)
    }
    println(letterCount)
    println(letterSet.size)

}

//////*********  Map  ************//////

/*
    val map1 = mutableMapOf(1 to "One", 2 to "Two")
    map1.putIfAbsent(3, "Three")
    map1[4] = "Four"

    println(map1.keys)
    println(map1.values)

    println(map1[1])
    println(map1.getValue(1))

    for (entry in map1){
        println("${entry.key}: ${entry.value}")
    }

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)

    val filteredKeysMap = numbersMap.filterKeys { it.endsWith("1") }
    val filteredValuesMap = numbersMap.filterValues { it < 10 }
    println(filteredKeysMap)
    println(filteredValuesMap)

    println(numbersMap + Pair("key2", 4))
    println(numbersMap + Pair("one", 10))
    println(numbersMap + mapOf("five" to 5, "one" to 11))

    println(numbersMap - "one")
    println(numbersMap - listOf("two", "four"))

    val numbersMap1 = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    numbersMap1.putAll(setOf("four" to 4, "five" to 5))
    println(numbersMap1)

    val previousValue = numbersMap1.put("one", 11)
    println("value associated with 'one', before: $previousValue, after: ${numbersMap1["one"]}")
    println(numbersMap1)

    numbersMap1.remove("one")
    println(numbersMap1)
    numbersMap1.keys.remove("two")
    println(numbersMap1)
    numbersMap1.values.remove(3)
    println(numbersMap1)

    numbersMap1 -= "four"
    println(numbersMap1)
*/


    /*
    ///////***** Arrays ******//////

    var myArray = arrayOf(1, 4, 5, true, "Str")
    var myList = listOf<Int>(1, 5, 7)

    var mutableList = mutableListOf(1.1, 4, "Str")
    var mutableList1 = mutableListOf<Double>(1.1, 4.6, 3.34)

    mutableList.add("hello")
    mutableList.addAll("hello", "my")

    var sevenRainbowsColours = arrayOf("Red", "Orange", "Yellow", "Green", "Blue", "Azure", "Purple")
    var colours = mutableListOf<String>("Red", "Orange", "Yellow", "Green", "Blue", "Azure", "Purple")
    colours.add("Brown")

    println(colours)
    println(colours[1])

*/

    /*
    /////***** Variables *****//////

    var age: Int
    var isAdult: Boolean
    var isMan = true
    age = 22
    if (age > 18){
        println("You are adult")
        isAdult = true
    } else{
        println("You aren't adult")
        isAdult = false
    }
    if (isAdult && isMan) {
        println("Man, you can drive")
    } else if (isAdult && !isMan) {
        println("Pretty, you can drive")
    } else {
        println("You cannot drive")
    }*/


    /*
    ////**** Operators ***/////
    val name = "Dmitrij"
    var age = 23

    age += 1
    age -= 11
    age *=2

    var radius: Int = 7
    //val PI: Double = 3.14
    var circleArea: Int = PI.toInt() * radius * radius
    var circleArea1 = PI * radius * radius
    var circleArea2 = PI * radius.toDouble().pow(2)

    println(circleArea)
    println(circleArea1)
    println(circleArea2)
    println("My name is $name, I'm $age years old")*/