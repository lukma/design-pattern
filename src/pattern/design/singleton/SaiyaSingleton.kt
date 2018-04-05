package pattern.design.singleton

class SaiyaSingleton private constructor() {
    companion object {
        private var saiya: SaiyaSingleton? = null

        fun newInstance(): SaiyaSingleton? {
            if (saiya == null) {
                saiya = SaiyaSingleton()
            }

            return saiya
        }
    }

    val doing = arrayListOf<String>()

    fun print() {
        println("===================")
        println("What saiya doing:")
        doing.forEach {
            println(it)
        }
    }
}