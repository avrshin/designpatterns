package geeks.in.action;

/**
 * Command interface that allows concrete commands to implement common actions
 * 
 * @author manishdevraj
 * 
 */
public interface Command {
	public void execute();

	public void undo();

}
