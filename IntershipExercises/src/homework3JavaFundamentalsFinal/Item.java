package homework3JavaFundamentalsFinal;

public class Item {
    private String brand;
    private String name;
    private int price;
    private boolean printeable;

    public Item(String brand, String name, int price, boolean printeable) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.printeable = printeable;
    }

    public Item(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public boolean isPrinteable() {
        return printeable;
    }

    @Override
    public String toString() {
        return "Item: brand= " + brand  + "| name= " + name + "| price= " + price;
    }
}
