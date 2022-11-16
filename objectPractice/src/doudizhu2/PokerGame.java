package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    // 牌盒 Map
    //此时我们只要把牌跟序号产生对应关系就可以了，不需要进行排序，所以只要HashMap就可以了
    static HashMap<Integer, String> hm = new HashMap<>();


    static ArrayList<Integer> list = new ArrayList<>();

    static {
        int serialNumber = 1;
        //1.准备牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String n : number) {

            for (String c : color) {
                hm.put(serialNumber, c + n);

                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;


        hm.put(serialNumber, "大王");
        list.add(serialNumber);

        System.out.println(hm);
    }

    public PokerGame() {
        //2.洗牌
        Collections.shuffle(list);

        System.out.println(list);
        //3.发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);

            }

        }
        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);


        //4.看牌
        lookPoker("底牌", lord);
        lookPoker("钢脑壳", player1);
        lookPoker("大帅比", player2);
        lookPoker("蛋筒", player3);
    }

    //参数一：玩家的名字
    //参数二：牌的序号
    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ": ");
        for (int serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }

        System.out.println();
    }
}

