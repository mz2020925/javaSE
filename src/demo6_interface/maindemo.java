package demo6_interface;

public class maindemo {
    public static void main(String[] args) {
        catchMiceOperator cmp = new catchMiceOperator();

        catchMice cm = new impleCatchMice();  // 左边接口引用 = 右边实例化实体类，不能直接 ”new 接口名“
        cmp.usecatchMice(cm);

        catchMice cm2 = cmp.getcatchMice();
        cm2.catchMouse();
    }
}
