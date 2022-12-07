package demo8_often_api;

public class j3_Object {
    public static void main(String[] args) {
        // 3.Object中的toString()方法和equals()
        Student stu = new Student();
        stu.setName("zmz");
        stu.setAge(22);
        System.out.println(stu);  // println(stu)这句代码到底发生了上面
        /*
        public void println(Object x) {
            String s = String.valueOf(x);
            if (getClass() == PrintStream.class) {
                // need to apply String.valueOf again since first invocation
                // might return null
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }*/

        /*
        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }*/

        /*
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/
        System.out.println(stu.toString());  // stu中本没有toString()方法，但所有的类都继承超类Object，而且是建议每个类自己重写toStrong()方法

        // 重写equals方法，可以实现比较对象的属性（成员变量）值是否相同。如果不重写，那么默认比较的引用值（地址值）
        Student stu1 = new Student();

        Student stu2 = new Student();
        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.getClass());
    }
}
