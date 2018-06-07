package pattern.design.factory.abstractfactory.store

import pattern.design.factory.abstractfactory.product.academy.FootballAcademy
import pattern.design.factory.abstractfactory.product.academy.InternationalAcademy
import pattern.design.factory.abstractfactory.product.club.FootballClub
import pattern.design.factory.abstractfactory.product.club.EnglishFootballClub
import pattern.design.factory.abstractfactory.product.club.ItalianFootballClub

class UefaStore : FifaStore() {
    companion object {
        const val ENGLISH_TYPE = 1
        const val ITALIAN_TYPE = 2
    }

    init {
        factory.supportedClubType[ENGLISH_TYPE] = EnglishFootballClub::class.java
        factory.supportedClubType[ITALIAN_TYPE] = ItalianFootballClub::class.java
    }

    override fun register(type: Int): FootballClub {
        val academies = arrayListOf<FootballAcademy>(InternationalAcademy("Local"), InternationalAcademy("Asia"))

        val fc = factory.create(type, academies)
        fc.buildStadium()
        fc.findSponsor()
        fc.followCertification()

        return fc
    }
}