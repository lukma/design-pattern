package pattern.design.compound

class Lamp : Device {
    private var status = false

    override fun getInfo(): String = "Lamp is turn ${if (status) "on" else "off"}"

    override fun turnOn() {
        status = true
        println("Lamp is turn on")
    }

    override fun turnOff() {
        status = false
        println("Lamp is turn off")
    }
}