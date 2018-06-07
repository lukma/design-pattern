package pattern.design.command.invoker

import pattern.design.command.command.Command

class ApplicationInvoker {
    private lateinit var command: Command

    fun setCommand(command: Command) {
        this.command = command
    }

    fun install() {
        command.execute()
    }
}