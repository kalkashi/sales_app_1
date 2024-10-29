package org.lbg.c4;

public class VatPrompt implements Prompt {

    @Override
    public double printPrompt() {
        System.out.println("Enter vat rate");
        return Double.parseDouble(scanner.nextLine());
    }

}