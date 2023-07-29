package demo31_Enum.use_enumClass;

public enum Light2 {
    // 现在式带参构造方法，所以枚举类的”元素“对象，要传递参数
    RED("红"), GREEN("绿"), YELLOW("黄");  // 这里隐含了对象的创建代码

    private String name;

    private Light2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Light2{" +
                "name='" + name + '\'' +
                '}';
    }
}
