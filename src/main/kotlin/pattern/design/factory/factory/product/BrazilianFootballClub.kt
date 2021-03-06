package pattern.design.factory.factory.product

class BrazilianFootballClub : FootballClub() {
    override fun maxForeignPlayer(): Int = 15

    override fun minYouthPlayer(): Int = 9

    override fun availableCompetition(): List<String> = mutableListOf("Brazilian League", "Brazilian Cup", "Copa Libertadores")
}