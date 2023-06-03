package week05;

public class App {

	public static void main(String[] args) {
		Logger log1 = new AsteriskLogger();
		Logger log2 = new SpacedLogger();
		
		log1.log("GOOD DAY TO YOU");
		log1.error("CRITICAL ERROR");
		
		log2.log("HelloWorld");
		log2.error("Malfunction");

	}

}
