class Player (val name :String,val level: Int=1,val lives :Int=3,val score :Int=0,){
    var weapon=Weapon("Fist",1)
    private val inventory =ArrayList<Loot>()


    fun show(){
       if(lives>0){
           println("$name is alive")
       }else{
           println("$name is dead")
       }
    }

    override fun toString(): String {
       return """
            name:$name
            lives:$lives
            score:$score
            level:$level
            weapon:${weapon.name}
            damage :${weapon.damageInfected}
        """
    }

    fun getLoot(item:Loot){
        inventory.add(item)
    }

    fun dropLoot(item: Loot):Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }



    fun showInventory(){
        println("=============================")

        println("$name Inventory")
        println(inventory.get(0))
        println(inventory.get(1))

        for (item in inventory){
            println(item)
        }
        println("=============================")

    }
}