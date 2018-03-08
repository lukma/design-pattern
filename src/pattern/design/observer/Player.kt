package pattern.design.observer

interface Player {
    fun availability(nextGame: String)

    fun unregister()
}