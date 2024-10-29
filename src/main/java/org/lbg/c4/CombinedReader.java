package org.lbg.c4;
import java.util.Scanner;

public class CombinedReader implements Reader {
    private final Scanner scanner;
    public CombinedReader(Scanner scanner){
        this.scanner = scanner;
    }
    @Override
    public  double readStuff(Prompt prompt) {
        System.out.println(prompt.printPrompt());
        return Double.parseDouble(scanner.nextLine());
    }

}
