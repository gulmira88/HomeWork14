public class Fruits  {

   private String taste;
   private int gram ;
   private String type;



    public Fruits(String taste, int gram, String type) {
        this.taste = taste;
        this.gram = gram;
        this.type = type;

    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "taste=" + taste +
                ", gram=" + gram +
                ", type='" + type + '\'' +
                '}';
    }
}

