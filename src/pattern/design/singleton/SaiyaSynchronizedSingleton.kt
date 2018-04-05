package pattern.design.singleton

class SaiyaSynchronizedSingleton private constructor() {
    companion object {
        private var saiyaSynchronized: SaiyaSynchronizedSingleton? = null

        @Synchronized fun newInstance(): SaiyaSynchronizedSingleton? {
            if (saiyaSynchronized == null) {
                saiyaSynchronized = SaiyaSynchronizedSingleton()
            }

            return saiyaSynchronized
        }
    }

    val doing = arrayListOf<String>()

    fun print() {
        println("===================")
        println("What saiya synchronized doing:")
        doing.forEach {
            println(it)
        }
    }
}