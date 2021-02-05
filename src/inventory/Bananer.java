package inventory;

public class Bananer {

    private  String color;
    private String name;
    private String size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Bananer(String color, String name, String size) {
        this.color = color;
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bananer{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
