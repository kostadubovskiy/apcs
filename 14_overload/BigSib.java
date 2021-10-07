/* 
Joseph & Kosta: Featuring Duckie Po and Duckie Davie
APCS
HW13 -- BigSib hatch
2021-10-04
*/

/* DISCO
Can't use non-static attribute/method pair in this case
*/

/* QCC
*/

public class BigSib {
	public static String helloMsg;

	public BigSib(String newHelloMsg) {
		helloMsg = newHelloMsg;
	}
	
	public static void setHelloMsg (String newHelloMsg) {
		helloMsg = newHelloMsg;
	}

	public static String greet (String greeting) {
		String result = helloMsg + " " + greeting;
		return result;
	}
}
