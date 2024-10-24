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
//        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        double totalCost =0;

        String input;

        while(true){
            try{
                System.out.print("Enter the cost of the item or enter quit: ");
                input = reader.readLine();
                if(input.equals("quit")){
                    System.out.printf("The total price including VAT is: %.2f%n", totalCost);
                    break;
                }
                double cost = Double.parseDouble(input);

                System.out.print("Enter the VAT rate (%): ");
                String vatRatestr = reader.readLine();
                double vatRate = Double.parseDouble(vatRatestr);

                System.out.print("Enter the Quantity: ");
                String quantitystr = reader.readLine();
                int quantity = Integer.parseInt(quantitystr);

                Item item = new Item(cost,vatRate,quantity);
                items.add(item);

                totalCost+=item.calcTotalCost(cost,vatRate,quantity);

                System.out.printf("The total price for task 5 including VAT is: %.2f%n", totalCost);
            }
            catch (IOException e){
                System.out.println("Unhandled exception");
            }

        }

    }
}