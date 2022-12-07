package demo15_T;

public class j5_implement_interf_T<T> implements j5_interface_T<T>{  // 泛型接口的实现类也必须是子类
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
