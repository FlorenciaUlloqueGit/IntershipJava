package homework3JavaFundamentalsFinal;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Item item1 = new Item("Maybelline", "rimmel big shot", 1350, true );
        Item item2 = new Item("Rimmel", "rimmel lash extreme", 1200, true );
        Item item3 = new Item("Katalia", "jojoba mask", 600, false);
        Item item4 = new Item("Idi", "Volumen and long", 950, true );

        List<Item> listaItemsMail = new ArrayList<>();
        listaItemsMail.add(item1);
        listaItemsMail.add(item2);

        List<Item> listaPaperItems = new ArrayList<>();
        listaPaperItems.add(item3);
        listaPaperItems.add(item4);
        MailRecept mailRecept = new MailRecept( listaItemsMail, "carozo@gmail.com");
        PaperReceipt paperReceipt = new PaperReceipt(listaPaperItems);

        mailRecept.print((ArrayList) listaItemsMail);


        System.out.println("-------------------------------------------------------------------");
        paperReceipt.print((ArrayList) listaPaperItems);




    }
}
