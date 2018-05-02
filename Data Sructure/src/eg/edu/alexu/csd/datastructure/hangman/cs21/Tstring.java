package eg.edu.alexu.csd.datastructure.hangman.cs21;

import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author HANAN SAMIR
 *
 */
public class Tstring {
	/**
	 * hanan.
	 */
	private static final String FILENAME = "c:\\test\\dictionary.txt";
	/**
	* @param args this is id of table.
	*/
	public static void main(final String[] args) {
		String[] words = new String[51];
try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String sCurrentLine;
			int i = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				words[i] = sCurrentLine;
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		Hangman x = new Hangman();
		x.setMaxWrongGuesses(null);
		x.setDictionary(words);
		String randword = x.selectRandomSecretWord();
		Scanner input = new Scanner(System.in);
		char c = 0;
		while (c != '*') {
			System.out.println("enter character");
			c = input.next().charAt(0);
			String word = x.guess(c);
			System.out.println(word);
			if (word == null) {
				break;
				}
		}

	}

}
