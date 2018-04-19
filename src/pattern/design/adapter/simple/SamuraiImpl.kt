package pattern.design.adapter.simple

class SamuraiImpl : Samurai {
    override fun cut() {
        println("Cut target using sword")
    }

    override fun defend() {
        println("Hold back with sword")
    }
}