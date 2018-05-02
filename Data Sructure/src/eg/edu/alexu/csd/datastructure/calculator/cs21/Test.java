package eg.edu.alexu.csd.datastructure.calculator.cs21;

import java.util.Scanner;

/**
 * @author HANAN SAMIR
 *
 */
public class Test {
	/**
	* @param args this is id of table
	*/
	public static void main(final String[] args) {
		Calculator s = new Calculator();
		int x, y;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		int z = s.add(x, y);
		float h = s.divide(x, y);
		System.out.println(z);
		System.out.println(h);
	}

}
