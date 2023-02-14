package be.intecbrussel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        System.out.println("---- Oefening - 1 ----");
        // 1. Lees een postnummer in en druk de naam van de overeenkomstige stad af, aan de hand van volgende tabel:
        int[] postalNumber = {9300, 2000, 1000, 9200, 9000, 8500, 9700, 2300}; // -> 8 places 7 indexes
        Scanner sc = new Scanner(System.in);

        System.out.println("Geef een postnummer aan!");
        int input = sc.nextInt();
        boolean isFound = false;

        for (int postNumCheck : postalNumber) {
            if (input == postNumCheck) {
                isFound = true;
            }
        }

        if (isFound) {
            switch (input) {
                case 9300 -> {
                    System.out.println("Postal code " + postalNumber[0] + " corresponds to " + "Aalst.");
                }
                case 2000 -> {
                    System.out.println("Postal code " + postalNumber[1] + " corresponds to " + "Antwerpen.");
                }
                case 1000 -> {
                    System.out.println("Postal code " + postalNumber[2] + " corresponds to " + "Brussel.");
                }
                case 9200 -> {
                    System.out.println("Postal code " + postalNumber[3] + " corresponds to " + "Dendermonde.");
                }
                case 9000 -> {
                    System.out.println("Postal code " + postalNumber[4] + " corresponds to " + "Gent.");
                }
                case 8500 -> {
                    System.out.println("Postal code " + postalNumber[5] + " corresponds to " + "Kortrijk.");
                }
                case 9700 -> {
                    System.out.println("Postal code " + postalNumber[6] + " corresponds to " + "Oudenaarde.");
                }
                case 2300 -> {
                    System.out.println("Postal code " + postalNumber[7] + " corresponds to " + "Turnhout.");
                }
            }
        } else {
            System.out.println("Postal code " + input + " not found in our data base!");
        }

        System.out.println("---- Oefening - 2 ----");
        // 2. Je ziet hieronder 2 arrays en deze moet je met elkaar optellen en uitprinten in een grid.
        int[][] aArr = {
                {1, 3, 4},
                {3, 4, 5}
        };

        int[][] bArr = {
                {1, 3, 4},
                {3, 4, 5}
        };

        int[][] result = new int[2][3];

        for (int rows = 0; rows < aArr.length; rows++) {
            for (int colums = 0; colums < aArr[rows].length; colums++) {
                    result[rows][colums] = aArr[rows][colums] + bArr[rows][colums];
                System.out.print(result[rows][colums] + " ");
            }
            System.out.println();
        }

        System.out.println("---- Oefening - 3 ----");
        String[][] veld = new String[10][10];
        Random random = new Random();

        int inputRow = 0;
        int inputColumn = 0;
        int eggRow = random.nextInt(0, 10);
        int eggColumn = random.nextInt(0,10);

        for (int i = 0; i < veld.length; i++) {
            Arrays.fill(veld[i], "-");
        }

        System.out.println("---- Egg Hunt Game ----");

        for (int i = 0; i < veld.length; i++) {
            System.out.print("Enter a row -> ");
            inputRow = sc.nextInt();

            if (inputRow > eggRow) {
                System.out.println("The egg is located more to the North.");
            } else if (inputRow < eggRow) {
                System.out.println("The egg is located more to the South.");
            }

            System.out.print("Enter a column -> ");
            inputColumn = sc.nextInt();

            if (inputColumn > eggColumn) {
                System.out.println("The egg is located more to the West.");
            } else if (inputColumn < eggColumn) {
                System.out.println("The egg is located more to the East.");
            }

            if (inputRow == eggRow && inputColumn == eggColumn) {
                System.out.println("Congratulations! You have found the egg!");
                veld[inputRow][inputColumn] = "!";
                for (int rows = 0; rows < veld.length; rows++) {
                    for (int columns = 0; columns < veld[rows].length; columns++ ) {
                        System.out.print(veld[rows][columns] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                break;
            }

            veld[inputRow][inputColumn] = "x";

            for (int rows = 0; rows < veld.length; rows++) {
                for (int columns = 0; columns < veld[rows].length; columns++ ) {
                    System.out.print(veld[rows][columns] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
