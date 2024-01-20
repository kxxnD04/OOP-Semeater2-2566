public class Pigeous extends Bird{
    public Pigeous(){
        super("", 0);
    }
    public Pigeous(String name, int age){
        super(name, age);
    }
    @Override
    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }
    public void wingAttack(Animal a, int times) {
        a.setPower(a.getPower() - 5*times);
    }
    @Override
    public void eat(Food f) {
        super.setPower(f.getPower() * 2 + super.getPower());
    }

    @Override
    public void fly() {
        System.out.println(super.getName()+" fly fly ....");
    }
}
