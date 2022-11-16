package immutable;

import javax.lang.model.element.NestingKind;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDome4 {
    public static void main(String[] args) {
        /*
         * 创建map的不可边集合，键值对的数量超过10个
         * */
        //1.创建一个普通的map集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "广西");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("钱七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");

        //2.利用上面的数据来获取一个不可变的集合
        //获取到所有的键值对对象（Entry对象）
//        Set<Map.Entry<String, String>> entries = hm.entrySet();
//        //把entrys 变成一个数组
//        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
//
//        //不可变的map集合
//        Map map = Map.ofEntries(arr);
//        map.put("bbb", "222");

//        Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
//        map.put("bbb", "222");

        //不可变的map集合
        //jdk10 以后才能用
        Map<String, String> map = Map.copyOf(hm);
    }
}
