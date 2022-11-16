package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamText2 {
    public static void main(String[] args) {
        /*
         * 创建一个ArrayList集合，并添加一下字符串，字符串前面是姓名，后面是年龄
         * "zhangsan, 23"
         * "lisi, 24"
         * "wangwu, 25"
         * 保留年龄大于等于24的人，并将结果收集到Map集合中，姓名为键，年龄为值
         * */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan, 23", "lisi, 24", "wangwu, 25");

        Map<String, Integer> map = list.stream()
                .filter(s -> 24 <= Integer.parseInt(s.split(", ")[1]))
                .collect(Collectors.toMap(s -> s.split(", ")[0],
                        s -> Integer.parseInt(s.split(", ")[1])));
        System.out.println(map);


    }
}
