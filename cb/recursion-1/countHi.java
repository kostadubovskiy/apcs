public class countHi {
    public int countHi(String str) {
        if(str.length() <= 2) {
          if(str.equals("hi")) {
            return 1;
          } else {
            return 0;
          }
        } else {
          String rest = str.substring(1, str.length());
          String first = str.substring(0, 2);
          if(first.equals("hi")) {
            return 1 + countHi(rest);
          } else { 
            return countHi(rest);
          }
        }
      }
      
}
