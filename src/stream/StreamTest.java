package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<StreamModel> stream1 = new ArrayList<>();
        stream1.add(new StreamModel("王孝峰1","1","中国","20"));
        stream1.add(new StreamModel("王孝峰1","1","中国","21"));
        stream1.add(new StreamModel("王孝峰3","0","中国","22"));
        stream1.add(new StreamModel("王孝峰4","0","世界","19"));
        stream1.add(new StreamModel("王孝峰4","0","世界","19"));
        stream1.add(new StreamModel("王孝峰4","0","世界","19"));
        List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Agrin> argins = new ArrayList<>();
        argins.add(new Agrin(1,"玉米",2020,1,"2000"));
        argins.add(new Agrin(2,"玉米",2020,2,"2000"));
        argins.add(new Agrin(3,"玉米",2021,1,"2000"));
        argins.add(new Agrin(4,"小麦",2021,2,"2000"));
        argins.add(new Agrin(5,"小麦",2021,3,"2000"));
//        StreamNotNull(strings);
//        StreamDistnct(numbers);
//        StreamCopy(stream1);
//        getSortAndGroupAndFilter(stream1);
//        StreamAppend(stream1);
        streamGroup(stream1);
    }

    //过滤,分组，排序
    public static  void getSortAndGroupAndFilter(List<StreamModel> list){
        System.out.println("-----过滤分组排序-------------------");
        Map<String ,List<StreamModel>> resultMap = list.stream()
                .filter((StreamModel streamModel) -> streamModel.getAddres().equals("中国"))
                .sorted(new Comparator<StreamModel>() {
                    @Override
                    public int compare(StreamModel o1, StreamModel o2) {
                        return Integer.parseInt(o1.getSex())-Integer.parseInt(o2.getSex());
                    }
                })
                .collect(Collectors.groupingBy(StreamModel::getName));
        System.out.println(resultMap);
    }

    public static void StreamNotNull(List<String> list){
        List<String> filtered = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }

    public static void StreamDistnct(List<Integer> numbers){
        //去除重复数据
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
    }

    public static void StreamCopy(List<StreamModel> stream1){
        List<StreamModel> stream2 = new ArrayList<>();
        stream2 = stream1.stream().map(streamModel ->{
            StreamModel model = new StreamModel();
            model.setAddres("统一规划");
            model.setName(streamModel.getName());
            return model;
        }).collect(Collectors.toList());
        stream2.forEach(System.out::println);
    }

    public static void StreamAppend(List<StreamModel> stream1){
        System.out.println("----------测试字符串合并-----");
        String out = null;
        out = stream1.stream().map(StreamModel::getName).collect(Collectors.joining(",","开始:","||||结束"));
    }

    //专门的分组测试--分组后的键值可以自己定义
    public static void streamGroup(List<StreamModel> stream1){
        System.out.println("------分组测试  一级--------------------");
        Map<String,List<StreamModel>> map = new HashMap<>();
        map = stream1.stream().collect(Collectors.groupingBy(
                model ->{
                    if(Integer.parseInt(model.getAge())>=21) return EMEU.AGE_PRI;
                    if(Integer.parseInt(model.getAge())==20) return EMEU.AGE_MIDDLE;
                    else return EMEU.AGE_TEEN;
                }
        ) );
        System.out.println(map);
        System.out.println("------分组测试  一级  返回每个分组中年纪最大值--------------------");
        Map<String,StreamModel> mapMax = new HashMap<>();
        mapMax = stream1.stream().collect(Collectors.groupingBy(StreamModel::getSex,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(StreamModel::getAgeInt)),
                        Optional::get

                ))
        );
        System.out.println(mapMax);
        System.out.println("------分组测试  二级--------------------");
        Map<String,Map<String,List<StreamModel>>> mapMap = new HashMap<>();
        mapMap = stream1.stream().collect(Collectors.groupingBy(StreamModel::getSex,
                Collectors.groupingBy(StreamModel::getAddres)
                ));
        System.out.println(mapMap);

    }


    public void paraLlel(List<Integer> numbers){
        List<String> array = Arrays.asList("1","2");
        array.remove("1");
    }
}
