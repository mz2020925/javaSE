package ex_extends_implements;

public class maindemo {
    public static void main(String[] args) {
        // 在这个demo中，我们创建了抽象类Person，两个抽象类Coach和Player继承它，另外创建了一个接口SpeakEnglish，
        // 然后创建了两个实体类basketballCoach和pingpangCoach再次继承抽象类Coach，同时实现那个接口，
        // 和创建了两个实体类basketballPlayer和pingpangPlayer再次继承抽象类Player，同时实现那个接口，
        // 最后在本主函数中new出这四个实体类。

        pingpangPlayer pp = new pingpangPlayer();
        pp.setName("zmz");
        pp.setAge(14);
        pp.eat();
        pp.sport();
        pp.speakEnglish();


        basketballPlayer bp = new basketballPlayer();
        bp.setName("zyy");
        bp.setAge(19);
        bp.eat();
        bp.sport();
        // bp.speakEnglish();  // 实体类basketballPlayer不需要实现接口，它和pingpangPlayer都继承Player类，但是后者需要实现接口。
    }
}
