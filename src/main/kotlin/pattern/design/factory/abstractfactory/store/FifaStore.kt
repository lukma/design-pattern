package pattern.design.factory.abstractfactory.store

import pattern.design.factory.abstractfactory.factory.FootballClubAbstractFactory
import pattern.design.factory.abstractfactory.product.club.FootballClub

abstract class FifaStore {
    protected val factory = FootballClubAbstractFactory()

    abstract fun register(type: Int): FootballClub
}