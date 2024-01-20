public abstract class Animal {
    private String name;
    private int power;
    private int age;
    public Animal(){
        this("", 0, 0);
    }
    public Animal(String name, int power, int age){
        this.age = age;
        this.name = name;
        this.power = power;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getPower(){
        return power;
    }
    public int getAge(){
        return age;
    }
    public abstract void eat(Food f);
    @Override
    public String toString(){
        return "Animal : name = "+name+", power = "+power+", age = "+age;
    }
    public boolean equals(Animal a){
        return this.age == a.age && this.name.equals(a.name);
    }
}
