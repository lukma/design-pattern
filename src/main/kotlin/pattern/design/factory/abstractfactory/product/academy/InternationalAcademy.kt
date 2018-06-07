package pattern.design.factory.abstractfactory.product.academy

class InternationalAcademy(location: String) : FootballAcademy(location) {
    override fun teachers(): Int = 20

    override fun capacity(): Int = 100

    override fun facilities(): List<String> = mutableListOf("Private training camp", "Teacher licenced fifa")
}