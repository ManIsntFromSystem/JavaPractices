fun main() {
    runSimulation()
}
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Geralt"))
    println(greetingFunction("Tom"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuilds = 5
    return {playerName: String ->
        val currentYear = 2020
        numBuilds +=1
        println("Adding $numBuilds $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
fun printConstructionCost(numBuilds: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuilds}")
}
