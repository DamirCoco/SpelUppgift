public class MagicCake extends Consumable{
    private int healthProvided;
    private int manaProvided;

    public MagicCake(String name, int wieght, int goldValue, String effect, int duration, int healthProvided, int manaProvided){
        super(name, wieght, goldValue, effect, duration);
        this.healthProvided = healthProvided;
        this.manaProvided = manaProvided;

    }
    public void restoreHealthOverTime(){
        System.out.println(getName() + "Restore " + healthProvided + "health points over" + getDuration() + "seconds");
    }

    public void restoreManaOverTime(){
        System.out.println(getName() + "Restore " + manaProvided + "mana points over" + getDuration() + "seconds");

    }

    public void use(){
        System.out.println("using" + getName() + "...");
        restoreHealthOverTime();
        restoreManaOverTime();
    }

    @Override
    public void viewDetails(){
        super.viewDetails();
        System.out.println("health provided : " + healthProvided );
        System.out.println("mana provided " + manaProvided );
    }

}
