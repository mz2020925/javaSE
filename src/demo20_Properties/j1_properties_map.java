package demo20_Properties;

import java.util.Properties;
import java.util.Set;

public class j1_properties_map {
    /*
    Properties介绍
        是一个Map体系的集合类
        Properties可以保存到流中或从流中加载
        M集合中的每个键及其对应的值都是一个字符串
    * */
    public static void main(String[] args) {
        // 创建集合对象
        // Properties<String,String> prop = new Properties<String,String>();
        // 不能写泛型<>，因为这个类不是泛型类。没有指定泛型，所以这里键和值是默认Object类型
        Properties prop = new Properties();
        prop.put("1", "zmz");
        prop.put("2", "zm");
        prop.put("3", "zxz");
        prop.put("4", "mz");

        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(value);
        }
    }
}
