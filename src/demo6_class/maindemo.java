package demo6_class;

public class maindemo {
    public static void main(String[] args) {
        catOperator co = new catOperator();
        cat c = new cat();
        co.usecat(c);

        cat c1 = co.getcat();
        c1.eat();
    }


}
