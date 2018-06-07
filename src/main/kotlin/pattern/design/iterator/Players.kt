package pattern.design.iterator

interface Players<T> {
    fun add(player: Player)

    fun remove(player: Player)

    fun gets(): T

    fun createIterator(): PlayerIterator
}