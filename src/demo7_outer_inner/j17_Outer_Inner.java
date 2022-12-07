package demo7_outer_inner;

public class j17_Outer_Inner {

    // 外部类访问内部类的成员变量/方法必须先创建对象,例如成员方法show(),内部类访问外部可以直接访问
    // 内部类分为成员内部类和局部内部类
    private int num = 10;



    public class inner{  // 这是成员内部类
        public void show(){
            System.out.println("public内部类方法show()输出成员变量private int num" + num);
        }
    }
    public void show(){ // 我想在本类中调用内部类inner中的show方法，必须新建一个成员方法，在里面inner in=new inner()，再in.show()
        inner in = new inner();
        in.show();
    }


    private class priinner{  // 这也是成员内部类，而且常用private修饰，
        public void show(){
            System.out.println("private内部类方法show()输出成员变量private int num" + num);
        }
    }
    public void usepriinner(){
        priinner pi = new priinner();
        pi.show();
    }



}
