/* 
Joseph & Kosta: Featuring Duckie Po and Duckie Davie
APCS
HW12 -- on Elder Individuality
2021-10-04
*/

public class BigSib {
	public void constructor() {
		String helloMsg;
	}
	
	public static void setHelloMsg (String newHelloMsg) {
		helloMsg = newHelloMsg;
	}

	public static String greet (String greeting) {
		String result = helloMsg + " " + greeting;
		return result;
	}
}
