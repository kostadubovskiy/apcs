/* 
YAK-y Duckies: Featuring Duckie Paul and Duckie Davie
APCS
HW09 -- What are BigSibs good for? — Varied Greetings
2021-10-04
*/

/*
DISCOVERIES
*/

/*
UNRESOLVED QUESTIONS
*/

public class Greet {
	public static void main( String[] args ) {
	  String greeting;
  
	  BigSib richard = new BigSib();
	  richard.setHelloMsg("Word up");
  
	  greeting = richard.greet("freshman");
	  System.out.println(greeting);
  
	} //end main()
  } //end Greet