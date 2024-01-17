public class Rod extends Item{
    @Override
    public void use(Player p) {
        p.setATK(p.getATK() + 5);
    }
}
