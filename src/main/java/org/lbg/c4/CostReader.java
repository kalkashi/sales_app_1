package org.lbg.c4;
import java.util.Scanner;
public class CostReader implements  Reader{
    private final Scanner scanner;
    //CI
    public CostReader(Scanner scanner){
        this.scanner = scanner;
    }


    @Override
    public double readStuff(Prompt prompt) {
        System.out.println(prompt.printPrompt());
        String s = scanner.nextLine();
        if(s.equals("quit")){
            return -1;
        }
        return Double.parseDouble(s);

    }
}
