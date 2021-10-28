public class twenty {
	public static void main(String[] args) {
		System.out.println(fence(1));
	}
	
	public static String fence(int n) {
		String fence = "|";
		for (int i = 0; i < n; i++) {
			fence += "--|";
		}
		return fence;
	}
}
