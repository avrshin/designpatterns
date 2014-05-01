package geeks.in.action;

import java.util.List;

/**
 * Generic comman action
 * 
 * @author manishdevraj
 * 
 */
public class TurnItAllOff implements Command {
	List<ElectronicDevice> theDevices;

	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		theDevices = newDevices;
	}

	@Override
	public void execute() {
		for (ElectronicDevice device : theDevices) {
			device.off();
		}
	}

	@Override
	public void undo() {
		for (ElectronicDevice device : theDevices) {
			device.on();
		}
	}
}