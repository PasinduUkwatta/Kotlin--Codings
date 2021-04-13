fun main(args: Array<String>) {
    println("Hello World")
    println("My first kotlin Programme")
     var name :String
     name ="Pasindu Thiwanka"

    println(name)
    var timWeeklySalary:Int =32
    var timMonthlySalary : Int = timWeeklySalary*4
    var date : Int = 6
    var month : String = "March"
    var year : Int = 1996

    var num1 :Double =35.0
    var num2 :Double =56.0
    var num3:Double=num1/num2
    println(timMonthlySalary)

    var apples:Double=6.346364
    var oranges:Double=5.345636
    var fruits:Double=apples*oranges
    var devide =apples/oranges
    println("--------------------------------")
    println(fruits)
    println(devide)

    var firstName :String
    var lastName :String
    firstName ="Thiwanka"
    lastName ="deshan"

    //String Interpolation
    println("My name is $firstName $lastName ")
    println("My Birth Day is $date $month $year ")
    println("My Number is :"+(num3))
}