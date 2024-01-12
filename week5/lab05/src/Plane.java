public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly() {
        System.out.println(getFuel() >= 200 ? "Fly." : "Please add fuel.");
        if (getFuel() >= 200) {
            setFuel(getFuel() - 200);
        }
    }

    public void showPlaneInfo() {
        System.out.println("Plane detail is, " + "Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
}
