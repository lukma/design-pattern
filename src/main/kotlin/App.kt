import kotlinx.coroutines.experimental.launch
import pattern.design.adaptive.adapter.FighterImpl
import pattern.design.adaptive.adapter.SamuraiAdapter
import pattern.design.adaptive.adapter.SamuraiImpl
import pattern.design.adaptive.facade.Docker
import pattern.design.adaptive.facade.MongoDB
import pattern.design.adaptive.facade.OsFacade
import pattern.design.command.command.InstallApache
import pattern.design.command.command.InstallNodeJs
import pattern.design.command.command.InstallFfmpeg
import pattern.design.command.invoker.ApplicationInvoker
import pattern.design.command.receiver.Apache
import pattern.design.command.receiver.NodeJs
import pattern.design.command.receiver.FFMpeg
import pattern.design.compound.DeviceFactory
import pattern.design.compound.DeviceWithEcoModeFactory
import pattern.design.decorator.*
import pattern.design.factory.factory.store.SouthAmericanStore
import pattern.design.factory.factory.store.UefaStore
import pattern.design.factory.simplefactory.store.FifaStore
import pattern.design.iterator.*
import pattern.design.observer.*
import pattern.design.observer.Player
import pattern.design.singleton.SaiyaSingleton
import pattern.design.singleton.SaiyaSynchronizedSingleton
import pattern.design.singleton.SaiyaVolatileSingleton
import pattern.design.state.Machine
import pattern.design.strategy.*
import pattern.design.template.Picture
import pattern.design.template.UploadPicture
import pattern.design.template.UploadVideo
import pattern.design.template.Video
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
            "Adapter",
            "Facade",
            "Template",
            "Iterator",
            "State",
            "Compound")

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
            println("Singleton pattern - Simple")
            println("===================")
            SaiyaSingleton.doing.add("Training")
            SaiyaSingleton.print()
            SaiyaSingleton.doing.add("Fight")
            SaiyaSingleton.print()
            SaiyaSingleton.doing.add("Die")
            SaiyaSingleton.print()

            println("Singleton pattern - Synchronized")
            println("===================")

            launch {
                SaiyaSynchronizedSingleton.newInstance()!!.addDoing("Training")!!.print()
            }
            launch {
                SaiyaSynchronizedSingleton.newInstance()!!.addDoing("Fight")!!.print()
            }

            Thread.sleep(2000L)

            println("Singleton pattern - Volatile")
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

            val invoker = ApplicationInvoker()

            invoker.setCommand(InstallApache(Apache()))
            invoker.install()

            invoker.setCommand(InstallNodeJs(NodeJs()))
            invoker.install()

            invoker.setCommand(InstallFfmpeg(FFMpeg()))
            invoker.install()
        }
        7 -> {
            println()
            println()
            println("Adaptive pattern - Adapter")
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
        8 -> {
            println()
            println()
            println("Adaptive pattern - Facade")
            println("===================")

            val os = OsFacade(pattern.design.adaptive.facade.Apache(), Docker(), MongoDB())
            os.start()
            println("Then...")
            os.stop()
        }
        9 -> {
            println()
            println()
            println("Template method pattern - Simple")
            println("===================")

            val uploadPicture = UploadPicture()
            uploadPicture.isDeleteLocalFile = true
            uploadPicture.runUpload(Picture("hallo", "file://picture.png"))

            println()

            val uploadVideo = UploadVideo()
            uploadVideo.runUpload(Video("hallo", "file://video.png", "file://cover.png"))
        }
        10 -> {
            println()
            println()
            println("Iterator pattern - Simple")
            println("===================")

            val groupPlayers = hashMapOf<String, Players<*>>()
            groupPlayers["Euro English Players"] = EuroEnglishPlayers()
            groupPlayers["Euro Non English Players"] = EuroNonEnglishPlayers()
            groupPlayers["Non Euro Players"] = NonEuroPlayers()

            val team = Team(groupPlayers)
            team.print()
        }
        11 -> {
            println()
            println()
            println("State pattern")
            println("===================")

            val machine = Machine()
            machine.charge()
            machine.charge()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.charge()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
            machine.process()
        }
        12 -> {
            val lampBathroom = DeviceWithEcoModeFactory().createLamp()
            val lampLivingRoom = DeviceFactory().createLamp()
            val acBathrrom = DeviceWithEcoModeFactory().createAirConditioner()
            val acLivingRoom = DeviceFactory().createLamp()

            println("======================")
            lampBathroom.turnOn()
            lampBathroom.turnOff()
            println("Status lamp Bathroom")
            println(lampBathroom.getInfo())

            println("======================")
            acBathrrom.turnOff()
            acBathrrom.turnOn()
            println("Status ac Living room")
            println(acBathrrom.getInfo())

            println("======================")
            lampLivingRoom.turnOff()
            lampLivingRoom.turnOn()
            println("Status lamp Living room")
            println(lampLivingRoom.getInfo())

            println("======================")
            acLivingRoom.turnOff()
            acLivingRoom.turnOn()
            println("Status ac Living room")
            println(acLivingRoom.getInfo())
        }
    }
}