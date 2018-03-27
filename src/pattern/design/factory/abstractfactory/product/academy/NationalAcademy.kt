package pattern.design.factory.abstractfactory.product.academy

class NationalAcademy(location: String) : FootballAcademy(location) {
    override fun teachers(): Int = 10

    override fun capacity(): Int = 50

    override fun facilities(): List<String> = mutableListOf("Private training camp", "Teacher licenced local organization")
}