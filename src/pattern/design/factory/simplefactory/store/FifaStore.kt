package pattern.design.factory.simplefactory.store

import pattern.design.factory.simplefactory.factory.FootballClubSimpleFactory
import pattern.design.factory.simplefactory.product.EnglishFootballClub
import pattern.design.factory.simplefactory.product.FootballClub
import pattern.design.factory.simplefactory.product.ItalianFootballClub

class FifaStore {
    private val factory = FootballClubSimpleFactory()

    companion object {
        const val ENGLISH_TYPE = 1
        const val ITALIAN_TYPE = 2
    }

    init {
        factory.supportedType[ENGLISH_TYPE] = EnglishFootballClub::class.java
        factory.supportedType[ITALIAN_TYPE] = ItalianFootballClub::class.java
    }

    fun register(type: Int): FootballClub = factory.create(type)
}