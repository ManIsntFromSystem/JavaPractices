package from_zero

fun main(){

    class Person1{
        var name = ""
        var age = 0
        var isMarriage = false
    }

    class Person2(firstName:String, lastName:String, yearOfBirth: Int){
        var firstName = firstName
        var lastName = lastName
        var age = 0
        var isMarried = false

        init {
            age = 2020 - yearOfBirth
        }

        fun getFullName(): String{
            return "$firstName $lastName"
        }

//        constructor(){
//            this.fullName = "John Doe"
//            this.age = 33
//            this.isMarried = false
//        }
//
//        constructor(fullName:String, age:Int, isMarried:Boolean){
//            this.fullName = fullName
//            this.age = age
//            this.isMarried = isMarried
//        }
//        constructor(fullName:String){
//            this.fullName = fullName
//            this.age = 0
//            this.isMarried = false
//        }
    }
    var sara = Person2("Tom", "Hanks", 1990)
    println(sara.getFullName())
    
    var jack = Person2("Jack", "Smith", 1965)
    println("First name: ${jack.firstName} \n" +
            "Last name: ${jack.lastName} \n" +
            "Age: ${jack.age} years \n" +
            "Married: ${jack.isMarried}")
}