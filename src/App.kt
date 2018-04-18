import kotlinx.coroutines.experimental.launch
import pattern.design.adapter.FighterImpl
import pattern.design.adapter.SamuraiAdapter
import pattern.design.adapter.SamuraiImpl
import pattern.design.command.command.OpenMongoDB
import pattern.design.command.command.OpenMySql
import pattern.design.command.command.OpenRawFile
import pattern.design.command.invoker.DatabaseInvoker
import pattern.design.command.receiver.MongoDB
import pattern.design.command.receiver.MySql
import pattern.design.command.receiver.RawFile
import pattern.design.decorator.*
import pattern.design.factory.factory.store.SouthAmericanStore
import pattern.design.factory.factory.store.UefaStore
import pattern.design.factory.simplefactory.store.FifaStore
import pattern.design.observer.*
import pattern.design.singleton.SaiyaSingleton
import pattern.design.singleton.SaiyaSynchronizedSingleton
import pattern.design.singleton.SaiyaVolatileSingleton
import pattern.design.strategy.*
import java.util.*

fun main(args: Array<String>) {
    println("Module")
    val modules = mutableListOf(
            "Strategy",
            "Observer",
            "Decorator",
            "Factory",
            "Singleton",
            "Command",
            "Adapter")

    var index = 1
    for (module in modules) {
        println("$index. $module")
        index++
    }

    print("Where to go : ")

    val input = Scanner(System.`in`)

    when (input.nextInt()) {
        1 -> {
            println()
            println()
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
        }
        2 -> {
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
        }
        3 -> {
            println()
            println()
            println("Decorator pattern")
            println("===================")

            var naruto: Hero = ProtagonistHero()
            println("Naruto current power is ${naruto.getPower()} and blood is ${naruto.getBlood()}")
            naruto = MoralBoostUp(naruto)
            println(naruto.desc())
            println("Naruto current power is ${naruto.getPower()} and blood is ${naruto.getBlood()}")
            naruto = PassionBoostUp(naruto)
            println(naruto.desc())
            println("Naruto current power is ${naruto.getPower()} and blood is ${naruto.getBlood()}")

            println()

            var sasuke: Hero = AntagonistHero()
            println(sasuke.desc())
            println("Sasuke current power is ${sasuke.getPower()} and blood is ${sasuke.getBlood()}")
            sasuke = MoralBoostUp(sasuke)
            println(sasuke.desc())
            println("Sasuke current power is ${sasuke.getPower()} and blood is ${sasuke.getBlood()}")

            println()

            println("Two heroes ready to fight")
            println("Naruto power is ${naruto.getPower()} and blood is ${naruto.getBlood()}")
            println("Sasuke power is ${sasuke.getPower()} and blood is ${sasuke.getBlood()}")
        }
        4 -> {
            println()
            println()
            println("Factory pattern - Simple")
            println("===================")
            val fifa = FifaStore()
            val mufc = fifa.register(FifaStore.ENGLISH_TYPE)
            mufc.hireManager("Mourinho")
            mufc.buyPlayer("Pogba")
            mufc.buyPlayer("Lukaku")
            mufc.buyPlayer("Matic")
            mufc.printInfo()

            println("===================")

            val juventus = fifa.register(FifaStore.ITALIAN_TYPE)
            juventus.hireManager("Allegri")
            juventus.buyPlayer("Dyballa")
            juventus.buyPlayer("Higuain")
            juventus.buyPlayer("Cuardado")
            juventus.printInfo()

            println()
            println()
            println("Factory pattern - factory")
            println("===================")
            val uefa = UefaStore()
            val chelsea = uefa.register(UefaStore.ENGLISH_TYPE)
            chelsea.hireManager("Conte")
            chelsea.buyPlayer("Morata")
            chelsea.buyPlayer("Hazard")
            chelsea.buyPlayer("Fabregas")
            chelsea.printInfo()

            println("===================")

            val milan = uefa.register(UefaStore.ITALIAN_TYPE)
            milan.hireManager("Gattuso")
            milan.buyPlayer("Bonucci")
            milan.buyPlayer("Silva")
            milan.printInfo()

            println("===================")

            val southAmerica = SouthAmericanStore()
            val santos = southAmerica.register(SouthAmericanStore.BRAZILIAN_TYPE)
            santos.hireManager("Pele")
            santos.buyPlayer("Ronaldo")
            santos.buyPlayer("Rivaldo")
            santos.printInfo()

            println()
            println()
            println("Factory pattern - abstract")
            println("===================")
            val uefa2 = pattern.design.factory.abstractfactory.store.UefaStore()
            val chelsea2 = uefa2.register(pattern.design.factory.abstractfactory.store.UefaStore.ENGLISH_TYPE)
            chelsea2.hireManager("Conte")
            chelsea2.buyPlayer("Morata")
            chelsea2.buyPlayer("Hazard")
            chelsea2.buyPlayer("Fabregas")
            chelsea2.printInfo()

            println("===================")

            val milan2 = uefa2.register(pattern.design.factory.abstractfactory.store.UefaStore.ITALIAN_TYPE)
            milan2.hireManager("Gattuso")
            milan2.buyPlayer("Bonucci")
            milan2.buyPlayer("Silva")
            milan2.printInfo()

            println("===================")

            val southAmerica2 = pattern.design.factory.abstractfactory.store.SouthAmericanStore()
            val santos2 = southAmerica2.register(pattern.design.factory.abstractfactory.store.SouthAmericanStore.BRAZILIAN_TYPE)
            santos2.hireManager("Pele")
            santos2.buyPlayer("Ronaldo")
            santos2.buyPlayer("Rivaldo")
            santos2.printInfo()
        }
        5 -> {
            println()
            println()
            println("Factory pattern - Simple")
            println("===================")
            val goku1 = SaiyaSingleton.newInstance()
            goku1!!.doing.add("Training")
            goku1.print()
            val goku2 = SaiyaSingleton.newInstance()
            goku2!!.doing.add("Fight")
            goku2.print()
            val goku3 = SaiyaSingleton.newInstance()
            goku3!!.doing.add("Die")
            goku3.print()

            println("Factory pattern - Synchronized")
            println("===================")

            launch {
                SaiyaSynchronizedSingleton.newInstance()!!.addDoing("Training")!!.print()
            }
            launch {
                SaiyaSynchronizedSingleton.newInstance()!!.addDoing("Fight")!!.print()
            }

            Thread.sleep(2000L)

            println("Factory pattern - Volatile")
            println("===================")

            launch {
                SaiyaVolatileSingleton.newInstance()!!.addDoing("Training")!!.print()
            }
            launch {
                SaiyaVolatileSingleton.newInstance()!!.addDoing("Fight")!!.print()
            }

            Thread.sleep(2000L)
        }
        6 -> {
            println()
            println()
            println("Command pattern - Simple")
            println("===================")

            val invoker = DatabaseInvoker()

            invoker.setCommand(OpenMongoDB(MongoDB()))
            invoker.open()

            invoker.setCommand(OpenMySql(MySql()))
            invoker.open()

            invoker.setCommand(OpenRawFile(RawFile()))
            invoker.open()
        }
        7 -> {
            println()
            println()
            println("Adapter pattern - Simple")
            println("===================")

            val bob = FighterImpl()
            println("What Bob do...")
            bob.hit()
            bob.defend()

            println()

            val john = SamuraiAdapter(SamuraiImpl())
            println("What John do...")
            john.hit()
            john.defend()
        }
    }
}