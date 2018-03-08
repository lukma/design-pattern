package pattern.design.decorator

class AntagonistHero : Hero() {
    override fun desc(): String {
        return "I'm antagonist hero with blood:${getBlood()} and power:${getPower()}"
    }

    override fun getBlood(): Int = 100000

    override fun getPower(): Int = 100000
}