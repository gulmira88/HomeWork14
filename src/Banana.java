public class Banana extends Fruits {
    private String Vitamin;

    public Banana(String taste, int gram, String type, String vitamin) {
        super(taste, gram, type);
        Vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "Vitamin='" + Vitamin + '\'' +
                '}';
    }
}
