package pattern.design.observer

interface FootballClub {
    fun registerPlayer(player: Player)

    fun unregisterPlayer(player: Player)

    fun notifyObservers()
}