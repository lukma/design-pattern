package pattern.design.compound

abstract class AbstractDeviceFactory {
    abstract fun createLamp(): Device

    abstract fun createAirConditioner(): Device
}