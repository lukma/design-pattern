package pattern.design.state

class BalancePowerPlanState(private val machine: Machine) : PlanState {
    override fun charge() {
        machine.currentPower += 50
        println("Your power is added to 50")

        if (machine.currentPower >= 100) {
            machine.currentPlanState = machine.highPlanState
        }
    }

    override fun process() {
        machine.currentPower -= 5
        println("Your machine process 5 task")

        if (machine.currentPower <= 10) {
            machine.currentPlanState = machine.lowPlanState
        }
    }
}