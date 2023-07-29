package ex_StudentManage2;

import java.util.*;

//再新建一个管理学生的类
public class AdminStu {
    String msg="\t编号\t姓名\t年龄\tjava\tC\tSQL\t总分\t平均分";
    public void print(ArrayList<Student> arr){//用来刷新数据的
        System.out.println(msg);
        /*for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=null){
                arr.get(i).setSum();
                arr.get(i).setAvg();
                System.out.println(arr.get(i));
            }
        }*/
        for (Student student : arr) {
            if (student != null) {
                student.setSum();
                student.setAvg();
                System.out.println(student);
            }
        }
    }

    public boolean exist(int no,Student stu){//判断学生是否存在
        if(stu!=null){
            /*if(stu.getNo()==no){
                return true;
            }else{
                return false;
            }*/
            return stu.getNo() == no;
        }
        return false;
    }

    public void add(String name,int age,ArrayList<Student> arr, int total_stu){//添加学生的方法
        Student stu=new Student();
        stu.setName(name);
        stu.setAge(age);
        //int i=this.setIndex(arr, total_stu);
        stu.setNo(arr.size()+1);
        if(arr.size()==total_stu){
            System.out.println("学生人数达到最大，不能再添加了");
        }else{
            arr.add(stu);
        }
        this.print(arr);
    }

    /*public int setIndex(ArrayList<Student> arr, int total_stu){//返回数组里面为空的下标
        System.out.println("arraylist长度:"+arr.size());
        for(int i=0;i<total_stu;i++){
            if(arr.get(i)==null){
                return i;
            }
        }
        return 99999;
    }*/

    public void find(int no,ArrayList<Student> arr){//查询方法
        System.out.println(msg);
        /*for(int i=0;i<arr.size();i++){
            if(this.exist(no,arr.get(i))){
                System.out.println(arr.get(i));
                return;
            }
        }*/
        for (Student student : arr) {
            if (this.exist(no, student)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("--没有这个学生的存在--");
    }



    public void update(int no,String name,int age,ArrayList<Student> arr){//更新学员信息
        for(int i=0;i<arr.size();i++){
            if(this.exist(no,arr.get(i))){
                arr.get(i).setName(name);
                arr.get(i).setAge(age);
                System.out.println("---更新学生信息成功--");
                this.print(arr);
                return;
            }
        }
        System.out.println("没找到这个学生更新信息失败");
    }
    public void delete(int no,ArrayList<Student> arr){
        for(int i=0;i<arr.size();i++){
            if(this.exist(no,arr.get(i))){
                arr.remove(i);
                this.print(arr);
                return;
            }
        }
        System.out.println("您所指定编号的学生没有存在");
    }
    public void input(int no,ArrayList<Student> arr){//输入学生成绩的操作
        for(int i=0;i<arr.size();i++){
            if(this.exist(no, arr.get(i))){
                System.out.println("请输入"+arr.get(i).getName()+"Java的成绩");
                Scanner in=new Scanner(System.in);
                if(in.hasNextInt()){
                    arr.get(i).setJava(in.nextInt());
                }
                System.out.println("请输入"+arr.get(i).getName()+"C的成绩");
                if(in.hasNextInt()){
                    arr.get(i).setC(in.nextInt());
                }
                System.out.println("请输入"+arr.get(i).getName()+"SQL的成绩");
                if(in.hasNextInt()){
                    arr.get(i).setSql(in.nextInt());
                }
                this.print(arr);
                break;
            }
        }
        System.out.println("您所指定编号的学生没有存在");
    }
    public void couSort(int num,ArrayList<Student> arr){//根据指定的科目进行排序操作
        if(num==1){
            for(int i=0;i<arr.size()-1;i++){
                for(int j=i+1;j<arr.size();j++){
                    if(arr.get(i)!=null&&arr.get(j)!=null){
                        if(arr.get(i).getJava()<arr.get(j).getJava()){
                            Student t=arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, t);
                        }
                    }
                }
            }
        }else if(num==2){
            for(int i=0;i<arr.size()-1;i++){
                for(int j=i+1;j<arr.size();j++){
                    if(arr.get(i)!=null&&arr.get(j)!=null){
                        if(arr.get(i).getC()<arr.get(j).getC()){
                            Student t=arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, t);
                        }
                    }
                }
            }
        }else if(num==3){
            for(int i=0;i<arr.size()-1;i++){
                for(int j=i+1;j<arr.size();j++){
                    if(arr.get(i)!=null&&arr.get(j)!=null){
                        if(arr.get(i).getSql()<arr.get(j).getSql()){
                            Student t=arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, t);
                        }
                    }
                }
            }
        }
        this.print(arr);
    }
    public void sumSort(ArrayList<Student> arr){//根据总分进行排序
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)!=null&&arr.get(j)!=null){
                    if(arr.get(i).getSum()<arr.get(j).getSum()){
                        Student t=arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, t);
                    }
                }
            }
        }
        this.print(arr);
    }
}
