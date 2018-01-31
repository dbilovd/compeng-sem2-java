/**
 * David Class
 */
class David {
	String lastName;
	int age;
	String fathersFirstName;
	String religion;

	public David () {
		this.lastName = "Lartey";
		this.age = 27;
		this.fathersFirstName = "Francis";
		this.religion = "Christianity";
	}

	public David (String lastName) {
		this.lastName = lastName;
		this.age = 27;
		this.fathersFirstName = "Francis";
		this.religion = "Christianity";
	}

	public David (String lastName, int age) {
		this.lastName = lastName;
		this.age = age;
		this.fathersFirstName = "Francis";
		this.religion = "Christianity";
	}

	public David (String lastName, int age, String fathersName) {
		this.lastName = lastName;
		this.age = age;
		this.fathersFirstName = fathersName;
		this.religion = "Christianity";
	}

	public David (String lastName, int age, String fathersName, String religion) {
		this.lastName = lastName;
		this.age = age;
		this.fathersFirstName = fathersName;
		this.religion = religion;
	}

	public void details () {
		System.out.println("Name: David " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Father's Name: " + fathersFirstName + " " + lastName);
		System.out.println("Regligion: " + religion);
		System.out.println();
	}
}

/**
 * Constructor Example Class
 */
class ConstructorExample {

	public static void main (String args[]) {
		David davidLartey = new David();
		davidLartey.details();

		David davidSelorm = new David("Selorm Tamakloe");
		davidSelorm.details();

		David davidEbow = new David("Ebow Philips", 30);
		davidEbow.details();

		David davidKumi = new David("Kumi", 30, "Gregory");
		davidKumi.details();

		David davidKlogo = new David("Klogo", 35, "Togbe", "Judaism");
		davidKlogo.details();
	}
}