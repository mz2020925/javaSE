package ex_StudentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManager {
    public static void main(String[] args) {
        // 创建存储学生对象的集合，类似于数据库
        ArrayList<student> arrls = new ArrayList<>();

        while (true) {
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.print("1 添加学生\n2 删除学生\n3 修改学生\n4 查看所有学生\n5 退出\n请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            if (line.equals("5")) {
                System.out.println("退出...");
//                System.exit(0);
                break;
            }
            switch (line) {
                /*case "1" -> {  // jdk8不支持这样的语法
                    System.out.println("添加学生...");
                    addStudent(arrls);
                }
                case "2" -> {
                    System.out.println("删除学生...");
                    deleteStudent(arrls);
                }
                case "3" -> {
                    System.out.println("修改学生...");
                    updateStudent(arrls);
                }
                case "4" -> {
                    System.out.println("查看所有学生...");
                    printAllStudent(arrls);
                }*/
                case "1" : {
                    System.out.println("添加学生...");
                    addStudent(arrls);
                }
                case "2" : {
                    System.out.println("删除学生...");
                    deleteStudent(arrls);
                }
                case "3" : {
                    System.out.println("修改学生...");
                    updateStudent(arrls);
                }
                case "4" : {
                    System.out.println("查看所有学生...");
                    printAllStudent(arrls);
                }

            }
        }

    }

    // 添加
    public static void addStudent(ArrayList<student> arrls) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("请输入学生学号：");
            String idTemp = sc.nextLine();
            if (idIsUesd(arrls, idTemp)) {
                System.out.println("学号已存在，请重新输入");
            }else {
                id = idTemp;
                break;
            }
        }
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生居住地：");
        String address = sc.nextLine();

        student std = new student(id, name, age, address);
        arrls.add(std);
        System.out.println("添加学生成功！");
    }

    public static void printAllStudent(ArrayList<student> arrls) {
        if (arrls.size() == 0) {
            System.out.println("无信息！");
        } else {
            System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
            for (student obj : arrls) {
                System.out.printf("%students.xml\t\t%students.xml\t%s岁\t%students.xml\n", obj.getId(), obj.getName(), obj.getAge(), obj.getAddress());
            }
        }
    }

    public static void deleteStudent(ArrayList<student> arrls) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要删除的学生的学号：");
        String id = sc.nextLine();
        // obj是arrls中的元素，记住这种结构，是for(obj : arrls)的进一步简化
        boolean flag = arrls.removeIf(obj -> obj.getId().equals(id));
        if (flag) {
            System.out.println("删除学生成功！");
        } else {
            System.out.println("无信息！");
        }
    }

    public static void updateStudent(ArrayList<student> arrls) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要修改的学生的学号：");
        String id = sc.nextLine();

        boolean flag = true;
        for (student obj : arrls) {
            if (obj.getId().equals(id)) {
                System.out.print("请输入新姓名");
                String name = sc.nextLine();
                System.out.print("请输入新年龄");
                String age = sc.nextLine();
                System.out.print("请输入新居住地");
                String address = sc.nextLine();
                obj.setName(name);
                obj.setAge(age);
                obj.setAddress(address);
                System.out.println("修改学生成功！");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("无信息！");
        }
    }

    public static boolean idIsUesd(ArrayList<student> arrls, String id){
        boolean flag =false;
        for (student obj :
                arrls) {
            if (obj.getId().equals(id)) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}
