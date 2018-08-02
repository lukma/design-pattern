package pattern.design.proxy

import java.rmi.Naming

class MyRemoteClient {
    fun go() {
        try {
            val service = Naming.lookup("rmi://127.0.0.1/RemoteHello") as MyRemote
            service.sayHello()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}

fun main(args: Array<String>) {
    MyRemoteClient().go()
}