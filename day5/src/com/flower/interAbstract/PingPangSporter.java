package com.flower.interAbstract;

public class PingPangSporter extends Sportsman implements English {
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("兵乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("兵乓球运动员在学习如何打兵乓球");
    }
}
