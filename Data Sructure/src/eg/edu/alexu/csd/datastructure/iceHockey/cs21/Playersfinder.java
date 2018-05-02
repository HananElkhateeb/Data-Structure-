package eg.edu.alexu.csd.datastructure.iceHockey.cs21;

import java.awt.Point;

import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;

/**
 * @author HANAN SAMIR
 *
 */
public class Playersfinder implements IPlayersFinder {
	/**
	 * hann.
	 */
	private int team;
	/**
	 * hanan.
	 */
	private int threshold;
	/**
	 * hanan.
	 */
	private boolean[][] visited;
	/**
	 * hanan.
	 */
	private char[][] pixels;
	/**
	 * hanan.
	 */
	private String[] picture;
	/**
	 * hanan.
	 */
	static int numofcell = 1;
	/**
	 * hanan.
	 */
	static int minrow = 0;
	/**
	 * hanan.
	 */
	static int maxrow = 0;
	/**
	 * hanan.
	 */
	static int mincol = 0;
	/**
	 * hanan.
	 */
	static int maxcol = 0;
	/**
	 * hanan.
	 */
	static int index = 0;
	/**
	 * hanan.
	 */
	Point[] points = new Point[10000];
	/**
	 * hanan.
	 */
	public void transformtoCharArray() {
		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[0].length(); j++) {
				pixels[i][j] = picture[i].charAt(j);
			}
		}
	}
	/**
	 * @param row hanan.
	 * @param col hanan
	 * @return element second polynomial
	 */
	boolean isvalied(int row, int col) {
		return (row >= 0) && (row < picture.length) && (col >= 0) && (col < picture[0].length())
				&& (pixels[row][col] - '0' == team && !visited[row][col]);
	}
	/**
	 * @param row hanan.
	 * @param col hanan
	 */
	void dFs(int row, int col) {
		int rowIndex[] =  {0, 0, -1, 1};
		int colIndex[] = {-1, 1, 0, 0};
		visited[row][col] = true;
		for (int k = 0; k < 4; ++k) {
			if (isvalied(row + rowIndex[k], col + colIndex[k])) {
				if (row + rowIndex[k] > maxrow)
					maxrow = row + rowIndex[k];
				if (row + rowIndex[k] < minrow)
					minrow = row + rowIndex[k];
				if (col + colIndex[k] > maxcol)
					maxcol = col + colIndex[k];
				if (col + colIndex[k] < mincol)
					mincol = col + colIndex[k];
				dFs(row + rowIndex[k], col + colIndex[k]);
				numofcell++;
			}
		}

	}
	/**
	 * @param points hanan.
	 * @param left hanan
	 * @param right hanan
	 */
	void quickSort(Point[] points, int left, int right) {
		int pivot, j, i;
		Point temp;
		if (left < right) {
			pivot = left;
			i = left;
			j = right;
			while (i < j) {
				while (points[i].x < points[pivot].x && i < right)
					i++;
				while (points[j].x > points[pivot].x
						|| points[j].x == points[pivot].x && points[j].y >= points[pivot].y && j > left) {
					j--;
				}

				if (i < j) {
					temp = points[i];
					points[i] = points[j];
					points[j] = temp;

				}
			}
			temp = points[pivot];
			points[pivot] = points[j];
			points[j] = temp;
			quickSort(points, left, j - 1);
			quickSort(points, j + 1, right);
		}
	}
	/**
	* Search for players locations at the given photo.
	* @param photo hanan
	* Two dimension array of photo contents
	* Will contain between 1 and 50 elements, inclusive
	* @param team hanan
	* Identifier of the team
	* @param threshold hanan
	* Minimum area for an element
	* Will be between 1 and 10000, inclusive
	* @return hanan
	* Array of players locations of the given team
	*/
	public Point[] findPlayers(String[] photo, int team, int threshold) {
		this.team = team;
		this.threshold = threshold;
		picture = photo;
		visited = new boolean[picture.length][picture[0].length()];
		pixels = new char[picture.length][picture[0].length()];
		transformtoCharArray();
		for (int i = 0; i < picture.length; ++i)
			for (int j = 0; j < picture[0].length(); ++j) {
				if (pixels[i][j] - '0' == team && !visited[i][j]) {
					minrow = i;
					mincol = j;
					maxrow = i;
					maxcol = j;
					dFs(i, j);
					if (numofcell * 4 >= threshold) {
						points[index] = new Point();
						points[index].x = mincol + maxcol + 1;
						points[index].y = minrow + maxrow + 1;
						index++;
					}
				}
				minrow = 0;
				maxrow = 0;
				mincol = 0;
				maxcol = 0;
				numofcell = 1;
			}
		quickSort(points, 0, index - 1);
		Point[] center = new Point[index];
		for (int i = 0; i < index; i++)
			center[i] = points[i];
		if (index != 0) {
			index = 0;
			return center;
		} else
			return center;
	}

}
