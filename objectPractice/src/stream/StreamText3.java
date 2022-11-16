package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamText3 {
    public static void main(String[] args) {
        /*
         * 现在有两个ArrayList集合，分别存储6名男演员的名字和年龄以及6名女演员的名字和年龄
         * 姓名和年龄中间用逗号隔开
         * 要求完成如下的操作：
         * 1.男演员只要名字为3个字的前两人
         * 2.女演员只要姓杨的，并且不要第一个
         * 3.把过滤后的男演员姓名和女演员姓名结合并到一起
         * 4.将上一步的演员姓名封装成Actor对象
         * 5.将所有的演员对象都保存到List集合中
         * 备注：演员类Actor，属性有：name，age
         *
         * 男演员："蔡坤坤,24","叶齁咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27"
         * 女演员："赵小颖,35","杨颖,36","高元元,43","张天天,31","刘诗,35","杨小幂,33"
         * */

        //1.创建集合
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(list2, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");


        //1.男演员只要名字为3个字的前两人
        List<String> newList1 = list1.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(newList1);

        //2.女演员只要姓杨的，并且不要第一个
        List<String> newList2 = list2.stream()
                .filter(s -> s.startsWith("杨"))
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(newList2);

        //3.把过滤后的男演员姓名和女演员姓名结合并到一起
        Stream<String> concat = Stream.concat(newList1.stream(), newList2.stream());

        //4.将上一步的演员姓名封装成Actor对象
        /*concat.map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);

                return new Actor(name, age);
            }
        }).forEach(s -> System.out.println(s));
*/

        //lambda表达式
        List<Actor> list = concat.map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        //5.将所有的演员对象都保存到List集合中
        System.out.println(list);


    }

}
