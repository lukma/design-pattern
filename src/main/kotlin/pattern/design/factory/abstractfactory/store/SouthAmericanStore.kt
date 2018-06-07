package pattern.design.factory.abstractfactory.store

import pattern.design.factory.abstractfactory.product.academy.InternationalAcademy
import pattern.design.factory.abstractfactory.product.academy.NationalAcademy
import pattern.design.factory.abstractfactory.product.club.FootballClub
import pattern.design.factory.abstractfactory.product.club.BrazilianFootballClub

class SouthAmericanStore : FifaStore() {
    companion object {
        const val BRAZILIAN_TYPE = 1
    }

    init {
        factory.supportedClubType[BRAZILIAN_TYPE] = BrazilianFootballClub::class.java
    }

    override fun register(type: Int): FootballClub {
        val academies = arrayListOf(InternationalAcademy("Local"), NationalAcademy("Asia"))

        val fc = factory.create(type, academies)
        fc.buildStadium()
        fc.findSponsor()

        return fc
    }
}