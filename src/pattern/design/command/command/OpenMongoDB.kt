package pattern.design.command.command

import pattern.design.command.receiver.MongoDB

class OpenMongoDB(private val mongoDB: MongoDB) : Command {
    override fun execute() {
        mongoDB.connect()
    }
}