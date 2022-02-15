public class countX {
    public int countX(String str) {
        if(str.length() <= 1) {
          if(str.equals("x")) {
            return 1;
          } else {
            return 0;
          }
        } else {
          String rest = str.substring(1, str.length());
          String first = str.substring(0, 1);
          if(first.equals("x")) {
            return 1 + countX(rest);
          } else { 
            return countX(rest);
          }
        }
      }    
}
  