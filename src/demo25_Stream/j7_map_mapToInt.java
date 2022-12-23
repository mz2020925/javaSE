package demo25_Stream;

import java.util.ArrayList;

/*
* <R> Stream<R> map(Function<? super T, ? extends R> mapper),返回由给定函数应用于此流的元素的结果组成的流
*   Function函数式接口中的抽象方法 R apply(T t)
*
* IntStream mapToInt(ToIntFunction<? super T> mapper):返回一个将给定函数应用于此流元素的结果
*   IntStream：表示原始int流
*   ToIntFunction函数式接口中的抽象方法 int applyAsInt(T value)
* */
public class j7_map_mapToInt {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("20");
        strArrList.add("30");
        strArrList.add("40");
        strArrList.add("50");

        // 需求：将集合中的字符串数据转换为整数之后在控制台输出
        strArrList.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
        strArrList.stream().map(Integer::parseInt).forEach(System.out::println);
        strArrList.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        System.out.println("---------");
        // 需求2：int sum() 返回此流中元素的总和
        int sum = strArrList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
