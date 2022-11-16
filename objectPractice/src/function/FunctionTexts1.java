package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionTexts1 {
    public static void main(String[] args) {
        /*
         * 集合中存储一些字符串的数据，比如：张三,23
         * 收集到Student类型的数组当中（使用方法引用完成）
         *
         * 数据："张三,23","李四,24","王五,25","赵六,26","钱七,27","周八,28"
         *
         * */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "李四,24", "王五,25", "赵六,26", "钱七,27", "周八,28");

        //先把字符串变成Student对象，然后再把Student对象收集起来
        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));

    }
}
