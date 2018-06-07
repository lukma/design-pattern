package pattern.design.iterator

class EuroEnglishPlayers : Players<ArrayList<Player>> {
    private val players: ArrayList<Player> = arrayListOf()

    init {
        add(Player(4, "Phil Jones"))
        add(Player(12, "Chris Smalling"))
        add(Player(14, "Jesse Lingard"))
        add(Player(16, "Michael Carrick"))
        add(Player(18, "Ashley Young"))
        add(Player(19, "Marcus Rasford"))
        add(Player(23, "Luke Shaw"))
    }

    override fun add(player: Player) {
        players.add(player)
    }

    override fun remove(player: Player) {
        players.remove(player)
    }

    override fun gets(): ArrayList<Player> = players

    override fun createIterator(): PlayerIterator {
        val arr: Array<Player?> = arrayOfNulls(players.size)
        players.toArray(arr)
        return PlayerIterator(arr)
    }
}