package pattern.design.strategy

class BackendDeveloper : Developer() {
    init {
        programmingLanguage = mutableListOf("GoLang", "ErLang", "Java", "Scala")
        component = MobileEngineer()
    }

    fun writeDoc() {
        println("API Mock and Doc :")
        println("Apiary")
        println("Swagger")
    }
}