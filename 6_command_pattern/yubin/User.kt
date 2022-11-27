package command_pattern

class User(
    private var command: Command
){
    fun setCommand(command: Command) {
        this.command = command
    }

    fun turnOnNetwork() {
        command.execute()
    }
}

fun main() {
    val network = Network()
    val cellularOnCommand: Command = CellularOnCommand(network)
    val wifiOnCommand: Command = WifiOnCommand(network)

    val user = User(cellularOnCommand)
    user.turnOnNetwork()

    user.setCommand(wifiOnCommand)
    user.turnOnNetwork()

}