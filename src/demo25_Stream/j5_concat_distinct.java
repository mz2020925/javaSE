package demo25_Stream;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.stream.Stream;

public class j5_concat_distinct {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("林青霞");
        strArrList.add("张曼玉");
        strArrList.add("王祖贤");
        strArrList.add("柳岩");
        strArrList.add("张敏");
        strArrList.add("张无忌");

        //需求1：取前4个数据组成一个流
        Stream<String> stream1 = strArrList.stream().limit(4);

        //需求2：跳过2个数据组成一个流
        Stream<String> stream2 = strArrList.stream().skip(2);

        //需求3：合并需求1和需求2得到的流，并把结果在控制台输出
        Stream.concat(stream1, stream2).forEach(System.out::println);

        //需求4：合并需求1和需求2得到的流，并把结果在控制台输出，要求字符串元素不能重复
        Stream.concat(stream1, stream2).distinct().forEach(System.out::println);

    }
}
