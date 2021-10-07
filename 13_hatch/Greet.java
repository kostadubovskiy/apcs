/* 
Joseph & Kosta: Featuring Duckie Po and Duckie Davie
APCS
HW09 -- What are BigSibs good for? — Varied Greetings
2021-10-04
*/

/*
DISCOVERIES
*/

/*
UNRESOLVED QUESTIONS
why static?
*/

public class Greet {
	public static void main( String[] args ) {
	  String greeting;
  
	  BigSib richard = new BigSib("Word up");
	  //richard.setHelloMsg("Word up");
  
	  greeting = richard.greet("freshman");
	  System.out.println(greeting);
  
	} //end main()
  } //end Greet
