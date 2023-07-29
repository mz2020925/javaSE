package demo30_Design_Mode.Teacher;

public class Teacher {
    private Teacher(){}

    private static Teacher t = null;

    public static Teacher getTeacher(){
        if (t==null){
            t = new Teacher();
        }
        return t;
    }
}
