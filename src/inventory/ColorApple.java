package inventory;

public class ColorApple implements ApplePredicate{

    private  String COLOR = "red";
    public boolean test(Apple apple){
        return apple.getColor().equals(COLOR);
    }
}
