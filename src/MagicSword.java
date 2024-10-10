public class MagicSword extends Weapon implements Equippable, Usable{
    private int mana;
    private int swingCount;


  public MagicSword(String name, int weight, int goldValue, int damage, int durability, int mana){
      super(name, weight, goldValue, damage, durability);
      this.mana = mana;
      this.swingCount = 0;
  }

  public void everyFifthSwingShootFireball(){
      if(swingCount > 0 && swingCount % 5 == 0){
          System.out.println(getName() + "shoot a fireball" + mana + "mana!");
      }
  }

  @Override
    public void attack(){
      if (getDurability() > 0){
          System.out.println(getName() + "attack , dealing" + getDamage() + "damage");
          swingCount ++;
          setDurability(getDurability() -1);
          System.out.println(getName() + "Durability is now: " + getDurability());

          everyFifthSwingShootFireball();
      } else {
          System.out.println(getName() + "Is broken and can no longer be used!");
      }
  }

  @Override
    public void equip(){
      System.out.println(getName() + "has been equipped");
  }

  @Override
    public void unEquip(){
      System.out.println(getName() + "has been unequipped");

  }
    @Override
    public void use(){
        System.out.println( "using " + getName() + "in combat");
        attack();

    }

    @Override
    public void viewDetails(){
      super.viewDetails();
        System.out.println("mana:" + mana);

    }


}
