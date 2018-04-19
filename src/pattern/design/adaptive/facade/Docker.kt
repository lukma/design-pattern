package pattern.design.adaptive.facade

class Docker {
    fun start() {
        println("Start databse...")
    }

    fun stop() {
        println("Stop databse...")
    }

    fun runContainers() {
        println("Run containers...")
    }
}