package stream;

public class Agrin {
    private int id;
    private String name;
    private int year;
    private int month;
    private String out;

    public Agrin(int id, String name, int year, int month, String out) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.month = month;
        this.out = out;
    }

    @Override
    public String toString() {
        return "Agri{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", out='" + out + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
}
