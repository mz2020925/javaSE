package demo16_Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class j7_count_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scan.nextLine();

        // 创建HashMap集合，键是Character，值是Integer
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            Integer value = hashMap.get(key);

            if (value == null) {
                //如果返回值是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储

                hashMap.put(key,1);
            }else{
                //如果返回值不是null：说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值

                value++;
                hashMap.put(key,value);
            }
        }

        //遍历HashMap集合，得到键和值，按照要求进行拼接
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hashMap.keySet();
        for (Character key:keySet){
            Integer value = hashMap.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);


    }
}
