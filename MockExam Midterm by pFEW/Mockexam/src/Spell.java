public abstract class Spell {
    private int damage;
    private final String name;
    public Spell(){
        this("");
    }
    public Spell(String name){
        this.name = name;
    }
    public int getDamage(){
        return damage;
    }
    public String getName(){
        return name;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
}
