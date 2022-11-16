import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
//      班级里有5个学生
//              要求：
//        被点到的学生不会再被点到。
//        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名
        //1.定义集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "杜琦燕", "袁明媛", "李猜", "田蜜蜜");
        //创建一个临时的集合，用来存以及被点到的学生名字
        ArrayList<String> tempList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("==============第" + i + "轮点名开始了==================");
            int count = list.size();
            Random r = new Random();
            for (int j = 0; j < count; j++) {
                //3.随机点名
                int index = r.nextInt(list.size());
                //String name = list.get(index);
                //list.remove(name);
                //remove方法传递元素则返回boolean值，传递索引则返回被删除的元素
                String name = list.remove(index);
                tempList.add(name);
                System.out.println(name);
            }
            //此时表示一轮点名结束
            //list空了tempList 有10个学生名字
            list.addAll(tempList);
            tempList.clear();

        }


    }

}
