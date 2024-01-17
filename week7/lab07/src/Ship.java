public class Ship extends Vehicle implements  Floatable{
    public Ship(double fuel){
        super(fuel);
    }
    public Ship(){
        super();
    }
    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
    @Override
    public void startEngine() {
        if (super.getFuel() >= 10){
            super.setFuel(super.getFuel() - 10);
            System.out.println("Engine starts");
        }else {
            System.out.println("Fuel is not enough.");
        } 
    }
    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }
    @Override
    public void fl0at() {
        if (super.getFuel() >= 50){
            super.setFuel(super.getFuel() - 50);
            System.out.println("Ship moves");
        }else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void move(){
        this.fl0at();
    }
    public void move(int distance){
        while (super.getFuel() >= 50 && distance != 0){
            this.move();
            distance--;
        }
        if (distance != 0){
            System.out.println("Fuel is not enough.");
        }
    }
}
