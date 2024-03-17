
import java.io.Serializable;

public class Book implements Serializable{
    private String name;
    private double price;
    private String type;
    public Book() {
        this("", 0.0, "");
    }
    public Book(String name, Double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}
