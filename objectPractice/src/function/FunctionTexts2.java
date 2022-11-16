package function;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionTexts2 {
    public static void main(String[] args) {
        /*
         *需求：
         *   创建集合添加学生对象
         * 学生对象属性：name,age
         * 要求：
         *       获取姓名并放到数组当中
         *       使用方法引用完成
         */
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));

        String[] arr = list.stream()
                .map(Student::getName)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(arr));

    }

}
