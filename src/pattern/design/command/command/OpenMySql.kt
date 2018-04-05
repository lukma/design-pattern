package pattern.design.command.command

import pattern.design.command.receiver.MySql

class OpenMySql(private val mySql: MySql) : Command {
    override fun execute() {
        mySql.connect()
    }
}