package org.lbg.c4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        List<Item> items = new ArrayList<>();
        double totalCostWithVat = 0;

        Prompt costPrompt = new CostPrompt();
        Prompt vatPrompt = new VatPrompt();
        Prompt quantityPrompt = new QuantityPrompt();

        Scanner scanner = new Scanner(System.in);

        Reader costReader = new CostReader(scanner);

        // reader for vat + quantity
        Reader combinedReader = new CombinedReader(scanner);


        while(true) {
            double cost = costReader.readStuff(costPrompt);
            if(cost == -1){
                System.out.println("We are quitting your application , your total cost for today is: " + totalCostWithVat);
                break;
            }
            double vatRate = combinedReader.readStuff(vatPrompt);
            double quantity = combinedReader.readStuff(quantityPrompt);

            Item item = new Item(cost,vatRate,(int)quantity);
            items.add(item);

            totalCostWithVat = totalCostWithVat + item.calcTotalCost(cost,vatRate,(int)quantity);
            System.out.printf("The total price for task 5 including VAT is: %.2f%n", totalCostWithVat);

        }










    }
}