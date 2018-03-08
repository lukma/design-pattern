package pattern.design.strategy

class AndroidDeveloper : Developer() {
    init {
        programmingLanguage = mutableListOf("Java", "Kotlin", "XML")
        component = WebEngineer()
    }
}