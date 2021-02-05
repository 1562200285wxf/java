package inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface PricateT<T> {

    public boolean test(T t);

    //list的数据泛型  传进去的判断对现象也是反向
    public static<T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        result=list.stream().filter(t ->p.test(t)).collect(Collectors.toList());
        return result;
    }
}
