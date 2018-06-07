package pattern.design.iterator

class EuroNonEnglishPlayers : Players<HashMap<Int, Player>> {
    private val players: HashMap<Int, Player> = hashMapOf()

    init {
        add(Player(1, "David De Gea"))
        add(Player(6, "Paul Pogba"))
        add(Player(8, "Juan Mata"))
        add(Player(9, "Romero Lukaku"))
        add(Player(11, "Anthony Martial"))
        add(Player(17, "Dalley Blind"))
        add(Player(21, "Ander Herrera"))
        add(Player(27, "Maurone Fellaini"))
    }

    override fun add(player: Player) {
        players[player.number] = player
    }

    override fun remove(player: Player) {
        players.remove(player.number)
    }

    override fun gets(): HashMap<Int, Player> = players

    override fun createIterator(): PlayerIterator = PlayerIterator(players.values.toTypedArray())
}