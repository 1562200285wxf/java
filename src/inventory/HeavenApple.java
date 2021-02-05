package inventory;

public class HeavenApple implements ApplePredicate{

    private static int SIZE = 150;
    public boolean test(Apple apple){
        return Integer.parseInt(apple.getSize())>SIZE;
    }
}
