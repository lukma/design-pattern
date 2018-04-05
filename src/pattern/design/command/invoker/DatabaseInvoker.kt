package pattern.design.command.invoker

import pattern.design.command.command.Command

class DatabaseInvoker {
    private lateinit var command: Command

    fun setCommand(command: Command) {
        this.command = command
    }

    fun open() {
        command.execute()
    }
}