package pattern.design.adapter

class FighterImpl : Fighter {
    override fun hit() {
        println("Hit target using hand")
    }

    override fun defend() {
        println("Run away")
    }
}