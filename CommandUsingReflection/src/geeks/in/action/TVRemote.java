package geeks.in.action;

/**
 * API that provides speific device implementation
 * 
 * @author manishdevraj
 * 
 */
public class TVRemote {
	public static ElectronicDevice getDevice() {
		return new Television();
	}
}
