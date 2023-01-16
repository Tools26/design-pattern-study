package command_pattern

class WifiOnCommand(
    private val network: Network
): Command {
    override fun execute() {
        network.turnOnWifi()
    }
}