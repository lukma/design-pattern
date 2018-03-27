package pattern.design.factory.factory.store

import pattern.design.factory.factory.product.EnglishFootballClub
import pattern.design.factory.factory.product.ItalianFootballClub

class UefaStore : FifaStore("International", 5000) {
    companion object {
        const val ENGLISH_TYPE = 1
        const val ITALIAN_TYPE = 2
    }

    init {
        factory.supportedType[ENGLISH_TYPE] = EnglishFootballClub::class.java
        factory.supportedType[ITALIAN_TYPE] = ItalianFootballClub::class.java
    }
}