package immutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableDome1 {
    public static void main(String[] args) {
        /*
         * 创建不可变的list集合
         * "张三","李四","王五","赵六"
         */

        List<String> list = List.of("张三", "李四", "王五", "赵六");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("---------------------------");

        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------");
        //普通for遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
