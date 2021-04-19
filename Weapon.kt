class Weapon (val name:String,var damageInfected :Int){
    override fun toString(): String {
        return """
              name:$name
              damageInfected :$damageInfected
              $name has $damageInfected damage

        """.trimIndent()
    }

}