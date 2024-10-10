public class Armour extends Item implements Equippable{
    private int defense;
    private String armorType;

    public Armour(String name, int weight, int goldenValue, int defense, String armorType){
        super(name,weight,goldenValue);
        this.defense = defense;
        this.armorType = armorType;
    }

    public int getDefense(){
        return defense;
    }

    public String getArmorType(){
        return armorType;
    }

    public void enchant(){
        System.out.println(getName() + "is being enchanted...");
        defense += 10;
        if (!armorType.equalsIgnoreCase("Magical")){
            armorType = "Magical";
        }
        System.out.println(getName() + "is now enchanted! New defense: " + defense + "Type:" + armorType);

        }
    @Override
    public void viewDetails() {

        super.viewDetails();
        System.out.println("Defense: " + defense);
        System.out.println("Armor type: " + armorType);
        }

    @Override
    public void equip(){
        System.out.println(getName() + "Has been equipped");
    }
    @Override
    public void unEquip(){
        System.out.println(getName() + "Has been unequipped");
    }

    }

