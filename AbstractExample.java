abstract class AbstractClass {
	abstract String version ();
}

public class AbstractExample extends AbstractClass {

	public String version () {
		return "1.0";
	}

	public static void main (String args[]) {
		AbstractExample abex = new AbstractExample();
		System.out.println(abex.version());
	}
}