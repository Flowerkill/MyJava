package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    // 用于存储所有的牌，相当于牌盒
    static ArrayList<String> list = new ArrayList<>();

    static {
        //1.准备牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String c : color) {
            for (String n : number) {

                String s = c + n;
                list.add(s);

            }
        }
        list.add("小王");
        list.add("大王");
//        System.out.println(list);
    }

    public PokerGame() {
        //2.洗牌
        Collections.shuffle(list);

        System.out.println(list);
        //3.发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

        //4.看牌
        lookPoker("底牌", lord);
        lookPoker("钢脑壳", player1);
        lookPoker("大帅比", player2);
        lookPoker("蛋筒", player3);
    }

    //参数一：玩家的名字
    //参数二：每位玩家的牌
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}

