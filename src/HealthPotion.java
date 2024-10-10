public class HealthPotion extends Consumable {
    private int healthProvided;

    public HealthPotion(String name, int weight, int goldValue, String effect, int duration, int healthProvided){
        super(name, weight,goldValue,effect,duration);
        this.healthProvided = healthProvided;
    }
    public void restoreHealth(){
        System.out.println(getName() + " restores " + healthProvided + " health point ");
    }

    @Override
    public void use(){
        super.use();
        restoreHealth();
    }
}
