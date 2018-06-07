package pattern.design.factory.abstractfactory.product.academy

abstract class FootballAcademy(private val location: String) {
    abstract fun teachers(): Int

    abstract fun capacity(): Int

    abstract fun facilities(): List<String>

    fun build(): String {
        return "Build academy at $location that have min ${teachers()} teachers and can accommodate min ${capacity()} students." +
                "That academy supported :${facilities().map { "\n - $it" }}"
    }
}