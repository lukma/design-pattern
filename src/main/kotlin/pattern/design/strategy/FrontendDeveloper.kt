package pattern.design.strategy

class FrontendDeveloper : Developer() {
    init {
        programmingLanguage = mutableListOf("NodeJS", "HTML", "CSS")
        component = WebEngineer()
    }
}