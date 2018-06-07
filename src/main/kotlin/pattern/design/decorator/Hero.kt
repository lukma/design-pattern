package pattern.design.decorator

abstract class Hero {
    open fun desc(): String {
        return "I'm hero"
    }

    abstract fun getBlood(): Int

    abstract fun getPower(): Int
}