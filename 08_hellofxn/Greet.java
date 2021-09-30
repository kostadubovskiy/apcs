public class Greet {
	public static void main(String[] args) {
		System.out.println(greet("Kosta"));
		System.out.println(greet("Jack"));
		System.out.println(greet("Max"));
	}
	public static String greet(String name) {
		String result = "Why, hello there, " + name + ". How do you do?";
		return result;
	}
}
