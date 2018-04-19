package pattern.design.command.command

import pattern.design.command.receiver.NodeJs

class InstallNodeJs(private val nodeJs: NodeJs) : Command {
    override fun execute() {
        nodeJs.download()
    }
}