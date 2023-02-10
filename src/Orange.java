public class Orange extends Fruits {

private String color;
private double gram;
     Banana banana;

     public Orange(String taste, int gram, String type, String color, double gram1, Banana banana) {
          super(taste, gram, type);
          this.color = color;
          this.gram = gram1;
          this.banana = banana;
     }

     @Override
     public String toString() {
          return "Orange{" +
                  "color='" + color + '\'' +
                  ", gram=" + gram +
                  ", banana=" + banana +
                  '}';
     }
}





