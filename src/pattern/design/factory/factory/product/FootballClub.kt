package pattern.design.factory.factory.product

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

    fun createLegacy(standart: String) {
        println("Create legacy with standart $standart...")
    }

    fun saveBankAccount(minMoney: Int) {
        println("Save bank account $minMoney...")
    }

    fun hireManager(name: String) {
        this.manager = name
    }

    fun buyPlayer(name: String) {
        players.add(name)
    }
}