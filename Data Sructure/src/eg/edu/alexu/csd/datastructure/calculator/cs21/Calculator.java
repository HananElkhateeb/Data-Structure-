package eg.edu.alexu.csd.datastructure.calculator.cs21;

import eg.edu.alexu.csd.datastructure.calculator.ICalculator;

/**
 * @author HANAN SAMIR
 *
 */
public class Calculator implements ICalculator {
	/**
	* Adds given two numbers.
	* @param x first number
	* @param y second number
	* @return the sum of the two numbers
	*/
	public int add(final int x, final int y) {
		int z = x + y;
		return z;
	}
	/**
	* Divids two numbers.
	* @param x first number
	* @param y second number
	* @return the division result
	*/
	public float divide(final int x, final int y) {
		float z = (float) (x * 1.0 / y);
		return z;
	}
}
