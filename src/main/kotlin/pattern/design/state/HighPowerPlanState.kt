package pattern.design.state

class HighPowerPlanState(private val machine: Machine) : PlanState {
    override fun charge() {
        println("Your power is above maximum requirement")
    }

    override fun process() {
        machine.currentPower -= 10
        println("Your machine process 10 task")

        if (machine.currentPower <= 50) {
            machine.currentPlanState = machine.balancePlanState
        }
    }
}