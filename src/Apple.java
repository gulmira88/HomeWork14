public class Apple extends Fruits {

    private String sort;
    private String color;
    Banana banana;

    public Apple(String taste, int gram, String type, String sort, String color, Banana banana) {
        super(taste, gram, type);
        this.sort = sort;
        this.color = color;
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "sort='" + sort + '\'' +
                ", color='" + color + '\'' +
                ", banana=" + banana +
                '}';
    }
}
