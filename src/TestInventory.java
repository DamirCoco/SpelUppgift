public class TestInventory {
    public static void main(String[] args){
        Inventory inventory = new Inventory();

        Weapon sword = new Weapon("Iron Sword", 10,150,25,40);
        Armour helmet = new Armour("Steel helmet", 5,100,15, "Heavy");
        Consumable healthPotion = new Consumable("health potion", 1,50,"heals 50 hp", 5);

        inventory.addItem(sword);
        inventory.addItem(helmet);
        inventory.addItem(healthPotion);

        System.out.println("Current items in inventory:");
        inventory.displayItems();

        System.out.println("Using the sword:");
        sword.attack();

        System.out.println("Enchanting the helmet:");
        helmet.enchant();

        System.out.println("Using the health potion:");
        healthPotion.viewDetails();

        System.out.println("Removing the steel helmet from inventory");
        inventory.deleteItem("steel helmet");

        System.out.println("Current items in inventory after removal");
        inventory.displayItems();

        System.out.println("Selling Iron sword from invetory..");
        inventory.vendorItem("iron sword");

        System.out.println("Current items in inventory after selling the iron sword");
        inventory.displayItems();
    }
}
