//привет!!!
package org.example;

import java.util.Scanner;

public class FriendsAndFamilly {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n Enter list price: ");
            double listPrice = input.nextDouble();

            System.out.println(" Enter discount %: ");
            int discount = input.nextInt();

            System.out.printf(" You'll pay only rub%2.2f", listPrice + listPrice * discount / 100);

        } while (true);
    }
}

