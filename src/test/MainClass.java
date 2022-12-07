package test;

import java.util.*;
public class MainClass {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("--请定义人数--");
        int total_stu=in.nextInt();
        ArrayList<Student> stuArr=new ArrayList<Student>(total_stu);
        AdminStu admin=new AdminStu();
        while(true){
            System.out.println("--你要执行的功能:--");
            System.out.println("0:添加一个学生");
            System.out.println("1:查找一个学生");
            System.out.println("2:根据编号更新学生的基本信息");
            System.out.println("3:根据编号删除学生--");
            System.out.println("4:根据编号输入学生的各门成绩");
            System.out.println("5:根据某门成绩进行排序");
            System.out.println("6:根据总分进行排序");
            System.out.println("9:退出系统");
            int number=in.nextInt();
            if(number==0){
                System.out.println("请输入学生的姓名：");
                String name=in.next();
                System.out.println("请输入学生的年龄:");
                int age=in.nextInt();
                admin.add(name,age,stuArr, total_stu);//添加学生

            }
            else if(number==1){
                System.out.println("执行查找学生的基本信息操作");
                System.out.println("请输入学生的编号进行查找:");
                int no=in.nextInt();
                admin.find(no,stuArr);
            }else if(number==2){
                System.out.println("执行更新学员的基本信息");
                System.out.println("请输入学生的编号：");
                int no=in.nextInt();
                System.out.println("请输入学生的姓名：");
                String name=in.next();
                System.out.println("请输入学生的年龄:");
                int age=in.nextInt();
                admin.update(no, name, age, stuArr);
            }else if(number==3){
                System.out.println("执行删除操作");
                System.out.println("请输入学生的编号:");
                int no=in.nextInt();
                admin.delete(no,stuArr);
            }else if(number==4){
                System.out.println("执行输入成绩操作");
                System.out.println("请输入学生的编号:");
                int no=in.nextInt();
                admin.input(no,stuArr);
            }else if(number==5){
                System.out.println("执行根据某科成绩排序操作");
                System.out.println("请确定课程:1.java 2.C 3.sql");
                int num=in.nextInt();
                admin.couSort(num, stuArr);
            }else if(number==6){
                System.out.println("执行根据总分排序操作");
                admin.sumSort(stuArr);
            }else if(number==9){
                System.out.println("程序结束");
                System.exit(0);
            }

        }


    }
}
