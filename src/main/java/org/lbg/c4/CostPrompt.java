package org.lbg.c4;

public class CostPrompt implements Prompt {

    @Override
    public double printPrompt() {
        System.out.println("Enter cost or type quit");
        String s = scanner.nextLine();
        if(s.equals("quit")){
            return -1;
        }

        return Double.parseDouble(s);
    }

}
