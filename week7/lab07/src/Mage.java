public class Mage extends Player{
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player p) {
        p.attacked(this.getATK()*2.5);
        this.setMP(this.getMP() - 5);
    }
    @Override
    public void attacked(double n) {
        this.setHP(this.getHP() - n);
    }
    public Mage(){
        super.setATK(5.0);
        super.setHP(10.0);
        super.setMP(20.0);
    }
}
