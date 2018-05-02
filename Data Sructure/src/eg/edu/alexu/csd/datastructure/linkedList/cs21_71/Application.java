package eg.edu.alexu.csd.datastructure.linkedList.cs21_71;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author HANAN SAMIR
 *
 */
public class Application {
	/**
	 * hanan.
	 */
	private static Scanner input = new Scanner(System.in);
	/**
	 * hanan.
	 */
	static PolynomialSolver h = new PolynomialSolver();
	/**
	 * hanan.
	 */
	public static void selection() {
		System.out.println("Please choose an action");
		System.out.println("-----------------------");
		System.out.println("1- Set a polynomial variable");
		System.out.println("2- Print the value of a polynomial variable");
		System.out.println("3- Add two polynomials");
		System.out.println("4- Subtract two polynomials");
		System.out.println("5- Multiply two polynomials");
		System.out.println("6- Evaluate a polynomial at some point");
		System.out.println("7- Clear a polynomial variable");
		System.out.println("====================================================================");
		play();
	}
	/**
	 * hanan.
	 */
	public static void play() {
		int select = input.nextInt();
		switch (select) {
		case 1:
			case1();
			break;
		case 2:
			case2();
			break;
		case 3:
			case3();
			break;
		case 4:
			case4();
			break;
		case 5:
			case5();
			break;
		case 6:
			case6();
			break;
		case 7:
			case7();
			break;
		default:
			System.out.println("enter the valid choice");
			System.out.println("====================================================================");
			play();
		}
	}
	/**
	 * hanan.
	 */
	public static void case1() {
		System.out.println("Insert the variable name : A, B or C");
		input.nextLine();
		char poly = input.next().charAt(0);
		if (poly == 'A' || poly == 'B' || poly == 'C') {
			System.out.println("Insert the polynomial terms in the form :");
			System.out.println("(coeff1 , exponent1 ), (coeff2 , exponent2 ), ..");
			String arr;
			input.nextLine();
			arr = input.nextLine();
			int index = 0;
			for (int i = 0; i < arr.length(); i++) {
				if (arr.charAt(i) == '(') {
					index++;
				}
			}
			int[][] terms = new int[index][2];
			List<String> list = new ArrayList<String>();
			arr = arr.replaceAll("[^-?0-9]+", " ");
			list = Arrays.asList(arr.trim().split(" "));

			String[] parts = new String[list.size()];
			for (int k = 0; k < list.size(); k++) {
				parts[k] = list.get(k);
			}

			int[] n1 = new int[parts.length];
			for (int n = 0; n < parts.length; n++) {
				n1[n] = Integer.parseInt(parts[n]);
			}
			int j = 0;
			for (int i = 0; i < parts.length; i++) {
				if (i % 2 == 0) {
					terms[j][0] = n1[i];
				} else {
					terms[j][1] = n1[i];
					j++;
				}
			}
			h.setPolynomial(poly, terms);
			System.out.println("Polynomial " + poly + " is set");
			System.out.println("====================================================================");
			selection();
		} else {
			System.out.println("enter the valid character");
			case1();
		}

	}
	/**
	 * hanan.
	 */
	public static void case2() {
		System.out.println("Insert the variable name : A, B, C or R");
		char poly;
		input.nextLine();
		poly = input.next().charAt(0);
		if (poly == 'A' || poly == 'B' || poly == 'C' || poly == 'R') {
			System.out.println(poly + " Value in " + poly + " : " + h.print(poly));
			System.out.println("====================================================================");
			selection();
		} else {
			System.out.println("enter the valid character");
			case2();
		}
	}
	/**
	 * hanan.
	 */
	public static void case3() {
		System.out.println("Insert first operand variable name : A, B or C");
		char poly1;

		input.nextLine();
		poly1 = input.next().charAt(0);

		while ((h.a.isEmpty() && poly1 == 'A') || (h.b.isEmpty() && poly1 == 'B') || (h.c.isEmpty() && poly1 == 'C')) {
			System.out.println("Variable not set");
			System.out.println("Insert first operand variable name : A, B or C");
			input.nextLine();
			poly1 = input.next().charAt(0);

		}

		System.out.println("Insert the second operand variable name : A, B or C");
		char poly2;

		input.nextLine();
		poly2 = input.next().charAt(0);

		while ((h.a.isEmpty() && poly2 == 'A') || (h.b.isEmpty() && poly2 == 'B') || (h.c.isEmpty() && poly2 == 'C')) {
			System.out.println("Variable not set");
			System.out.println("Insert the second operand variable name : A, B or C");

			input.nextLine();
			poly2 = input.next().charAt(0);
		}

		int[][] parameters;
		parameters = h.add(poly1, poly2);
		System.out.print("Result set in R:");
		for (int i = 0; i < parameters.length; i++) {
			System.out.print("(" + parameters[i][0] + "," + parameters[i][1] + "), ");
		}
		for (int i = 0; i < parameters.length; i++) {
			for (int j = 0; j < parameters[0].length; j++) {
				parameters[i][j] = 0;
			}
		}
		System.out.println();
		System.out.println("====================================================================");
		selection();

	}
	/**
	 * hanan.
	 */
	public static void case4() {
		System.out.println("Insert first operand variable name : A, B or C");
		char poly1;

		input.nextLine();
		poly1 = input.next().charAt(0);

		while ((h.a.isEmpty() && poly1 == 'A') || (h.b.isEmpty() && poly1 == 'B') || (h.c.isEmpty() && poly1 == 'C')) {
			System.out.println("Variable not set");
			System.out.println("Insert first operand variable name : A, B or C");

			input.nextLine();
			poly1 = input.next().charAt(0);

		}
		System.out.println("Insert the second operand variable name : A, B or C");
		char poly2;

		input.nextLine();
		poly2 = input.next().charAt(0);

		while ((h.a.isEmpty() && poly2 == 'A') || (h.b.isEmpty() && poly2 == 'B') || (h.c.isEmpty() && poly2 == 'C')) {
			System.out.println("Variable not set");
			System.out.println("Insert the second operand variable name : A, B or C");

			input.nextLine();
			poly2 = input.next().charAt(0);

		}
		int[][] parameters;
		parameters = h.subtract(poly1, poly2);
		System.out.print("Result set in R:");
		for (int i = 0; i < parameters.length; i++) {
			System.out.print("(" + parameters[i][0] + "," + parameters[i][1] + "), ");
		}
		for (int i = 0; i < parameters.length; i++) {
			for (int j = 0; j < parameters[0].length; j++) {
				parameters[i][j] = 0;
			}
		}
		System.out.println();
		System.out.println("====================================================================");
		selection();

	}
	/**
	 * hanan.
	 */
	public static void case5() {
		System.out.println("Insert first operand variable name : A, B or C");
		char poly1;

		input.nextLine();
		poly1 = input.next().charAt(0);

		while ((h.a.isEmpty() && poly1 == 'A') || (h.b.isEmpty() && poly1 == 'B') || (h.c.isEmpty() && poly1 == 'C')) {
			System.out.println("Variable not set");
			System.out.println("Insert first operand variable name : A, B or C");

			input.nextLine();
			poly1 = input.next().charAt(0);

		}
		System.out.println("Insert the second operand variable name : A, B or C");
		char poly2;

		input.nextLine();
		poly2 = input.next().charAt(0);

		while ((h.a.isEmpty() && poly2 == 'A') || (h.b.isEmpty() && poly2 == 'B') || (h.c.isEmpty() && poly2 == 'C')) {
			System.out.println("Variable not set");
			System.out.println("Insert the second operand variable name : A, B or C");

			input.nextLine();
			poly2 = input.next().charAt(0);
		}
		int[][] parameters;
		parameters = h.multiply(poly1, poly2);
		System.out.print("Result set in R:");
		for (int i = 0; i < parameters.length; i++) {
			System.out.print("(" + parameters[i][0] + "," + parameters[i][1] + "), ");
		}
		for (int i = 0; i < parameters.length; i++) {
			for (int j = 0; j < parameters[0].length; j++) {
				parameters[i][j] = 0;
			}
		}
		System.out.println();
		System.out.println("====================================================================");
		selection();

	}
	/**
	 * hanan.
	 */
	public static void case6() {
		System.out.println("Insert the variable name : A, B or C ");
		char poly;

		input.nextLine();
		poly = input.next().charAt(0);
		if (poly == 'A' || poly == 'B' || poly == 'C') {
			while ((h.a.isEmpty() && poly == 'A') || (h.b.isEmpty() && poly == 'B') || (h.c.isEmpty() && poly == 'C')) {
				System.out.println("Variable not set");
				System.out.println("Insert the variable name : A, B or C");

				input.nextLine();
				poly = input.next().charAt(0);
			}
		} else {
			System.out.println("enter the valid character");
			case6();
		}
		System.out.println("Insert the constant value");
		float value;
		value = input.nextFloat();
		System.out.println("the result " + h.evaluatePolynomial(poly, value));
		selection();
	}
	/**
	 * hanan.
	 */
	public static void case7() {
		System.out.println("Insert the variable name : A, B or C ");
		char poly;
		input.nextLine();
		poly = input.next().charAt(0);
		if (poly == 'A' || poly == 'B' || poly == 'C') {
			h.clearPolynomial(poly);
			System.out.println(poly + " is clesred");
			selection();
		} else {
			System.out.println("enter the valid character");
			case7();
		}

	}
	/**
	* @param args this is id of table.
	*/
	public static void main(String[] args) {
		selection();
	}
}
