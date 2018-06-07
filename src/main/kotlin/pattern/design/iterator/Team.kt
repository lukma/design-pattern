package pattern.design.iterator

class Team(private val groupPlayers: HashMap<String, Players<*>> = hashMapOf()) {
    fun print() {
        for (players in groupPlayers) {
            println(players.key)
            printPlayers(players.value.createIterator())
        }
    }

    private fun printPlayers(iterator: PlayerIterator) {
        while (iterator.hasNext()) {
            val player = iterator.next()
            println("${player.number} - ${player.name}")
        }
    }
}