package pattern.design.proxy

import java.rmi.Naming
import java.rmi.server.UnicastRemoteObject

class MyRemoteImpl : UnicastRemoteObject(), MyRemote {
    override fun sayHello(): String = "Hai bro"
}

fun main(args: Array<String>) {
    try {
        val obj = MyRemoteImpl()
        Naming.rebind("RemoteHello", obj)

        System.err.println("Server ready")
    } catch (e: Exception) {
        System.err.println("Server exception: " + e.toString())
    }
}