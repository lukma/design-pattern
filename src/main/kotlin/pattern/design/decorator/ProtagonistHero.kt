package pattern.design.decorator

class ProtagonistHero : Hero() {
    override fun desc(): String {
        return "I'm protagonist hero with blood:${getBlood()} and power:${getPower()}"
    }

    override fun getBlood(): Int = 70000

    override fun getPower(): Int = 70000
}