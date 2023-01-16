package command_pattern

class CellularOnCommand(
    private val network: Network
): Command {
    override fun execute() {
        network.turnOnCellular()
    }
}