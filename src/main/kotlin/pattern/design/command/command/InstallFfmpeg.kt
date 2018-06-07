package pattern.design.command.command

import pattern.design.command.receiver.FFMpeg

class InstallFfmpeg(private val FFMpeg: FFMpeg) : Command {
    override fun execute() {
        FFMpeg.download()
        FFMpeg.build()
    }
}