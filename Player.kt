class Player (val name :String,val level: Int=1,val lives :Int=3,val score :Int=0){
   var weapon=Weapon("Fist",1)



    fun show(){
        println("""
            name:$name
            lives:$lives
            score:$score
            level:$level
        """.trimIndent())
    }
}