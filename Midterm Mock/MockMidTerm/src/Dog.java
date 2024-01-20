public class Dog extends Animal{

    @Override
    public void eat(Food f) {
        this.setPower(this.getPower() + f.getPower());
    }
    public Dog(String name, int age){
        super(name, 200, age);
    }
    public void kick(Animal a){
        a.setPower(a.getPower() - 10);
    }
}
