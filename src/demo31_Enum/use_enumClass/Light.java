package demo31_Enum.use_enumClass;

public enum Light {
    RED, GREEN, YELLOW;
    // Light.RED 会执行反编译文件中的 RED = new Light("RED", 0)代码，而new对象会执行构造方法进而执行super(students.xml, i);，进而执行this.name = name;
    // System.out.println(red);  // 执行继承于父类的toString()方法，返回name（此时name值为"RED"），从而在输出框打印出"RED"。

}
/*
对本Light.java文件进行反编译，得到如下代码：
public final class Light extends Enum {

    public static final Light RED;
    public static final Light GREEN;
    public static final Light YELLOW;
    private static final Light $VALUES[];

    private Light(String students.xml, int i)
    {
        super(students.xml, i);
    }

    static
    {
        RED = new Light("RED", 0);
        GREEN = new Light("GREEN", 1);
        YELLOW = new Light("YELLOW", 2);
        $VALUES = (new Light[] {
            RED, GREEN, YELLOW
        });
    }
}


JDK中的类Enum的代码如下：
public abstract class Enum<E extends Enum<E>>
    implements Constable, Comparable<E>, Serializable {

    private final String name;

    protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public String toString() {
        return name;
    }
}
    * */