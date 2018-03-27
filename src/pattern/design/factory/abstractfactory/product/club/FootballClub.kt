package pattern.design.factory.abstractfactory.product.club

import pattern.design.factory.abstractfactory.product.academy.FootballAcademy

abstract class FootballClub() {
    private var manager: String = ""
    private val players: ArrayList<String> = ArrayList()
    open val academies: ArrayList<FootballAcademy> = arrayListOf()

    fun printInfo() {
        println("Club : ${javaClass.simpleName}")
        println("Max Foreign Player : ${maxForeignPlayer()}")
        println("Min Youth Player : ${minYouthPlayer()}")
        println("Available Competition")
        availableCompetition().forEach { println("- $it") }
        println("Manager : $manager")
        println("Players :")
        players.forEach { println("- $it") }
        println("Academies :")
        academies.forEach { println(it.build()) }
    }

    abstract fun maxForeignPlayer(): Int

    abstract fun minYouthPlayer(): Int

    abstract fun availableCompetition(): List<String>

    fun buildStadium() {
        println("Build stadium...")
    }

    fun findSponsor() {
        println("Find sponsors...")
    }

    fun followCertification() {
        println("Follow certification...")
    }

    fun hireManager(name: String) {
        this.manager = name
    }

    fun buyPlayer(name: String) {
        players.add(name)
    }
}