public abstract class Item {
    private String name;
    private int weight;
    private int goldValue;


    public Item(String name, int weight, int goldValue){
        this.name = name;
        this.weight = weight;
        this.goldValue = goldValue;
    }

    public void viewDetails(){
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
        System.out.println("Gold Value:" + goldValue);
    }

    public String getName(){
        return name;
    }

    public int getGoldValue(){
        return goldValue;
    }


}
