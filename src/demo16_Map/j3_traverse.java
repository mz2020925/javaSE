package demo16_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class j3_traverse {
    public static void main(String[] args) {
        HashMap<String, String> strStrHashMap = new HashMap<>();
        strStrHashMap.put("01", "1245zmz");
        strStrHashMap.put("02", "qrezmz");
        strStrHashMap.put("03", "zmzqw");
        strStrHashMap.put("04", "zmzmmzmz");  // 后面会覆盖前面，其实就是修改
        strStrHashMap.put("05", "zmz");

        // 1.Map遍历方式一
        Set<String> keySet = strStrHashMap.keySet();
        for (String key : keySet) {
            String value = strStrHashMap.get(key);
            System.out.println(key + "=" + value);
        }

        // 2.Map遍历方式二
        // 获取所有键值对对象的集合，集合中存的是对象，这个对象代表着键值对
        Set<Map.Entry<String, String>> entrySet = strStrHashMap.entrySet();
        for (Map.Entry<String, String> me : entrySet) {
            // 从键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
