package pattern.design.singleton

class GodSingleton private constructor() {
    companion object {
        private var god: GodSingleton? = null

        fun newInstance(): GodSingleton? {
            if (god == null) {
                god = GodSingleton()
            }

            return god
        }
    }

    val doing = arrayListOf<String>()

    fun print() {
        println("===================")
        println("What god doing:")
        doing.forEach {
            println(it)
        }
    }
}