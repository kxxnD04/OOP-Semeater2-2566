public class Novice extends Player{
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player p) {
        p.attacked(this.getATK());
    }
    @Override
    public void attacked(double n) {
        this.setHP(this.getHP() - n);
    }
    public Novice(){
        super.setATK(5.0);
        super.setHP(10.0);
        super.setMP(10.0);
    }
}
