package pattern.design.adaptive.facade

class OsFacade(private val apache: Apache, private val docker: Docker, private val mongoDB: MongoDB) {
    fun start() {
        apache.start()
        docker.start()
        mongoDB.start()
    }

    fun stop() {
        apache.stop()
        docker.stop()
        mongoDB.stop()
    }
}