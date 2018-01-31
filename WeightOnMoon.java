/**
 * WeightOnMoon Class
 */
class WeightOnMoon {
	/**
	 * Main function
	 * @param args[] [description]
	 * @return void
	 */
	public static void main (String args[]) {
		double gravity = 9.8;
		double moonGravity = gravity * (17 / 100);

		double weight = 100;
		double weightOnMoon = (weight - gravity) + moonGravity;

		System.out.println(weight + " kg on earth will be " + weightOnMoon + " kg on the moon.");
	}
}