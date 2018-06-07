package pattern.design.factory.factory.product

class ItalianFootballClub : FootballClub() {
    override fun maxForeignPlayer(): Int = 5

    override fun minYouthPlayer(): Int = 11

    override fun availableCompetition(): List<String> = mutableListOf("Serie A", "Coppa Italia", "UEFA Champions League")
}