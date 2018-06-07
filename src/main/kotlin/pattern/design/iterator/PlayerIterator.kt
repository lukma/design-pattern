package pattern.design.iterator

class PlayerIterator(private val players: Array<Player?>) : Iterator<Player> {
    private var position = 0

    override fun hasNext(): Boolean = position < players.size

    override fun next(): Player {
        val player = players[position]
        position++
        return player!!
    }
}