package Others;

public class Visitor {
    private int age;
    private double money;
    private int height;

    public Visitor(int age, double money, int height){
        this.age = age;
        this.money = money;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public int getHeight() {
        return height;
    }
}
