package pattern.design.command.command

import pattern.design.command.receiver.RawFile

class OpenRawFile(private val rawFile: RawFile) : Command {
    override fun execute() {
        rawFile.load()
    }
}