package pattern.design.adapter.simple

class SamuraiAdapter(private val samurai: Samurai) : Fighter {
    override fun hit() {
        samurai.cut()
    }

    override fun defend() {
        samurai.defend()
    }
}