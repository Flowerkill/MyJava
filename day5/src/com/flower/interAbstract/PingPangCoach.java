package com.flower.interAbstract;

public class PingPangCoach extends Coach implements English {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("兵乓球教练在教兵乓球运动员打兵乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("兵乓球教练在说英语");

    }
}
