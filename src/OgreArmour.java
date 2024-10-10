public class OgreArmour extends Armour implements Equippable{
    private int stamina;
    private int strength;

    public OgreArmour (String name, int weight, int goldValue, int defense, String armorType, int stamina, int strength){
        super( name, weight, goldValue, defense, armorType);
        this.stamina = stamina;
        this.strength = strength;

    }

    public int getStamina(){
        return stamina;
    }

    public int getStrength(){
        return strength;
    }

    @Override
    public void equip(){
        System.out.println(getName() + "has been equipped. Stamina:" + stamina + ", Strength" + strength);
    }

    @Override
    public void unEquip(){
        System.out.println(getName() + "has been unequipped");
    }

    @Override
    public void viewDetails(){
        super.viewDetails();
        System.out.println("Stamina:" + stamina );
        System.out.println("Strength:" + strength );
    }
}
