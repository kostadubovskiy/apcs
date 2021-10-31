/***
 * Kosta Dubovskiy
 * APCS
 * HW27 -- For Loops w/ Fences and String operations
 * 2021-10-28
 * Time spent: 0.5
 * QCC
 * DISCO
  	 * Substring is inclusive of only start index, not end
	 * Java doesn't use square brackets for String indexing/access
 */

public class Rof {	public static void main(String[] args) {
		System.out.println(fence(1));
		System.out.println(reverseF("abc"));
		System.out.println(reverseR("abc"));
	}
	
	public static String fence(int n) {
		String fence = "|";
		for (int i = 0; i < n; i++) {
			fence += "--|";
		}
		return fence;
	}

	public static String reverseF(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i ++) {
			result += s.substring(s.length() - i - 1, s.length() - i);
		}
		return result;
	}

	public static String reverseR(String s) {
		if (s.length() == 1) {
			return s;
		} else {
			return s.substring(s.length() - 1) + reverseR(s.substring(0, s.length() - 1));
		}
	}
}
