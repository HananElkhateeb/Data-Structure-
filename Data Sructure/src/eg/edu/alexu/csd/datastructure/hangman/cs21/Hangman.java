package eg.edu.alexu.csd.datastructure.hangman.cs21;

import eg.edu.alexu.csd.datastructure.hangman.IHangman;

/**
 * @author HANAN SAMIR
 *
 */
public class Hangman implements IHangman {
	/**
	 * hanan.
	 */
	private String[] pwords;
	/**
	 * hanan.
	 */
	private String secretWord;
	/**
	 * hanan.
	 */
	private String dashWord;
	/**
	 * hanan.
	 */
	private int numOfWrongCases;
	/**
	 * hanan.
	 */
	private char[] word;
	/**
	 * hanan.
	 */
	private int num = -1;
	/**
	* Set dictinary words to pick secret words from.
	* @param words an array of words
	*/
	public void setDictionary(final String[] words) {
		this.pwords = words;
	}
	/**
	* Pick a random secret word from dictionary and reutns it.
	* @return secret word
	*/
	public String selectRandomSecretWord() {
		if (pwords == null) {
			return null;
		}
		secretWord = pwords[(int) (Math.random() * pwords.length - 1)];
		secretWord = secretWord.toUpperCase();
		word = secretWord.toCharArray();
		for (int i = 0; i < secretWord.length(); i++) {
			word[i] = '-';
		}
		dashWord = String.valueOf(word);
		return secretWord;
	}
	/**
	* Receive a new user guess, and verify it against the secret word.
	* @param c
	* case insensitive user guess.
	* If c is NULL then ignore it and do no change
	* @return
	* secret word with hidden characters (use '-' instead unsolved
	* characters), or return NULL if user reached max wrong guesses
	*/
	public String guess(Character c) {
		if (c == null) {
			return dashWord;
		}
		if (numOfWrongCases == 0) {
			return null;
		}
		c = Character.toUpperCase(c);
		for (int i = 0; i < word.length; i++) {
			if (c == secretWord.charAt(i)) {
				word[i] = c;
			}
		}
		num = secretWord.indexOf(c);
		if (num == -1) {
			numOfWrongCases--;
		}
		if (numOfWrongCases == 0) {
			return null;
		} else {
			dashWord = String.valueOf(word);
			return dashWord;
		}
	}
	/**
	* Set the maximum number of wrong guesses.
	* @param max
	* maximum number of wrong guesses, If is NULL, then assume it 0
	*/
	public void setMaxWrongGuesses(Integer max) {
		this.numOfWrongCases = max;
		if (max == null) {
			numOfWrongCases = 0;
		}
	}
}
