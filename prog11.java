/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class prog11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("How many euros are you exchanging? ");
        int euros = in.nextInt();
        System.out.print("What is the exchange rate? ");
        double exchange = in.nextDouble();

        double dollars = euros * exchange;

        System.out.println(euros + " euros at an exchange rate of " + exchange + " is " + df.format(dollars) + " U.S. dollars.");

    }
}
