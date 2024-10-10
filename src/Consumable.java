public class Consumable extends Item implements Usable {
    private String effect;
    private int duration;

    public Consumable (String name, int weight, int goldValue, String effect, int duration){
        super(name, weight, goldValue);
        this.effect = effect;
        this.duration = duration;
    }

    public String getEffect(){
        return effect;
    }

    public int getDuration(){
        return duration;
    }

    @Override

    public void viewDetails(){
        super.viewDetails();
        System.out.println("Effect: " + effect);
        System.out.println("Duration " + duration + "seconds");
    }

    @Override
    public void use(){
        System.out.println(getName() + "Has beenused. Effect: " + effect + "for" + duration + "seconds");
    }

}
