public class Potion extends Item{
    @Override
    public void use(Player p) {
        p.setHP(p.getHP() + 10);
    }
}
