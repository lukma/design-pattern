package pattern.design.observer

class JuniorPlayerImpl(private val footballClub: FootballClub) : Player {
    init {
        this.footballClub.registerPlayer(this)
    }

    override fun availability(nextGame: String) {
        println("It's good chance for me, so i really excited for next game against $nextGame")
    }

    override fun unregister() {
        this.footballClub.unregisterPlayer(this)
    }
}