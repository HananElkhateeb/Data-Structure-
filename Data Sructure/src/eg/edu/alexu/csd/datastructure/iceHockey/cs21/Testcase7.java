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
//public class Testcase7 {
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void test() {
//		Playersfinder x = new Playersfinder();
//		String photo[] = new String[] {"DKDJJDJ11111SUJ1111", "33U3UU31U3J1KK31333", "FKKFTGK133313TI1111",
//				"TJFDKGJ133F1DKF3331", "11111111EFJ11113FK1", "1GKTIO333333FJ11111", "1JFLJHTDKLD33333H33",
//				"1111NN111NNN11111111"};
//		int team = 1;
//		int threshold = 3;
//		Point[] answer = x.findPlayers(photo, team, threshold);
//		Point[] realone = new Point[3];
//		realone[0] = new Point();
//		realone[0].x = 15;
//		realone[0].y = 15;
//		realone[1] = new Point();
//		realone[1].x = 19;
//		realone[1].y = 8;
//		realone[2] = new Point();
//		realone[2].x = 31;
//		realone[2].y = 15;
//		Assert.assertArrayEquals(realone, answer);
//	}
//}
