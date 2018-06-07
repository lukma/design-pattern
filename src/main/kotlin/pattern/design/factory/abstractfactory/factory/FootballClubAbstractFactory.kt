package pattern.design.factory.abstractfactory.factory

import pattern.design.factory.abstractfactory.product.academy.FootballAcademy
import pattern.design.factory.abstractfactory.product.club.FootballClub

class FootballClubAbstractFactory {
    var supportedClubType: HashMap<Int, Any> = HashMap()

    fun create(clubType: Int, academies: ArrayList<FootballAcademy>): FootballClub {
        if (supportedClubType.containsKey(clubType)) {
            val clazz = supportedClubType[clubType] as Class<FootballClub>

            val fc = clazz.newInstance()

            for (academy in academies) {
                fc.academies.add(academy)
            }

            return fc
        } else {
            throw Exception("Unsupported type")
        }
    }
}