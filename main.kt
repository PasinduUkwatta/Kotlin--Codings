////fun main() {
////    println("Hello World")
////    println("My first kotlin Programme")
////    val name = "Pasindu Thiwanka"
////
////    println(name)
////    val timWeeklySalary =32
////    val timMonthlySalary : Int = timWeeklySalary*4
////    val date = 6
////    val month = "March"
////    val year = 1996
////
////    val num1 =35.0
////    val num2 =56.0
////    val num3:Double=num1/num2
////    println(timMonthlySalary)
////
////    val apples =6.346364
////    val oranges =5.345636
////    val fruits:Double=apples*oranges
////    val divide =apples/oranges
////    println("--------------------------------")
////    println(fruits)
////    println(divide)
////
////    val firstName = "Thiwanka"
////    val lastName = "deshan"
////    val jim = "pasindu"
////
////    //String Interpolation
////    println("My name is $firstName $lastName ")
////    println("My name is $jim ")
////    println("My Birth Day is $date $month $year ")
////    println("My Number is :$num3")
////    happyNewYear()
////}
////
////
////fun happyNewYear() {
////    println("Happy New Year 2021")
////}
//
////------------------------------------------------------------------------
//
////fun main() {
////    val lives = 3
////    val isGameOver = lives < 1
////    println(isGameOver)
////
////    if (isGameOver) {
////        println("Game Over !")
////    } else {
////        println("You can Play !!!")
////    }
////
////    age()
////    kotlinClasses()
////}
////
////fun age(){
////    println("How old are You ?")
////
////    val age = readLine()!!.toInt()
////    println("age is $age")
////
////    val message:String =
//////        if(age<18){
//////        "You too young to vote"
//////    }else if (age ==100){
//////        "Congratulations"
//////    }
//////    else{
//////        "You can vote"
//////    }
////        when {
////            age<18 -> {
////                "You too young to vote"
////            }
////            age ==100 -> {
////                "Congratulations"
////            }
////            else -> {
////                "You can vote"
////            }
////        }
////
////    println(message)
////}
////
////fun kotlinClasses(){
////    println("Kotlin Class")
////
////}
//
//fun main(args:Array<String>){
//    val palyer =Player(name = "Pasindu")
//    val player2 =Player(name = "Thiwanka",level = 5,score = 50)
//    val player3 =Player(name = "deshan",level = 4,lives = 8)
//    val player4 =Player(name = "amal",level = 2,score = 1000,lives = 2)
//
//    palyer.show()
//    println()
//    player2.show()
//    println()
//    player3.show()
//    println()
//    player4.show()
//    println()
//    println(palyer.weapon)
//    println(palyer.weapon.name.toUpperCase())
//    println(palyer.weapon.damageInfected)
//
//    val axe = Weapon("Axe",12)
//    player2.weapon =axe
//    println(player2.weapon.name.toUpperCase())
//    println(player2.weapon.damageInfected)
//
//    axe.damageInfected=24
//    println(axe.damageInfected)
//    println(player2.weapon.damageInfected)
//
//    player3.weapon =Weapon("Sword",10)
//
//    println(player3.weapon.name.toUpperCase())
//    println(player3.weapon.damageInfected)
//
//    player3.weapon =Weapon("Spear",36)
//
//    println(player3.weapon.name.toUpperCase())
//    println(player3.weapon.damageInfected)
//
//    println()
//
//    println(player2.show())
//
//
////    println(tim.name)
////    println(tim.lives)
////    println(tim.level)
////    println(tim.score)
//
//    val redPotion =Loot("Red Potion",LootType.POTION,value = 7.50)
//    val chestArmor =Loot("+3 chest armor",LootType.ARMOR,value = 80.00)
//    player2.getLoot(redPotion)
//    player2.getLoot(chestArmor)
//    player2.getLoot(Loot("Ring of protetion",LootType.RING,value = 40.25))
//    player2.getLoot(Loot("Invisibility Potion",LootType.POTION,value =35.95))
//    player2.showInventory()
//
//    if(player2.dropLoot(redPotion)){
//        player2.showInventory()
//    }else{
//        println("You dont have ${redPotion.name}")
//    }
//
//    val bluePotion = Loot("Blue Potion",LootType.POTION,value = 6.0)
//    if(player2.dropLoot(bluePotion)){
//        player2.showInventory()
//    }else{
//        println("You dont have ${bluePotion.name}")
//    }
//
//    player2.dropLoot("Invisibility Potion")
//    println(player2.toString())
//    println(player2)
//    println(redPotion)
//    println(player2.weapon)
//    player2.showInventory()
////
////    forLoop()
////    forLoopChallenge()
//
//}
//
////-----------------------------------------------------------------
//
//fun forLoop(){
//    for(i in 0 until 11){
//        println(i)
//        println("$i squared ${i*i}")
//    }
//
//    for (i in 10 downTo 0){
//        println(i)
//    }
//
//    for(i in 10 downTo 0 step 2){
//        println(i)
//    }
//
//
//}
//
//fun forLoopChallange(){
//    for(i in 1..100){
//        if(i%3==0 && i%5==0){
//            println(i)
//        }
//    }
//}
//

//
//fun main(args :Array<String>){
////val enemy =Enemy("test enamy",10,2)
////    println(enemy)
////
////    enemy.takeDamage(4)
////    enemy.takeDamage(10)
//
//    val uglyTroll =Troll("ugly troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(20)
//    uglyTroll.takeDamage(10)
//
//    println("======================================")
//
//    val vlad =Vampire("vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//
//    vlad.takeDamage(40)
//    println(vlad)
//    println("======================================")
//    val dracula =VampireKing("Dracula")
//    println(dracula)
//    while (dracula.lives>0){
//        if(dracula.dodge()){
//            continue
//        }
//
//        if(dracula.runAway()){
//
//            println("Dracula Run Away")
//            //end of the infinite loop
//            break
//        }else{
//            dracula.takeDamage(32)
//
//        }
//
//    }
//
//}
//-------------------------------------------------------
fun main(args: Array<String>) {
    val conan = Player("conan")
    conan.getLoot(Loot("invisbility", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 6.0))
    conan.getLoot(Loot("Speed", LootType.POTION, 12.0))
    conan.getLoot(Loot("Red Positon", LootType.POTION, 25.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 40.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 40.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 40.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 40.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 24.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 28.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 55.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 55.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 55.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 55.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 55.0))
    conan.showInventory()
    conan.dropLoot("Sliver Ring")
    conan.showInventory()
    conan.dropLoot("Sliver Ring")
    conan.showInventory()

    val dracula = VampireKing("Dracula")
    println(dracula)

//    do {
//        println("Dracula Started Attacking")
//    }
//    dracula.lives = 0
//    do {
//        println("Dracula started attacking")
//        if (dracula.dodge()) {
//            dracula.lives += 1
//            println("dracula got ${dracula.lives} lives after dodge")
//
//            continue
//        }
//
//        if (dracula.runAway()) {
//
//            println("Dracula Run Away")
//            //end of the infinite loop
//            break
//        } else {
//            dracula.takeDamage(32)
//
//        }
//
//    } while (dracula.lives > 0)

}