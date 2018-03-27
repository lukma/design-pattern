package pattern.design.factory.simplefactory.product

class EnglishFootballClub : FootballClub() {
    override fun maxForeignPlayer(): Int = 10

    override fun minYouthPlayer(): Int = 9

    override fun availableCompetition(): List<String> = mutableListOf("Premier League", "Carabao Cup", "FA Cup", "UEFA Champions League")
}