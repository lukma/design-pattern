package pattern.design.compound

class EcoModeDecorator(private val device: Device) : Device {
    override fun getInfo(): String = device.getInfo()

    override fun turnOn() {
        print("Set eco mode : ")
        device.turnOn()
    }

    override fun turnOff() {
        device.turnOff()
    }
}