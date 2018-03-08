package pattern.design.strategy

abstract class Developer {
    protected var programmingLanguage: MutableList<String>? = null
    protected var component: DeveloperComponent? = null

    fun doing() {
        println("===================")
        println("Task :")
        component?.task()
        println("Explore :")
        programmingLanguage?.forEach { item -> println(item) }
        println("===================")
    }
}