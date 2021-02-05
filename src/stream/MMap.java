package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MMap {
    public static void main(String[] args) {
        List<String> arrays = Arrays.asList("1","2","3","4");
        List<String> strs = new ArrayList<>();
        strs.add("1");strs.add("2");strs.add("3");strs.add("4");strs.add("5");
        removeTest(strs);
    }

    public static void removeTest(List<String> strs){
        System.out.println("-------------迭代器对象删除节点信息----------");
        Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("1"))
                iterator.remove();
        }
        strs.forEach(System.out::println);
        System.out.println("----测试removeif-------------------");
        strs.removeIf(str ->str.equals("2"));
        strs.forEach(System.out::println);
    }
}
