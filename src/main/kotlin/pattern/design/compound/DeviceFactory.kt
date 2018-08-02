package pattern.design.compound

class DeviceFactory : AbstractDeviceFactory() {
    override fun createLamp(): Device = Lamp()

    override fun createAirConditioner(): Device = AirConditioner()
}