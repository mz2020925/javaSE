package demo25_Stream;

import java.util.*;
import java.util.stream.Stream;

public class j2_GeneratorStream {
    public static void main(String[] args) {
        // 1.Collection体系中的集合可以使用默认方法stream()直接生成流
        // 1.1Collection体系中的集合--子类 List
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        // 1.2Collection体系中的集合--子类 Set
        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        // 2.Map体系的集合间接的生成流,通过map.keySet()、map.values()或map.entrySet()生成流，因为这三者属于Collection
        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        // 3.数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] arr = {"hello", "world", "java"};
        Stream<String> strArrStream = Stream.of(arr);
        Stream<String> stringStream = Stream.of("hello", "world", "java");
        Stream<Integer> integerStream = Stream.of(10, 20, 334);
    }
}
