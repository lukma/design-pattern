package pattern.design.state

class Machine {
    val balancePlanState: PlanState = BalancePowerPlanState(this)
    val highPlanState: PlanState = HighPowerPlanState(this)
    val lowPlanState: PlanState = LowPowerPlanState(this)

    var currentPlanState: PlanState = lowPlanState
    var currentPower: Int = 0

    fun charge() {
        currentPlanState.charge()
    }

    fun process() {
        currentPlanState.process()
    }
}