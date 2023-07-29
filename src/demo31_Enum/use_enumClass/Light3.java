package demo31_Enum.use_enumClass;

public enum Light3 {
    // 简化了 use_normalClass/Light3.java 中的代码
    RED("红"){
        @Override
        public void show() {
            System.out.println("红");
        }
    },
    GREEN("绿"){
        @Override
        public void show() {
            System.out.println("绿");
        }
    },
    YELLOW("黄"){
        @Override
        public void show() {
            System.out.println("黄");
        }
    };

    private String name;

    Light3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Light3{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void show();
}
