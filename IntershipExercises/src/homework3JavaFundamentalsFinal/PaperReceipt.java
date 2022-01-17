package homework3JavaFundamentalsFinal;

import java.util.ArrayList;
import java.util.List;

public class PaperReceipt extends Receipt{
    private final String PAPER_TYPE = "A4";


    public PaperReceipt(List<Item> itemList) {
        super(itemList);
    }

    @Override
    public void print(ArrayList lista) {


        try {
            System.out.println("printing receipt in " +  PAPER_TYPE);
            super.printItems(lista);
        }catch (Exception e){
            System.out.println("Error printing receipt to paper due to   " + e.getMessage() );
        }


    }
}
