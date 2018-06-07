package pattern.design.state

class LowPowerPlanState(private val machine: Machine) : PlanState {
    override fun charge() {
        machine.currentPower += 100
        println("Your power is added to 100")

        if (machine.currentPower >= 100) {
            machine.currentPlanState = machine.highPlanState
        }
    }

    override fun process() {
        if (machine.currentPower > 0) {
            machine.currentPower -= 1
            println("Your machine process 1 task")
        } else {
            println("Your power need to be charged")
        }
    }
}