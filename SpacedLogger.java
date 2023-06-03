package week05;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		for(int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}
		System.out.println();
	}

	@Override
	public void error(String errors) {
		System.out.print("ERROR: ");
		for(int i = 0; i < errors.length(); i++) {
			System.out.print(errors.charAt(i) + " ");
		}
		System.out.println();
	}



}