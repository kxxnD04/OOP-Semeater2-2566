public abstract class Vehicle implements Dieselable {
    protected double fuel;
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return fuel;
    }
    public void addFuel(double fuel){
        if (fuel <= 0){
            System.out.println("Fuel is empty.");
        }else{
            this.fuel += fuel;
        }
    }
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    public Vehicle(){
        this.fuel = 0.0;
    }
    public abstract void honk();
}
