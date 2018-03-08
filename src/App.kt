import pattern.design.observer.*
import pattern.design.strategy.*

fun main(args: Array<String>) {
    println("Strategy pattern")
    println("===================")
    println()

    val cantona = AndroidDeveloper()
    cantona.doing()

    val beckham = BackendDeveloper()
    beckham.doing()
    beckham.writeDoc()

    val ronaldo = FrontendDeveloper()
    ronaldo.doing()

    println()
    println()
    println("Observer pattern")
    println("===================")

    val manchesterUnited = FootballClubImpl("Manchester United", "Jose Mourinho")
    val pogba: Player = SeniorPlayerImpl(manchesterUnited)
    val matic: Player = SeniorPlayerImpl(manchesterUnited)
    val mcTominay: Player = JuniorPlayerImpl(manchesterUnited)

    manchesterUnited.nextGame = "Swansea City"
    manchesterUnited.notifyObservers()
    println()

    // Manager think for big match need experience player
    manchesterUnited.unregisterPlayer(mcTominay)
    val fellaini: Player = SeniorPlayerImpl(manchesterUnited)

    manchesterUnited.nextGame = "Manchester City"
    println("===================")
    manchesterUnited.notifyObservers()

    println()
    println()
    println("Decorator pattern")
    println("===================")

    // kotlin style
    ronaldo.doing().run {
        println("additional skill is mentoring")
    }
}