package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDome9 {
    public static void main(String[] args) {
        /*
         * collection(Collector collector)       收集流中的数据，放到集合中（list set map)
         * */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-16", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-20");

        //收集List集合当中
        //需求：
        //我要把所有的男性收集起来

        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
//        System.out.println(newList);

        //收集Set集合当中
        //需求：
        //我要把所有的男性收集起来
        Set<String> newSet = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
//        System.out.println(newSet);

        //收集Map集合当中
        //需求：
        //我要把所有的男性收集起来
        //键：姓名
        //值：年龄
       /* Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {


                                                  return s.split("-")[0];

                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {

                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));
*/
//        lambda表达式
        Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(newMap);

    }
}
