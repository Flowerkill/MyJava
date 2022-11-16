package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDome7 {
    public static void main(String[] args) {
//        map         转换流中的数据类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-16", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-20");
        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);

                return age;
            }
        }).forEach(s -> System.out.println(s));
*/

//        lambda表达式
        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
