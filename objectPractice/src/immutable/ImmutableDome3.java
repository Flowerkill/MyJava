package immutable;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ImmutableDome3 {
    public static void main(String[] args) {
        /*
         * 创建不可变的map集合
         * "张三","广西","李四","湖南","李蛋","四川","钱七","重庆","二狗","山东","王五","北京","赵六","广东","小宁","江西","小白","湖北","小黄","浙江"
         *
            细节1：
                    键是不能重复的
            细节2：
            *   map里面的of方法，参数是有上线的，最多只能传递20个参数，10个键值对
            细节3：
            *   如果我们要传递多个键值对对象，数量大于10个，在map接口中还有一个方法 ofEntrys
         */
        Map<String, String> map = Map.of("张三", "广西", "李四", "湖南", "李蛋", "四川", "钱七", "重庆", "二狗", "山东", "王五", "北京", "赵六", "广东", "小宁", "江西", "小白", "湖北", "小黄", "浙江");

        //获取到所有的键
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("-------------------------------------- ");

        //获取所有的键值对对象

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            //获取键
            String key = entry.getKey();
            //获取值
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("-------------------------------------- ");

    }
}
