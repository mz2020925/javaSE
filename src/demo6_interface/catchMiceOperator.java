package demo6_interface;

public class catchMiceOperator {
    public void usecatchMice(catchMice cm){
        cm.catchMouse();  // cm调用catchMouse方法不能是接口中的抽象方法，因为接口必须写实体类来实现并重写它的抽象方法。
    }
    public catchMice getcatchMice(){
        catchMice cm = new impleCatchMice();
        return cm;
    }
}
