package pattern.design.factory.simplefactory.product

abstract class FootballClub {
    private var manager: String = ""
    private val players: ArrayList<String> = ArrayList()

    fun printInfo() {
        println("Club : ${javaClass.simpleName}")
        println("Max Foreign Player : ${maxForeignPlayer()}")
        println("Min Youth Player : ${minYouthPlayer()}")
        println("Available Competition :")
        availableCompetition().forEach { println("- $it") }
        println("Manager : $manager")
        println("Players :")
        players.forEach { println("- $it") }
    }

    abstract fun maxForeignPlayer(): Int

    abstract fun minYouthPlayer(): Int

    abstract fun availableCompetition(): List<String>

    fun hireManager(name: String) {
        this.manager = name
    }

    fun buyPlayer(name: String) {
        players.add(name)
    }
}