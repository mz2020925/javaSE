package demo16_Map;

import java.util.HashMap;
import java.util.Map;

public class j1_map {
    public static void main(String[] args) {
        // Map是一个接口，我们需要通过它的实现类来创建对象
        Map<String,String> map = new HashMap<>();
        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("01","1245zmz");
        map.put("02","qrezmz");
        map.put("03","zmzqw");
        map.put("03","zmzmmzmz");  // 后面会覆盖前面，其实就是修改
        // 查看这个方法返回值是什么 -- 是null
        System.out.println(map.put("04", "zmz"));
        System.out.println(map);

        //V remove(Object key)：根据键删除键值对元素
        System.out.println(map.remove("郭靖"));
        System.out.println(map.remove("郭襄"));

        //void clear()：移除所有的键值对元素
        map.clear();

        //boolean containsKey(Object key)：判断集合是否包含指定的键
        System.out.println(map.containsKey("郭靖"));
        System.out.println(map.containsKey("郭襄"));

        //boolean isEmpty()：判断集合是否为空
        System.out.println(map.isEmpty());

        //int size()：集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());
    }
}
