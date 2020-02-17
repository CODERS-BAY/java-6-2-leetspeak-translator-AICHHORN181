package com.codersbay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] cChar = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'};
        Scanner input = new Scanner(System.in);
        String sString;

        System.out.println("Zeichenkette eingeben: ");
        sString = input.nextLine().toUpperCase();

        System.out.println();

        for (int i = 0; i < sString.length(); i++) {
            System.out.print(cChar[sString.charAt(i) - 'A']);
        }
    }

}
