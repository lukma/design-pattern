package pattern.design.observer

class FootballClubImpl(private val name: String, private val manager: String) : FootballClub {
    private var players: ArrayList<Player> = ArrayList()

    var nextGame: String = ""

    override fun registerPlayer(player: Player) {
        players.add(player)
    }

    override fun unregisterPlayer(player: Player) {
        players.remove(player)
    }

    override fun notifyObservers() {
        println("$manager as manager at $name confirm squad that will be involved for next game against $nextGame, how abaout you?\n")
        players.forEach { item -> item.availability(nextGame) }
    }
}