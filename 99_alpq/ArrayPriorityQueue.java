public class ArrayPriorityQueue {
  /**
    ArrayPriorityQueue class
      IVs
        - ArrayList<>() al
        +
      Methods
        -
        +
  */

  private ArrayList<Integer> al = new ArrayList<Integer>();

  public void add(int x) {
    int ind = al.size() - 1;
    while (ind >= 0 && al.get(ind) < x) {
      ind--;
    }
    al.add(ind, x);
  }

  public boolean isEmpty() {
    return al.size() == 0;
  }

  public int peekMin() {
    return al.get(al.size() - 1);
  }

  public int removeMin() {
    return al.remove(al.size() - 1);
  }
}
