package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileTest6 {
    public static void main(String[] args) {
        /*
            需求：统计一个文件夹中每种文件的个数并打印（考虑子文件夹）
            打印格式如下
            txt:3个
            doc:4个
            jpg:6个
        * */
        File file = new File("D:\\dome");

        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);
    }

    public static HashMap<String, Integer> getCount(File src) {
        //map集合 键：后缀名  值：出现的次数
        HashMap<String, Integer> hm = new HashMap<>();
        //获取文件夹里的所有文件和文件夹放进数组中
        File[] files = src.listFiles();
        //遍历
        for (File file : files) {
            //判断是否是文件
            if (file.isFile()) {
                //获取文件名和和后缀名
                String name = file.getName();
                //以点拆开文件名和后缀名
                String[] split = name.split("\\.");
                //如果该数组长度小于2则表示该文件没有后缀名 可忽略
                if (split.length >= 2) {
                    //获取后缀名
                    String endName = split[split.length - 1];
                    //判断此后缀名在map集合中是否存在
                    if (hm.containsKey(endName)) {
                        //存在
                        //如果存在就获取此后缀名所统计的次数
                        int count = hm.get(endName);
                        //然后加1
                        count++;
                        //再重新放进map集合中
                        hm.put(endName, count);
                    } else {
                        //不存在

                        hm.put(endName, 1);
                    }
                }
            } else {
                //不是文件则递归

                //map是子文件夹中每一种文件的个数
                HashMap<String, Integer> map = getCount(file);
                //表示转成set集合 把每一个键值对看成一个整体放进set集合中
                Set<Map.Entry<String, Integer>> entries = map.entrySet();
                //遍历
                //entry表示每一个键值对对象
                for (Map.Entry<String, Integer> entry : entries) {
                    //获取子文件夹中记录的键
                    String key = entry.getKey();
                    //获取子文件夹中记录的值
                    int value = entry.getValue();
                    //判断这个键再hm集合中是否存在
                    if (hm.containsKey(key)) {
                        //存在
                        //获取此后缀名再hm集合中记录的个数
                        int count = hm.get(key);
                        //把hm集合中记录的个数和子文件夹中记录的个数相加
                        count += value;
                        //得到最终的值放进hm集合中
                        hm.put(key, count);
                    } else {
                        //不存在
                        //不存在则创建新的键值对
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }
}
