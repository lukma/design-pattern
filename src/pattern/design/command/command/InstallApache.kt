package pattern.design.command.command

import pattern.design.command.receiver.Apache

class InstallApache(private val apache: Apache) : Command {
    override fun execute() {
        apache.download()
    }
}