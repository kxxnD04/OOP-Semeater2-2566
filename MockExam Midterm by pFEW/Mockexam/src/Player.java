public class Player {
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    private final int attackDamage = 2;
    private final String name;
    public Player(){
        houses = null;
        name = "";
    }
    public Player(String name){
        this.name = name;
        houses = null;
    }
    public Player(String name, int hp){
        houses = null;
        this.name = name;
        this.hp = hp;
    }
    public Houses getHouses(){
        return houses;
    }
    public void setHouses(Houses houses){
        this.houses = houses;
    }
    public int getHP(){
        return hp;
    }
    public void setHP(int hp){
        this.hp = Math.min(20, Math.max(0, hp));
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        this.mana = Math.min(50, Math.max(0, mana));
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "[Player] : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses; 
    }
    public boolean equals(Player player){
        return this.getName().equals(player.getName()) && this.getHouses().equals(player.getHouses());
    }
    public void attack(Player target, Spell spell){
        if (houses.getName().equals("Gryffindor")){
            ((Gryffindor)this.houses).attackSpell(this, target, spell);
        }else{
            ((Hufflepuff)this.houses).attackSpell(this, target, spell);
        }

        if (target.getHP() == 0){
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + name);
        }
    }
    public void protectFromPlayer(Player target){
        if (houses.getName().equals("Gryffindor")){
            ((Gryffindor)this.houses).defense(this, target);
        }else{
            ((Hufflepuff)this.houses).defense(this, target);
        }        
    }
}
