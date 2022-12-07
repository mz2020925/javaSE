package demo15_T;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class j5_demo {
    public static void main(String[] args) {
        // 1.泛型接口，及其实现类的示例
        j5_interface_T<String> j5InterfaceT = new j5_implement_interf_T<>();
        j5InterfaceT.show("zmz");

        j5_interface_T<Integer> j5InterfaceT2 = new j5_implement_interf_T<>();
        j5InterfaceT2.show(2089);

        // 2.通配符?，通配符不是用在修饰类、接口或者方法的，不能说有个通配符类，通配符方法。通配符是这么用的：
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<String>();
        List<?> list3 = new ArrayList<Number>();
        List<?> list4 = new ArrayList<Integer>();

        // 2.1通配符? 带上限
        List<? extends Number> list5 = new ArrayList<Integer>();
        List<? extends Number> list6 = new ArrayList<Double>();
        List<? extends Number> list7 = new ArrayList<Float>();
        List<? extends Number> list8 = new ArrayList<Number>();
        // List<? extends Number> list9 = new ArrayList<Object>();  // 这样就报错了

        // 2.1通配符? 带下限
        List<? super Integer> list9 = new ArrayList<Object>();
        List<? super Integer> list10 = new ArrayList<Number>();
        List<? super Integer> list12 = new ArrayList<Integer>();
        // List<? extends Number> list13 = new ArrayList<Object>();  // 这样就报错了



    }
}
