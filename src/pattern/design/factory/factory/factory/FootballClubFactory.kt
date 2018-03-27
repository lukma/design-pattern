package pattern.design.factory.factory.factory

import pattern.design.factory.factory.product.FootballClub

class FootballClubFactory {
    var supportedType: HashMap<Int, Any> = HashMap()

    fun create(type: Int, standart: String, minMoney: Int): FootballClub {
        if (supportedType.containsKey(type)) {
            val clazz = supportedType[type] as Class<FootballClub>
            return clazz.newInstance()
        } else {
            throw Exception("Unsupported type")
        }
    }
}