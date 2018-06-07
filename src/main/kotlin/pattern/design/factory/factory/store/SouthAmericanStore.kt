package pattern.design.factory.factory.store

import pattern.design.factory.factory.product.BrazilianFootballClub

class SouthAmericanStore : FifaStore("National", 1000) {
    companion object {
        const val BRAZILIAN_TYPE = 1
    }

    init {
        factory.supportedType[BRAZILIAN_TYPE] = BrazilianFootballClub::class.java
    }
}