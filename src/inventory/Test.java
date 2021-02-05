package inventory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        ApplePredicate appleColorPredicate = new ColorApple();
        List<Apple> list = Arrays.asList(new Apple("red","小苹果","1"),new Apple("green","大苹果","2"));
        filterApple(list,appleColorPredicate);
    }

    //使用策略模式调用判断方式
    public static void filterApple(List<Apple> list,ApplePredicate applePredicate){
        List<Apple> appleResult = new ArrayList<>();
        appleResult = list.stream().filter(apple ->
            applePredicate.test(apple)
        ).collect(Collectors.toList());
        appleResult.forEach(System.out::println);
    }

    public static void filterBananer(){
        PricateT<Bananer> p = new ColorBananer();
        List<Bananer> list = Arrays.asList(new Bananer("red","小苹果","1"),new Bananer("green","大苹果","2"));
//        List<Bananer> result = PricateT.filter(list,p);
    }

}
