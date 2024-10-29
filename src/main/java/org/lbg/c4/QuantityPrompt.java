package org.lbg.c4;

public class QuantityPrompt implements Prompt {

    @Override
    public double printPrompt() {
        System.out.println("Enter quantity");
        return Double.parseDouble(scanner.nextLine());
    }

}