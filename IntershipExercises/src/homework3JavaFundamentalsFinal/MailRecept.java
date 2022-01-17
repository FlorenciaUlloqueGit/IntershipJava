package homework3JavaFundamentalsFinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MailRecept extends Receipt{
    private String email;

    public MailRecept(List<Item> itemList, String email) {
        super(itemList);
        this.email = email;
    }

    @Override
    public void print(ArrayList lista) {

        System.out.println("Sending receipt to email: " + email);
        try {
            super.printItems(lista);
        }catch (Exception e){
            System.out.println("Error sending receipt on an email due to  " + e.getMessage() );
        }

    }

}
