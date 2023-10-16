package Strings;
import java.util.*;
import java.io.*;
public class FirstNonRepeating {

    public static void main(String[] args) {
           System.out.println( firstNonRepeating("hijbacaix"));

    }
	public static char firstNonRepeating(String str) {
		char[] count = getCharCountArray(str);

		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}

		return '#';
	}

	private static char[] getCharCountArray(String str) {
		char[] count = new char[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		return count;
	}
}
