package random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class random {
    public static void main(String[] args) {
        getRandomList().forEach(System.out::print);
        getSum();
    }

    public static List<Integer> getRandomList(){
        //int流获取数据，再装箱转为stream 进行集合返回
        IntStream inputStream = IntStream.range(1,100).filter(e -> e % 2 == 0);
        Stream<Integer> stream = inputStream.boxed();
        List<Integer> result = stream.collect(Collectors.toList());
        return result;
    }

    public static void getSum(){
        System.out.println("开始进行计算求和测试");
        int sum = 0;
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        sum = Arrays.stream(nums).sum();
        System.out.println(sum);
        sum = 0;
        sum = Arrays.stream(nums).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
