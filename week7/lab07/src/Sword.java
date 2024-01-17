public class Sword extends Item{
    @Override
    public void use(Player p) {
        p.setATK(p.getATK() + 10);
    }
}
