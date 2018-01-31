/**
 * Liters to Gallons Converter Class
 */
class LitersToGallonsConverter {

	/**
	 * main1
	 * First main method
	 * 
	 * @param args[] [description]
	 * @return void
	 */
	public static void main1 (String args[]) {
		double liters = 10;
		double rate = 3.7854;
		double gallons;

		gallons = liters / rate;

		System.out.println(liters + " liters = " + gallons + " gallons");

		gallons = 30;
		liters = gallons * rate;

		System.out.println(gallons + " gallons = " + liters + " liters");
	}

	/**
	 * main method
	 * 
	 * @param args[] [description]
	 * @return void
	 */
	public static void main (String args[]) {
		int rows = 100;
		double rate = 3.7854;

		System.out.println("Number (N) :  N Liters to Gallons : N Gallons to Liters");
		for (int row = 1; row <= rows; row++) {
			double litersToGalons = row / rate;
			double gallonsToLiter = row * rate;

			System.out.println(row + " : " + litersToGalons + " : " + gallonsToLiter);
		}
	}
}