/**
 * 
 */
class TeaBags {
	enum ContainerSizes { small, medium, large } ContainerSizes containerSize;
	enum ShirtSizes { extraLarge } ShirtSizes shirtSize;
}

/**
 * Enum Test Class
 */
class EnumTest {

	/**
	 * main function
	 * @param args[] [description]
	 */
	public static void main (String args[]) {
		TeaBags liptonBags = new TeaBags();
		// liptonBags.containerSize = liptonBags.shirtSize.extraLarge;
		liptonBags.containerSize = liptonBags.containerSize.medium;
		System.out.println(liptonBags.containerSize);
	}
}