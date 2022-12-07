package demo1_baseRules;

public class j9_studentTest {
    public static void main(String[] args) {
        j9_studet studet = new j9_studet();
        System.out.println(studet.name);


        j9_studet studet1 = studet;
        System.out.println(studet1.age);

        studet.setGender("boy");
        System.out.println(studet.getGender());
    }
}
