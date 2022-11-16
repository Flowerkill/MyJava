package immutable;

import javax.xml.transform.Source;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ImmutableDome2 {
    public static void main(String[] args) {
        /*
         * 创建不可变的set集合
         * "张三","李四","王五","赵六"
         *
         *
         * 细节：
         *      当我们要获取一个不可变的Set集合时，里面的阐述一定要保证唯一行
         */


        Set<String> set = Set.of("张三", "李四", "王五", "赵六");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------------");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------------------");


    }
}
