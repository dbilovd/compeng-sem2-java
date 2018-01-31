/**
 * Singleton Class
 */
class Singleton {

	// private static Singleton instance = new Singleton();
	private static Singleton instance = null;

	private Singleton() { }

	public static Singleton getInstance () {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

	public static void test () {
		System.out.println("From Singleton class");
	}
}