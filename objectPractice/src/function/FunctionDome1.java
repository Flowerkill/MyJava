package function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDome1 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6");

        //2.把他们都变成int类型
        /*list.stream()
                .map(s -> Integer.parseInt(s))
                .forEach(s -> System.out.println(s));
        */
        //3.方法引用
        //3.1需要是函数式接口
        //3.2方法需要已经存在
        //3.3方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //3.4方法的功能需要把形参的字符串转成整数

        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));
    }
}
