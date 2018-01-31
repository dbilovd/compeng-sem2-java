/**
 * InchesToMetersTable Class
 * Convert Inches to Meters and Print a Table
 */
class InchesToMetersTable {

	/**
	 * Main method
	 * 
	 * @param args[] [description]
	 * @return void
	 */
	public static void main (String args[]) {
		double rate = 39.37;
		int maxFeet = 12;

		for (int feet = 0; feet <= maxFeet; feet++) {
			for (int inchInFeet = 1; inchInFeet <= 12; inchInFeet++) {
				int inch = (feet * 12) + inchInFeet;
				double meter = rate * inch;

				System.out.println(inch + " inch = " + meter + " meters");
			}

			System.out.println();
		}
	}
}