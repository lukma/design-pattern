package pattern.design.decorator

class PassionBoostUp(private val hero: Hero) : HeroUpgrade() {
    override fun desc(): String {
        return "Hero get level up power and power to 50000"
    }

    override fun getBlood(): Int = hero.getBlood() + 50000

    override fun getPower(): Int = hero.getPower() + 50000
}