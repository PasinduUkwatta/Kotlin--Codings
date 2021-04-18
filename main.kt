//fun main() {
//    println("Hello World")
//    println("My first kotlin Programme")
//    val name = "Pasindu Thiwanka"
//
//    println(name)
//    val timWeeklySalary =32
//    val timMonthlySalary : Int = timWeeklySalary*4
//    val date = 6
//    val month = "March"
//    val year = 1996
//
//    val num1 =35.0
//    val num2 =56.0
//    val num3:Double=num1/num2
//    println(timMonthlySalary)
//
//    val apples =6.346364
//    val oranges =5.345636
//    val fruits:Double=apples*oranges
//    val divide =apples/oranges
//    println("--------------------------------")
//    println(fruits)
//    println(divide)
//
//    val firstName = "Thiwanka"
//    val lastName = "deshan"
//    val jim = "pasindu"
//
//    //String Interpolation
//    println("My name is $firstName $lastName ")
//    println("My name is $jim ")
//    println("My Birth Day is $date $month $year ")
//    println("My Number is :$num3")
//    happyNewYear()
//}
//
//
//fun happyNewYear() {
//    println("Happy New Year 2021")
//}

//------------------------------------------------------------------------

//fun main() {
//    val lives = 3
//    val isGameOver = lives < 1
//    println(isGameOver)
//
//    if (isGameOver) {
//        println("Game Over !")
//    } else {
//        println("You can Play !!!")
//    }
//
//    age()
//    kotlinClasses()
//}
//
//fun age(){
//    println("How old are You ?")
//
//    val age = readLine()!!.toInt()
//    println("age is $age")
//
//    val message:String =
////        if(age<18){
////        "You too young to vote"
////    }else if (age ==100){
////        "Congratulations"
////    }
////    else{
////        "You can vote"
////    }
//        when {
//            age<18 -> {
//                "You too young to vote"
//            }
//            age ==100 -> {
//                "Congratulations"
//            }
//            else -> {
//                "You can vote"
//            }
//        }
//
//    println(message)
//}
//
//fun kotlinClasses(){
//    println("Kotlin Class")
//
//}

fun main(args:Array<String>){
    val palyer =Player(name = "Pasindu")
    val player2 =Player(name = "Thiwanka",level = 5,score = 50)
    val player3 =Player(name = "deshan",level = 4,lives = 8)
    val player4 =Player(name = "amal",level = 2,score = 1000,lives = 2)

    palyer.show()
    println()
    player2.show()
    println()
    player3.show()
    println()
    player4.show()
    println()
    println(palyer.weapon)
    println(palyer.weapon.name.toUpperCase())
    println(palyer.weapon.damageInfected)

    val axe = Weapon("Axe",12)
    player2.weapon =axe
    println(player2.weapon.name.toUpperCase())
    println(player2.weapon.damageInfected)

    axe.damageInfected=24
    println(axe.damageInfected)
    println(player2.weapon.damageInfected)

    player3.weapon =Weapon("Sword",10)

    println(player3.weapon.name.toUpperCase())
    println(player3.weapon.damageInfected)

    player3.weapon =Weapon("Spear",36)

    println(player3.weapon.name.toUpperCase())
    println(player3.weapon.damageInfected)


//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)

}

//-----------------------------------------------------------------

