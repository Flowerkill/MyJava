package com.flower.interAbstract;

public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter("刘诗雯", 23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();

        pps.speakEnglish();
    }
}
