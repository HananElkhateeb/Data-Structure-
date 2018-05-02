//package eg.edu.alexu.csd.datastructure.iceHockey.cs21;
//
//import java.awt.Point;
//
//import org.junit.Assert;
//import org.junit.Test;
//
///**
// * @author HANAN SAMIR
// *
// */
//public class Testcase5 {
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void test() {
//		Playersfinder x = new Playersfinder();
//		String photo[] = new String[] {"55555555555DUKDMNJJ", "555555555555KDJOISH", "5555555555555KDJJDO",
//				"55555555555555DIJCK", "555555555555555DKDK", "5555555555555555DKK", "55555555555555555UY",
//				"555555555555555555H", "5555555555555555555"};
//		int team = 5;
//		int threshold = 20;
//		Point[] answer = x.findPlayers(photo, team, threshold);
//		Point[] realone = new Point[1];
//		realone[0] = new Point();
//		realone[0].x = 19;
//		realone[0].y = 9;
//		Assert.assertArrayEquals(realone, answer);
//	}
//
//}
