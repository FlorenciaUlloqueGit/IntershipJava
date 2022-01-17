package homework3JavaFundamentalsFinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Receipt implements Printeable{
    private List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Receipt(List<Item> itemList) {
        this.itemList = new ArrayList<>();
    }

    public ArrayList printItems(ArrayList Lista) {
        int cont = 0;
        itemList = Lista;
        if(!itemList.isEmpty()){
            for (Item item: itemList) {

                if(item.isPrinteable() == true){
                    System.out.println(item.toString());
                    cont++;
                }
            }
            if(cont == 0){
                System.out.println("Receipt has no printable items");
            }

        }else{
            Exception e = new NullPointerException();
            System.out.println(    e.toString());
            System.out.println("Receipt has no items");
        }

        return (ArrayList) itemList;
    }
}
