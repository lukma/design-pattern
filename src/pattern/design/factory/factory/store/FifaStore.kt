package pattern.design.factory.factory.store

import pattern.design.factory.factory.factory.FootballClubFactory
import pattern.design.factory.factory.product.FootballClub

open class FifaStore(private val standart: String, private val minMoney: Int) {
    protected val factory = FootballClubFactory()

    fun register(type: Int): FootballClub {
        val fc = factory.create(type, standart, minMoney)
        fc.createLegacy(standart)
        fc.saveBankAccount(minMoney)
        return fc
    }
}