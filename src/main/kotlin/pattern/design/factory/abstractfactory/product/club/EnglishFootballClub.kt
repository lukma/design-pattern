package pattern.design.factory.abstractfactory.product.club

class EnglishFootballClub : FootballClub() {
    override fun maxForeignPlayer(): Int = 10

    override fun minYouthPlayer(): Int = 9

    override fun availableCompetition(): List<String> = mutableListOf("Premier League", "Carabao Cup", "FA Cup", "UEFA Champions League")
}