public abstract class Houses {
    private String color;
    private String name;
    public Houses(){
        this("", "");
    }
    public Houses (String name, String color){
        this.name = name;
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "[House] : " + name + " , Color : " + color;
    }
}
