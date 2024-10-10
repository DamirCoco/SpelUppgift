public class Weapon extends Item implements Equippable{
    private int damage;
    private int durability;

    public Weapon (String name, int weight, int goldValue, int damage, int durability){
        super(name, weight, goldValue);
        this.damage = damage;
        this.durability = durability;
    }

    public int getDamage(){
        return damage;
    }

    public int getDurability(){
        return durability;
    }
    public void setDurability(int durability){
        this.durability = durability;
    }

    public void attack(){
        if (durability > 0){
            System.out.println(getName() + "attack, dealing" + damage + "damage!");
            durability--;
            System.out.println(getName() + "durability is now:" + durability);
        } else {
            System.out.println(getName() + "is broken an can no longer be used!");
        }
    }

    @Override
    public void viewDetails(){
        super.viewDetails();
        System.out.println("Damage: " + damage);
        System.out.println("Durability: " + durability);
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
