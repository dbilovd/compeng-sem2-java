/**
 * ForLoop Class
 */
class ForLoop {
	public static void main (String args[]) {
		int age = 27;

		for (int me = 1; me <= age; me++) {
			String ageString = me + (( me == 1) ? " year" : " years");
			System.out.println("I am " + ageString + " old");
		}

		System.out.println("This is how old I am today.");

		int [] ages = { 10, 20, 30 };

		for (int aged : ages) {
			System.out.println("Age : " + aged);
		}
	}
}