package pattern.design.factory.simplefactory.factory

import pattern.design.factory.simplefactory.product.FootballClub

class FootballClubSimpleFactory {
    var supportedType: HashMap<Int, Any> = HashMap()

    fun create(type: Int): FootballClub {
        if (supportedType.containsKey(type)) {
            val clazz = supportedType[type] as Class<FootballClub>
            return clazz.newInstance()
        } else {
            throw Exception("Unsupported type")
        }
    }
}