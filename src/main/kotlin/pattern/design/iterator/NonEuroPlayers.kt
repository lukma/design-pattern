package pattern.design.iterator

class NonEuroPlayers : Players<Array<Player?>> {
    private val players: Array<Player?> = arrayOfNulls(6)

    init {
        add(Player(3, "Eric Baily"))
        add(Player(5, "Marcos Rojo"))
        add(Player(7, "Alexis Sanches"))
        add(Player(20, "Sergio Romero"))
        add(Player(25, "Antonio Valencia"))
        add(Player(31, "Nemanja Matic"))
    }

    private fun getNullSize(): Int {
        var count = 0
        for (player in players) {
            if (player == null) {
                count++
            }
        }
        return count
    }

    override fun add(player: Player) {
        players[players.size - getNullSize()] = player
    }

    override fun remove(player: Player) {
        val index = players.indexOf(player)
        players.sliceArray(index..index + 1)
    }

    override fun gets(): Array<Player?> = players

    override fun createIterator(): PlayerIterator = PlayerIterator(players)
}