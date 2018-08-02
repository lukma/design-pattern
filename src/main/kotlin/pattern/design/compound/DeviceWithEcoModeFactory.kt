package pattern.design.compound

class DeviceWithEcoModeFactory : AbstractDeviceFactory() {
    override fun createLamp(): Device = EcoModeDecorator(Lamp())

    override fun createAirConditioner(): Device = EcoModeDecorator(AirConditioner())
}