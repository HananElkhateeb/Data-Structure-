package eg.edu.alexu.csd.datastructure.linkedList.cs21_71;
import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

/**
 * @author HANAN SAMIR
 *
 */
public class PolynomialSolver implements IPolynomialSolver {
	/**
	 * hanan.
	 */
	SinglyLinkedList a = new SinglyLinkedList();
	/**
	 * hanan.
	 */
	SinglyLinkedList b = new SinglyLinkedList();
	/**
	 * hanan.
	 */
	SinglyLinkedList c = new SinglyLinkedList();
	/**
	 * hanan.
	 */
	SinglyLinkedList r = new SinglyLinkedList();
	/**
	* Set polynomial terms (coefficients & exponents).
	* @param poly name of the polynomial
	* @param terms array of [coefficients][exponents]
	*/
	public void setPolynomial(char poly, int[][] terms) {
		if (terms == null || terms.length == 0) {
			throw null;
		}
		int max = 0;
		for (int i = 0; i < terms.length; i++) {
			if (max < terms[i][1]) {
				max = terms[i][1];
			}
			if ((terms[i][1]) < 0 || max != terms[0][1]) {
				throw null;
			}
		}
		int rows = terms.length;
		int cols = terms[0].length;
		int[][] reverse = new int[rows][cols];
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 0; j--) {
				reverse[rows - 1 - i][j] = terms[i][j];
			}
		}
		char fUpper = Character.toUpperCase(poly);
		SinglyLinkedList x = new SinglyLinkedList();
		switch (fUpper) {
		case 'A':
			a = x;
			break;
		case 'B':
			b = x;
			break;
		case 'C':
			c = x;
			break;
		default:
			throw new RuntimeException();
		}
		if (!x.isEmpty()) {
			x.clear();
		}
		int j = 0;
		for (int i = 0; i < reverse.length; i++) {
			for (; j <= reverse[i][1]; j++) {
				if (reverse[i][1] == j) {
					x.add(reverse[i][1], reverse[i][0]);
				} else {
					x.add(j, null);
				}
			}
		}
	}
	/**
	* Print the polynomial in human readable representation.
	* @param poly name of the polynomia
	* @return polynomial in the form like 27x^2+x-1
	*/
	public String print(char poly) {
		char fUpper = Character.toUpperCase(poly);
		if (fUpper == 'A'||fUpper == 'B'||fUpper == 'C'||fUpper == 'R'){
		SinglyLinkedList x=new SinglyLinkedList();
		 String polynomial="";
		 switch(fUpper){
		 case 'A' : x=a;
		 break;
		 case 'B' : x=b;
		 break;
		 case 'C' : x=c;
		 break;
		 case 'R' : x=r;
		 break;
		 default:
				throw new RuntimeException();
		 }
		 if (x.size() == 0) {
			 return null;
			 }
	int z=x.size()-1;
	while (z>=0){
		if (x.get(z)!= null){
			Integer cof = (Integer) x.get(z);
			if (cof !=0){
				if ((z!=(x.size()-1))&&(cof>0)){
					polynomial+="+";
					
				}
				if ((cof!=1)&&(cof!=-1)){
					polynomial+=cof;
				}
				if (cof==-1&&z==0){
					polynomial+=cof;
					}
				if (cof==1&&z==0){
					polynomial+=cof;
					}
				if (z !=0){
					polynomial+="x";
					if (z!=1){
						polynomial+="^";
						polynomial+=z;
					}
				}
				
			}
		}
		z--;
	}
	return polynomial;	
		} else {
			throw new RuntimeException();
		}
	}
	/**
	* Clear the polynomial.
	* @param poly name of the polynomial
	*/
	public void clearPolynomial(char poly) {
		char fUpper = Character.toUpperCase(poly);
		if (fUpper == 'A') {
			a.clear();
		}
		if (fUpper == 'B') {
			b.clear();
		}
		if (fUpper == 'C') {
			c.clear();
		}
	}
	/**
	* Evaluate the polynomial.
	* @param poly name of the polynomial
	* @param value the polynomial constant value
	* @return the value of the polynomial
	*/
	public float evaluatePolynomial(char poly, float value) {
		char fUpper = Character.toUpperCase(poly);
		SinglyLinkedList x = new SinglyLinkedList();
		switch (fUpper) {
		case 'A':
			x = a;
			break;
		case 'B':
			x = b;
			break;
		case 'C':
			x = c;
			break;
		default:
			throw new RuntimeException();
		}
		if (x.isEmpty()) {
			throw new RuntimeException();
		}
		float result = 0, n;

		for (int i = 0; i < x.size(); i++) {
			if (x.get(i) != null) {
				n = (float) ((Integer) x.get(i) * java.lang.Math.pow(value, i));
				result = result + n;
			}
		}
		return result;
	}
	/**
	* Add two polynomials.
	* @param poly1 first polynomial
	* @param poly2 second polynomial
	* @return the result polynomial
	*/
	public int[][] add(char poly1, char poly2) {
		char fUpper1 = Character.toUpperCase(poly1);
		char fUpper2 = Character.toUpperCase(poly2);
		SinglyLinkedList x = new SinglyLinkedList();
		SinglyLinkedList y = new SinglyLinkedList();
		switch (fUpper1) {
		case 'A':
			x = a;
			break;
		case 'B':
			x = b;
			break;
		case 'C':
			x = c;
			break;
		default:
			throw new RuntimeException();
		}
		switch (fUpper2) {
		case 'A':
			y = a;
			break;
		case 'B':
			y = b;
			break;
		case 'C':
			y = c;
			break;
		default:
			throw new RuntimeException();
		}
		if (x.isEmpty() || y.isEmpty()) {
			throw null;
		}

		if (x.size() <= y.size()) {
			for (int i = 0; i < x.size(); i++) {
				if (x.get(i) != null && y.get(i) != null) {
					r.add((Integer) x.get(i) + (Integer) y.get(i));
				} else if (x.get(i) != null && y.get(i) == null) {
					r.add((Integer) x.get(i));
				} else if (x.get(i) == null && y.get(i) != null) {
					r.add((Integer) y.get(i));
				} else if (x.get(i) == null && y.get(i) == null) {
					r.add(null);
				}
			}
			for (int i = x.size(); i < y.size(); i++) {
				r.add((Integer) y.get(i));
			}
			}
		else if (x.size() > y.size()) {
			for (int i = 0; i < y.size(); i++) {
				if (x.get(i) != null && y.get(i) != null) {
					r.add((Integer) x.get(i) + (Integer) y.get(i));
				} else if (x.get(i) != null && y.get(i) == null) {
					r.add((Integer) x.get(i));
				} else if (x.get(i) == null && y.get(i) != null) {
					r.add((Integer) y.get(i));
				} else if (x.get(i) == null && y.get(i) == null) {
					r.add(null);
				}
			}
			for (int i = y.size(); i < x.size(); i++) {
				r.add((Integer) x.get(i));
			}
		}

		int count = 0, size = 0;
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i) != null) {
				size++;
			}
		}
		int[][] ans = new int[size][2];
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i) != null) {
				ans[count][0] = (Integer) r.get(i);
				ans[count][1] = i;
				count++;
			}
		}
		int rows = ans.length;
		int cols = ans[0].length;
		int[][] reverse = new int[rows][cols];
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 0; j--) {
				reverse[rows - 1 - i][j] = ans[i][j];
			}
		}
		return reverse;
	}
	/**
	* @param x first polynomial.
	* @param y second polynomial
	* @return the result polynomial
	 */
	public int testequality(SinglyLinkedList x, SinglyLinkedList y) {
		for (int k = 0; k < x.size(); k++) {
			if (x.get(k) != y.get(k)) {
				return 1;
			}
		}
		return 0;
	}
	/**
	* Subtract two polynomials.
	* @param poly1 first polynomial
	* @param poly2 second polynomial
	* @return the result polynomial
	*/
	public int[][] subtract(char poly1, char poly2) {
		char fUpper1 = Character.toUpperCase(poly1);
		char fUpper2 = Character.toUpperCase(poly2);
		SinglyLinkedList x = new SinglyLinkedList();
		SinglyLinkedList y = new SinglyLinkedList();
		switch (fUpper1) {
		case 'A':
			x = a;
			break;
		case 'B':
			x = b;
			break;
		case 'C':
			x = c;
			break;
		default:
			throw new RuntimeException();
		}
		switch (fUpper2) {
		case 'A':
			y = a;
			break;
		case 'B':
			y = b;
			break;
		case 'C':
			y = c;
			break;
		default:
			throw new RuntimeException();
		}
		if (x.isEmpty() || y.isEmpty()) {
			throw null;
		}
		int flag = testequality(x, y);
		if (flag == 0) {
			int[][] terms = {{0, 0}};
			return terms;
		}

		if (x.size() <= y.size()) {
			for (int i = 0; i < x.size(); i++) {
				if (x.get(i) != null && y.get(i) != null) {
					r.add((Integer) x.get(i) - (Integer) y.get(i));
				} else if (x.get(i) != null && y.get(i) == null) {
					r.add((Integer) x.get(i));
				} else if (x.get(i) == null && y.get(i) != null) {
					r.add((Integer) 0 - (Integer) y.get(i));
				} else if (x.get(i) == null && y.get(i) == null) {
					r.add(null);
				}
			}
			for (int i = x.size(); i < y.size(); i++) {
				r.add((Integer) 0 - (Integer) y.get(i));
			}
		}

		else if (x.size() > y.size()) {
			for (int i = 0; i < y.size(); i++) {
				if (x.get(i) != null && y.get(i) != null) {
					r.add((Integer) x.get(i) - (Integer) y.get(i));
				} else if (x.get(i) != null && y.get(i) == null) {
					r.add((Integer) x.get(i));
				} else if (x.get(i) == null && y.get(i) != null) {
					r.add((Integer) 0 - (Integer) y.get(i));
				} else if (x.get(i) == null && y.get(i) == null) {
					r.add(null);
				}
			}
			for (int i = y.size(); i < x.size(); i++) {
				r.add((Integer) x.get(i));
			}
		}

		int count = 0, size = 0;
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i) != null) {
				size++;
			}
		}
		int[][] ans = new int[size][2];
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i) != null) {
				ans[count][0] = (Integer) r.get(i);
				ans[count][1] = i;
				count++;
			}
		}

		int rows = ans.length;
		int cols = ans[0].length;
		int[][] reverse = new int[rows][cols];
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 0; j--) {
				reverse[rows - 1 - i][j] = ans[i][j];
			}
		}
		return reverse;
	}
	/**
	* Multiply two polynomials.
	* @param poly1 first polynomial
    * @param poly2 second polynomial
    * @return the result polynomial
    */
	public int[][] multiply(char poly1, char poly2) {
		char fUpper1 = Character.toUpperCase(poly1);
		char fUpper2 = Character.toUpperCase(poly2);
		SinglyLinkedList x = new SinglyLinkedList();
		SinglyLinkedList y = new SinglyLinkedList();
		switch (fUpper1) {
		case 'A':
			x = a;
			break;
		case 'B':
			x = b;
			break;
		case 'C':
			x = c;
			break;
		default:
			throw new RuntimeException();
		}
		switch (fUpper2) {
		case 'A':
			y = a;
			break;
		case 'B':
			y = b;
			break;
		case 'C':
			y = c;
			break;
		default:
			throw new RuntimeException();
		}
		int size1 = x.size();
		int size2 = y.size();
		SinglyLinkedList temp1 = new SinglyLinkedList();
		SinglyLinkedList temp2 = new SinglyLinkedList();
		for (int n = 0; n < (size1 + size2); n++) {
			temp1.add(n, null);
		}
		for (int n = 0; n < (size1 + size2); n++) {
			temp2.add(n, null);
		}
		for (int i = 0; i < size1; i++) {
			if (x.get(i) != null) {
				Integer r = (Integer) x.get(i);
				for (int j = 0; j < size2; j++) {
					Integer k = (Integer) y.get(j);
					if (y.get(j) != null) {
						temp1.set(i + j, r * k);
					}
				}
				int count;
				for (count = 0; count < temp2.size(); count++) {
					Integer cof1 = (Integer) temp1.get(count);
					Integer cof2 = (Integer) temp2.get(count);
					if (temp1.get(count) == null) {
						cof1 = 0;
					}
					if (temp2.get(count) == null) {
						cof2 = 0;
					}
					temp2.set(count, (cof1 + cof2));
					if ((cof1 == 0) && (cof2 == 0)) {
						temp2.set(count, null);
					}
				}
				for (int n = 0; n < (size1 + size2); n++) {
					temp1.set(n, null);
				}
			}
		}
		r = temp2;
		int row = 0;
		for (int u = 0; u < r.size(); u++) {
			Integer cof = (Integer) r.get(u);
			if ((r.get(u) != null) && (cof != 0)) {
				row++;
			}
		}
		int[][] mul = new int[row][2];
		int index = 0;
		for (int k = 0; k < r.size(); k++) {
			Integer cof = (Integer) r.get(k);
			if ((r.get(k) != null) && (cof != 0)) {
				mul[index][0] = cof;
				mul[index][1] = k;
				index++;
			}
		}
		int rows = mul.length;
		int cols = mul[0].length;
		int[][] reverse = new int[rows][cols];
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 0; j--) {
				reverse[rows - 1 - i][j] = mul[i][j];
			}
		}
		return reverse;
	}
}
