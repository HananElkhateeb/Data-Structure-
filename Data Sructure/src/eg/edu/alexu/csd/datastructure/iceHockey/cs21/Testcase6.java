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
//public class Testcase6 {
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void test() {
//		Playersfinder x = new Playersfinder();
//		String photo[] = new String[] {"3A33H3M333H3N33H33D", "33U3UU3UU3J3KK33333", "FKKFTGKF33333TIFJLD",
//				"TJFDKGJ333FJDKF3333", "FPWTYUTOEFJD3333FKF", "FGKTIO333333FJFKGJH", "GJFLJHTDKLD33333H33",
//				"33333YUJJ3333F33333"};
//		int team = 3;
//		int threshold = 9;
//		Point[] answer = x.findPlayers(photo, team, threshold);
//		Point[] realone = new Point[7];
//		realone[0] = new Point();
//		realone[0].x = 2;
//		realone[0].y = 2;
//		realone[1] = new Point();
//		realone[1].x = 5;
//		realone[1].y = 15;
//		realone[2] = new Point();
//		realone[2].x = 6;
//		realone[2].y = 2;
//		realone[3] = new Point();
//		realone[3].x = 20;
//		realone[3].y = 4;
//		realone[4] = new Point();
//		realone[4].x = 25;
//		realone[4].y = 13;
//		realone[5] = new Point();
//		realone[5].x = 31;
//		realone[5].y = 8;
//		realone[6] = new Point();
//		realone[6].x = 32;
//		realone[6].y = 2;
//		Assert.assertArrayEquals(realone, answer);
//	}
//
//}
