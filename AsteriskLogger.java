package week05;

public class AsteriskLogger implements Logger{
	
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String errors) {
		for(int i = 0; i < errors.length()+13; i++) {
			System.out.print("*");
		}
		System.out.println("\n***ERROR: " + errors + "***");
		for(int i = 0; i < errors.length()+13; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
