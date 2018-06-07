package pattern.design.singleton

object SaiyaSingleton {
    val doing = arrayListOf<String>()

    fun print() {
        println("===================")
        println("What saiya doing:")
        doing.forEach {
            println(it)
        }
    }
}