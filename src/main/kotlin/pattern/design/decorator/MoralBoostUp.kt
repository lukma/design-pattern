package pattern.design.decorator

class MoralBoostUp(private val hero: Hero) : HeroUpgrade() {
    override fun desc(): String {
        return "Hero get level up power and power to 30000"
    }

    override fun getBlood(): Int = hero.getBlood() + 30000

    override fun getPower(): Int = hero.getPower() + 30000
}