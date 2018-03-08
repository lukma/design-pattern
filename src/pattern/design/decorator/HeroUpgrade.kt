package pattern.design.decorator

abstract class HeroUpgrade : Hero() {
    abstract override fun getBlood(): Int

    abstract override fun getPower(): Int
}