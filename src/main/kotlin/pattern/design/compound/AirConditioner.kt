package pattern.design.compound

class AirConditioner : Device {
    private var status = false

    override fun getInfo(): String = "Air Conditioner is turn ${if (status) "on" else "off"}"

    override fun turnOn() {
        status = true
        println("Air Conditioner is turn on")
    }

    override fun turnOff() {
        status = false
        println("Air Conditioner is turn off")
    }
}