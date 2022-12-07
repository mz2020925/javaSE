package demo11_List;

import java.util.ArrayList;
import java.util.List;

public class j2_ListMethod {
    public static void main(String[] args) {
        List<String> lsStr = new ArrayList<String>();
        // 1.add()
        lsStr.add("zmz");
        lsStr.add("qiu");
        lsStr.add("asdf");
        // 在指定索引处插入元素 -- 索引不能越界
        lsStr.add(2,"java");

        // 2.remove() -- 返回被删除的元素 -- 索引不能越界
        System.out.println(lsStr.remove(0));

        // 3.set() -- 修改指定索引处的元素，返回原来那个元素（被修改的元素） -- 索引不能越界
        System.out.println(lsStr.set(0, "zmmmmmmm"));
        System.out.println(lsStr);

        // 4.get() -- 索引不能越界
        System.out.println(lsStr.get(0));

        // 5.size()方法
        System.out.println(lsStr.size());

        // 6.for循环遍历，上面那个文件中还用迭代器实现了List的遍历
        for (int i = 0; i < lsStr.size(); i++) {
            System.out.println(lsStr.get(i));  // List时不能使用索引来取值的, List[0]是不可以的
        }

        //

    }
}
