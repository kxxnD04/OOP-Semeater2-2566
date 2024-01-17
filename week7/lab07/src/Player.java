public abstract class Player {
    private double ATK, EXP, HP, MP, Money;
    public double getATK(){
        return ATK;
    }
    public double getEXP(){
        return EXP;
    }
    public double getHP(){
        return HP;
    }
    public double getMP(){
        return MP;
    }
    public double getMoney(){
        return Money;
    }
    public void setATK(double ATK){
        this.ATK = ATK;
    }
    public void setEXP(double EXP){
        this.EXP = EXP;
    }
    public void setHP(double HP){
        this.HP = HP > 0 ? HP : 0.0;
    }
    public void setMP(double MP){
        this.MP = MP;
    }
    public void setMoney(double Money){
        this.Money = Money;
    }
    @Override
    public String toString(){
        return "HP : " + HP + " MP : " + MP + " ATK : " + ATK;
    }
    public abstract void attack(Player p);
    public abstract void attacked(double n);
}
