package eg.edu.alexu.csd.datastructure.iceHockey.cs21;

import java.awt.Point;

/**
 * @author HANAN SAMIR
 *
 */
public class Test {
	/**
	* @param args this is id of table
	*/
	public static void main(String[] args) {
		Playersfinder x = new Playersfinder();
		String photo[] = new String[] {"44444H44S4", "K444K4L444", "4LJ44T44XH", "444O4VIF44", "44C4D4U444",
				"4V4Y4KB4M4", "G4W4HP4O4W", "4444ZDQ4S4", "4BR4Y4A444", "4G4V4T4444"};
		int team = 4;
		int threshold = 16;
		Point[] answer = x.findPlayers(photo, team, threshold);
		for (int i = 0; i < answer.length; i++)
			System.out.println(answer[i]);
	}

}
