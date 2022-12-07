package demo16_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class j8_HashMap_example {
    public static void main(String[] args) {
        // 创建HashMap，键是编号，值是牌
        HashMap<Integer, String> intStrHashMap = new HashMap<>();
        // 创建ArrayList，用于存储编号--也就是HashMap的键
        ArrayList<Integer> intArrList = new ArrayList<>();
        // 创建花色数组和点数数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2"};

        // 从0开始往HashMap里面存储编号，并存储对应的牌。同时编号也要存储到ArrayList里面
        int index = 0;
        for (String num : numbers) {
            for (String col : colors) {
                intStrHashMap.put(index, col + num);
                intArrList.add(index);
                index++;
            }
        }
        intStrHashMap.put(index, "小王");
        intArrList.add(index);
        index++;
        intStrHashMap.put(index, "大王");
        intArrList.add(index);

        // 1.洗牌(洗的是编号)，用Collections的shuffle()方法实现
        Collections.shuffle(intArrList);

        // 2.发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接收)--注意编号（键）越小对应牌越小
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> rest = new TreeSet<>();

        for (int i = 0; i < intArrList.size(); i++) {
            int x = intArrList.get(i);  // x是扑克牌的编号（键）哦
            if (i >= intArrList.size() - 3) {
                rest.add(x);
            } else if (i % 3 == 0) {
                player1.add(x);
            } else if (i % 3 == 1) {
                player2.add(x);
            } else if (i % 3 == 2) {
                player3.add(x);
            }
        }
        // 3.看牌
        lookPoker("player1", player1, intStrHashMap);
        lookPoker("player2", player2, intStrHashMap);
        lookPoker("player3", player3, intStrHashMap);
        lookPoker("余下", rest, intStrHashMap);

        System.out.println(player1.size()+","+player2.size()+","+player3.size()+","+rest.size());
    }

    public static void lookPoker(String playerName, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(playerName + "的牌是：");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
