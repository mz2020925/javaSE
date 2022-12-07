package demo20_Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class j4_example_game_count {
    public static void main(String[] args) {
        //从文件中读取数据存入Properties集合，用load()方法实现
        Properties prop = new Properties();
        try (FileReader fr = new FileReader("myFile2/propertiesGame.txt")) {
            // 为什么load需要放到try中呢，因为store是相当于读read的操作，这是流的操作，因此可能会发生IOException
            prop.load(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //通过Properties集合获取到玩游戏的次数（这个数据本来是存在文件中的）
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
        // 判断次数是否到到3次了,如果到了，给出提示：游戏试玩已结束，想玩请充值
        if (number >= 3) {
            System.out.println("游戏试玩已结束，想玩请充值");
        }else {
            j4_RandomGame.start();
            number++;
            // 修改文件中的游戏次数这个数据，先修改Properties集合中的键值对，再把集合写入文件
            // 就能把原来的游戏次数数据覆盖，从而达到修改的目的
            prop.setProperty("count", String.valueOf(number));
            try (FileWriter fw = new FileWriter("myFile2/propertiesGame.txt")) {
                // 为什么store需要放到try中呢，因为store是相当于写write的操作，这是流的操作，因此可能会发生IOException
                prop.store(fw, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
