import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
        System.out.println(item.getName() + "Has been added to the inventory");
    }

    public void deleteItem(String name){
        boolean found = false;
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getName().equalsIgnoreCase(name)){
                System.out.println(items.get(i).getName()+ "has been removed from the inventory.");
                items.remove(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(name + " not found in the inventory");
        }
    }

    public void displayItems(){
        if(items.isEmpty()){
            System.out.println("The inventory is empty");
        } else {
            for (Item item : items){
                item.viewDetails();
                System.out.println("----------");
            }
        }
    }

    public int vendorItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(name)) {
                int goldValue = items.get(i).getGoldValue();
                System.out.println(items.get(i).getName() + "has been sold for" + goldValue + "gold");
                items.remove(i);
                return goldValue;
            }
        }
      System.out.println(name + "not found in the inventory");
        return 0;
    }




}
