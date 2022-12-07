package demo16_Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class j4_studentDemo {
    public static void main(String[] args) {
        // 1.创建学生对象
        j4_student j4Stu1 = new j4_student("zmz",23);
        j4_student j4Stu2 = new j4_student("qrg",19);
        j4_student j4Stu3 = new j4_student("asd",32);

        // 2.创建集合
        HashMap<String, j4_student> hashMap = new HashMap<>();

        // 3.把学生对象添加到集合
        hashMap.put("01",j4Stu1);
        hashMap.put("02",j4Stu2);
        hashMap.put("03",j4Stu3);

        // 4.遍历这个存有学生对象的集合
        // 4.1通过创建 键的集合，然年后遍历这个集合来找 值
        Set<String> keySet = hashMap.keySet();
        for (String key:keySet){
            j4_student value = hashMap.get(key);
            System.out.println(value);  // 我在类中重写了toString方法，可以直接打印出属性
        }

        // 4.2通过创建 键值对对象 的集合，然后遍历这个集合来找 值
        Set<Map.Entry<String, j4_student>> entries = hashMap.entrySet();
        for (Map.Entry<String, j4_student> entry: entries){
            String key = entry.getKey();
            j4_student value = entry.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        // 5.创建一个HashMap集合，现在把学生对象作为键，把 居住地址 作为键的值
        // 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
        // 5.1创建集合（创建的时候需要指定键的类型和值的类型）
        HashMap<j4_student,String> hashMap2 = new HashMap<>();

        // 5.2把学生对象添加到集合
        hashMap2.put(j4Stu1,"四川");
        hashMap2.put(j4Stu2,"合肥");
        hashMap2.put(j4Stu3, "安徽");

        // 5.3


    }
}
