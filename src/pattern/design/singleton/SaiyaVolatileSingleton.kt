package pattern.design.singleton

class SaiyaVolatileSingleton private constructor() {
    companion object {
        @Volatile
        private var saiyaSynchronized: SaiyaVolatileSingleton? = null

        @Synchronized
        fun newInstance(): SaiyaVolatileSingleton? {
            if (saiyaSynchronized == null) {
                saiyaSynchronized = SaiyaVolatileSingleton()
            }

            return saiyaSynchronized
        }
    }

    val doing = arrayListOf<String>()

    fun print() {
        println("===================")
        println("What saiya volatile doing:")
        doing.forEach {
            println(it)
        }
    }
}