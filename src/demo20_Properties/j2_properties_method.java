package demo20_Properties;

import java.util.Properties;
import java.util.Set;

public class j2_properties_method {
    public static void main(String[] args) {
        // Object setProperty(String key, String value) -- 设置集合的键和值，都是String类型(不是前面不指定泛型时的默认Object类型)，底层调用Hashtable方法 put
        // String getProperty(String key) -- 使用此属性列表中指定的键搜索属性
        // Set stringPropertyNames() -- 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Properties prop = new Properties();
        prop.setProperty("1","张明志");
        prop.setProperty("2","哈哈哈");
        prop.setProperty("3","啊啊啊");

        System.out.println(prop);

        System.out.println(prop.getProperty("1"));
        System.out.println(prop.getProperty("34"));

        Set<String> names = prop.stringPropertyNames();
        System.out.println(names);
        for (String name : names) {
            System.out.println(prop.getProperty(name));
        }

    }
}
