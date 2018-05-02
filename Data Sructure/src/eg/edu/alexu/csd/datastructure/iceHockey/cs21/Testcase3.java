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
//public class Testcase3 {
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void test() {
//		Playersfinder x = new Playersfinder();
//		String photo[] = new String[] {"8D88888J8L8E888", "88NKMG8N8E8JI88", "888NS8EU88HN8EO", "LUQ888A8TH8OIH8",
//				"888QJ88R8SG88TY", "88ZQV88B88OUZ8O", "FQ88WF8Q8GG88B8", "8S888HGSB8FT8S8", "8MX88D88888T8K8",
//				"8S8A88MGVDG8XK8", "M88S8B8I8M88J8N", "8W88X88ZT8KA8I8", "88SQGB8I8J88W88", "U88H8NI8CZB88B8",
//				"8PK8H8T8888TQR8"};
//		int team = 8;
//		int threshold = 9;
//		Point[] answer = x.findPlayers(photo, team, threshold);
//		Point[] realone = new Point[19];
//		realone[0] = new Point();
//		realone[0].x = 1;
//		realone[0].y = 17;
//		realone[1] = new Point();
//		realone[1].x = 3;
//		realone[1].y = 3;
//		realone[2] = new Point();
//		realone[2].x = 3;
//		realone[2].y = 10;
//		realone[3] = new Point();
//		realone[3].x = 3;
//		realone[3].y = 25;
//		realone[4] = new Point();
//		realone[4].x = 5;
//		realone[4].y = 21;
//		realone[5] = new Point();
//		realone[5].x = 8;
//		realone[5].y = 17;
//		realone[6] = new Point();
//		realone[6].x = 9;
//		realone[6].y = 2;
//		realone[7] = new Point();
//		realone[7].x = 10;
//		realone[7].y = 9;
//		realone[8] = new Point();
//		realone[8].x = 12;
//		realone[8].y = 23;
//		realone[9] = new Point();
//		realone[9].x = 17;
//		realone[9].y = 16;
//		realone[10] = new Point();
//		realone[10].x = 18;
//		realone[10].y = 3;
//		realone[11] = new Point();
//		realone[11].x = 18;
//		realone[11].y = 11;
//		realone[12] = new Point();
//		realone[12].x = 18;
//		realone[12].y = 28;
//		realone[13] = new Point();
//		realone[13].x = 22;
//		realone[13].y = 20;
//		realone[14] = new Point();
//		realone[14].x = 23;
//		realone[14].y = 26;
//		realone[15] = new Point();
//		realone[15].x = 24;
//		realone[15].y = 15;
//		realone[16] = new Point();
//		realone[16].x = 27;
//		realone[16].y = 2;
//		realone[17] = new Point();
//		realone[17].x = 28;
//		realone[17].y = 26;
//		realone[18] = new Point();
//		realone[18].x = 29;
//		realone[18].y = 16;
//		Assert.assertArrayEquals(realone, answer);
//	}
//
//}
