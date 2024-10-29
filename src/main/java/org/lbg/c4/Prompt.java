package org.lbg.c4;

import java.util.Scanner;

public interface Prompt {
    Scanner scanner = new Scanner(System.in);
    double printPrompt();
}
