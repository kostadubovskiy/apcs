public class string2 {
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String current = str.substring(i, i + 1);
            result += current + current;
        }
        return result;
    }

    public int countHi(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                result++;
            }
        }
        return result;
    }

    public boolean catDog(String str) {
        boolean result = false;
        int cats = 0;
        int dogs = 0;
        if (str.length() < 3) {
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                dogs++;
            }
            if (str.substring(i, i + 3).equals("cat")) {
                cats++;
            }
        }
        if (cats == dogs) {
            result = true;
        }
        return result;
    }

    public int countCode(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co")) {
                if (str.substring(i + 3, i + 4).equals("e")) {
                    result++;
                }
            }
        }
        return result;
    }

    public boolean endOther(String a, String b) {
        String a2 = a.toLowerCase();
        String b2 = b.toLowerCase();
        if (b2.length() < a2.length()) {
            if (a2.substring(a2.length() - b2.length(), a2.length()).equals(b2)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (b2.substring(b2.length() - a2.length(), b2.length()).equals(a2)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean xyzThere(String str) {
        boolean result = false;
        if (str.length() < 3) {
          return false;
        }
        if (str.substring(0, 3).equals("xyz")){
          result = true;
        }
        for (int i = 1; i < str.length() - 2; i ++) {
          if (str.substring(i, i + 3).equals("xyz")) {
            result = true;
            if (str.substring(i - 1, i + 3).equals(".xyz")) {
              result = false;
            } else {
              result = true;
            }
          }
        }
        return result;
      }      
}
