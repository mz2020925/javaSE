package demo2_multiState;

public class animal {
    private String food;

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void eat(){
        System.out.println("父类吃"+this.food);
    }

}
