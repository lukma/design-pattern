package pattern.design.observer

class SeniorPlayerImpl(private val footballClub: FootballClub) : Player {
    init {
        this.footballClub.registerPlayer(this)
    }

    override fun availability(nextGame: String) {
        println("You know me more, i always ready for next game against $nextGame")
    }

    override fun unregister() {
        this.footballClub.unregisterPlayer(this)
    }
}