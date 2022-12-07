package demo16_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class j2_Keys_Values {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("01","1245zmz");
        hashMap.put("02","qrezmz");
        hashMap.put("03","zmzqw");
        hashMap.put("04","zmzmmzmz");  // 后面会覆盖前面，其实就是修改
        hashMap.put("05", "zmz");

        // 根据键返回其对应的值
        System.out.println(hashMap.get("05"));
        System.out.println(hashMap.get("06"));

        // Set<K> keySet():获取所有键的集合
        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);

        // Collection<V> values():获取所有值的集合
        Collection<String> values = hashMap.values();
        for(String element:values){
            System.out.println(element);
        }
    }

}
