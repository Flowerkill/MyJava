package com.flowerkill.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        //1.创建一个集合
        ArrayList<Character> list = new ArrayList<>();//52 索引范围：0~51；
        //2.添加字母 a-z  A-Z
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));//a-z
            list.add((char) ('A' + i));//A-Z
        }
        //3.打印集合
        System.out.println(list);
        //4.生成4个随机字母
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(list.size());
            char c = list.get(randomIndex);
            result = result + c;
        }
        return result;
    }
}
