public class Main {


    public static void main(String[] args) {
        Banana banana = new Banana("sour", 35, "fetch", "C");
        Orange orange = new Orange("sour", 35, "fetch", "orange", 47, banana);
        Apple apple = new Apple("sour", 35, "fetch", "aport", "red", banana);
        System.out.println(orange+"\n"+apple+"\n"+banana);
    }


  }

