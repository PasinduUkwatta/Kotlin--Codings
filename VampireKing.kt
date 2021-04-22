import java.util.*

class VampireKing(name: String) : Vampire(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 4)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun dodge():Boolean{
        val rand = Random()
        val chance = rand.nextInt(6)
        if (chance>3){
            println("Dracula Dodge $chance")
            return true
        }
        return false
    }


}