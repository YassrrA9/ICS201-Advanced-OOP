package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a String :");
        String string = kb.nextLine();
        System.out.println("Enter a character to count :");
        char c = kb.next().charAt(0);
        kb.close();
        int count = count(string,c);
        System.out.println("Number of occurrence ("+c+") in "+string+": "+count);




    }

    public static int count(String string, char c) {
        if (string.length() == 0)
            return 0;
        else if (string.charAt(0) == c)
            return 1 + count(string.substring(1), c);
        else
            return count(string.substring(1), c);
    }
}
