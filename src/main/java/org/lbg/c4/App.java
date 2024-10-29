package org.lbg.c4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;


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

        while(true) {
            double cost = costPrompt.printPrompt();
            if(cost == -1){
                System.out.println("We are quitting your application , your total cost for today is: " + totalCostWithVat);
                break;
            }
            double vatRate = vatPrompt.printPrompt();
            double quantity = quantityPrompt.printPrompt();

            Item item = new Item(cost,vatRate,(int)quantity);
            items.add(item);

            totalCostWithVat = totalCostWithVat + item.calcTotalCost(cost,vatRate,(int)quantity);
            System.out.printf("The total price for task 5 including VAT is: %.2f%n", totalCostWithVat);

        }










    }
}