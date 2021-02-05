package stream;


public class StreamModel {
    private String name;
    private String sex;
    private  String addres;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public StreamModel(String name, String sex, String addres) {
        this.name = name;
        this.sex = sex;
        this.addres = addres;
    }
    public StreamModel(){
    }

    @Override
    public String toString() {
        return "StreamModel{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", addres='" + addres + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public StreamModel(String name, String sex, String addres, String age) {
        this.name = name;
        this.sex = sex;
        this.addres = addres;
        this.age = age;
    }

    public String getNameAddress(){
        return name+addres;
    }

    public int getAgeInt(){
        return Integer.parseInt(this.age);
    }
}
