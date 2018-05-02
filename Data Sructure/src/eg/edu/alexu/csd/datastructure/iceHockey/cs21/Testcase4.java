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
//public class Testcase4 {
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void test4() {
//		Playersfinder x = new Playersfinder();
//		String photo[] = new String[] {"11111", "1AAA1", "1A1A1", "1AAA1", "11111"};
//		int team = 1;
//		int threshold = 3;
//		Point[] answer = x.findPlayers(photo, team, threshold);
//		Point[] realone = new Point[2];
//		realone[0] = new Point();
//		realone[0].x = 5;
//		realone[0].y = 5;
//		realone[1] = new Point();
//		realone[1].x = 5;
//		realone[1].y = 5;
//		Assert.assertArrayEquals(realone, answer);
//	}
//
//}
