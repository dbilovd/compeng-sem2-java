
public class DoWhile {
	public static void main(String args[]){
		int i, j;

		outerLoop:
		for(i = 0; i < 4; i++) { 
			for (j = 1; j < 6; j++) {
				System.out.println("I is "+i +" and j is "+j);
				if (i == 2 && j == 4) {
					System.out.println("Breaking loops ...");
					break outerLoop;
				}
			}
            	}
	}
}

