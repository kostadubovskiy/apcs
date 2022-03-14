public class LLNode {
    private int car;
    private LLNode cdr;

    public int getCar() {
        return car;
    }

    public int getCdr() {
        return cdr;
    }

    public void setCar(int newVal) {
        car = newVal;
    }

    public void setCdr(LLNode newVal) {
        cdr = newVal;
    }
}
