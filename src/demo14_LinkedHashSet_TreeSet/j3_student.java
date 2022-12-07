package demo14_LinkedHashSet_TreeSet;

public class j3_student implements Comparable<j3_student> {
    private String name;
    private int age;

    public j3_student() {
    }

    public j3_student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(j3_student stu) {  // 继承了Comparable<j3_student>接口，记住这是自然排序（升序）接口，接口具有抽象性，需要重写它的抽象方法
        // return 0;  // 返回0，那么在j3_Comparable主函数中，在添加第二个元素的时候会认为它和第一个元素相同，不再添加，依此类推
        // return 1;  // 返回1，那么在j3_Comparable主函数中，在添加第二个元素的时候会认为它比第一个元素大，放在第一个元素后面，依此类推，最终打印输出对象集合的顺序就是添加的顺序
        // return -1;  // 返回-1，与上述相反，按照添加顺序的倒序打印


        // 按照年龄从大到小打印输出
        // int num = stu.age - this.age;
        // return num;

        // 按照年龄从小到大打印输出，主要条件
        int num = this.age - stu.age;
        // return num;  // num若为正，则this(前一个对象).age 小于 stu(后一个对象).age，会把后一个对象放在前一个对象后面，反之，会把后一个对象插入到前一个对象的前面
                    // 这里要注意如果num=0，则他会认为后一个元素和前一个元素是相同的，就不会再添加，我们需要比较姓名，来进行添加，如下:
        // 按照姓名从小到大打印输出（从小到大：a<z），次要条件
        int num2 = num==0?this.name.compareTo(stu.name) : num;  // 这里为什么不用equals()来比较字符串呢，因为compareTo方法不仅可以比较还可以返回一个用于自然排序的数
        return num2;



    }
}
