//package eg.edu.alexu.csd.datastructure.hangman.cs21;
//
//import org.junit.Assert;
//import org.junit.Test;
//
///**
// * @author HANAN SAMIR
// *
// */
//public class Tjunit {
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testRandomWord() {
//		Hangman x = new Hangman();
//		String secret = x.selectRandomSecretWord();
//		Assert.assertNull("Random word returned", secret);
//		String dictionary[] = new String[] {"XXX", "YYYY"};
//		x.setDictionary(dictionary);
//		secret = x.selectRandomSecretWord();
//		Assert.assertNotNull("Null random word", secret);
//		boolean found = false;
//		for (int i = 0; i < dictionary.length; i++) {
//			if (dictionary[i].equals(secret)) {
//				found = true;
//			}
//		}
//		Assert.assertTrue("Message not found", found);
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testWrongGuess() {
//		Hangman hangman = new Hangman();
//		String []dictionary = new String[] {"EGYPT"};
//		hangman.setDictionary(dictionary);
//		hangman.selectRandomSecretWord();
//		hangman.setMaxWrongGuesses(2);
//		Assert.assertEquals("-----", hangman.guess('X'));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testCorrectGuess() {
//		Hangman hangman = new Hangman();
//		String []dictionary = new String[] {"EGYPT"};
//		hangman.setDictionary(dictionary);
//		hangman.selectRandomSecretWord();
//		hangman.setMaxWrongGuesses(2);
//		Assert.assertEquals("--Y--", hangman.guess('Y'));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testCorrectGuessFirstChar() {
//		Hangman hangman = new Hangman();
//		String []dictionary = new String[] {"EGYPT"};
//		hangman.setDictionary(dictionary);
//		hangman.selectRandomSecretWord();
//		hangman.setMaxWrongGuesses(2);
//		Assert.assertEquals("E----", hangman.guess('E'));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testCorrectGuessLastChar() {
//		Hangman x = new Hangman();
//		String []dictionary = new String[] {"EGYPT"};
//		x.setDictionary(dictionary);
//		x.selectRandomSecretWord();
//		x.setMaxWrongGuesses(2);
//		Assert.assertEquals("----T", x.guess('T'));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testCaseSensitiveLower() {
//		Hangman x = new Hangman();
//		String []dictionary = new String[] {"EGYPT"};
//		x.setDictionary(dictionary);
//		x.selectRandomSecretWord();
//		x.setMaxWrongGuesses(2);
//		Assert.assertTrue("E----".equalsIgnoreCase(x.guess('e')));
//	}
//	/**
//	 * hanan.
//	 */
//	@Test
//	public void testCaseSensitiveUpper() {
//		Hangman x = new Hangman();
//		String []dictionary = new String[] {"egypt"};
//		x.setDictionary(dictionary);
//		x.selectRandomSecretWord();
//		x.setMaxWrongGuesses(2);
//		Assert.assertTrue("E----".equalsIgnoreCase(x.guess('E')));
//	}
//}
